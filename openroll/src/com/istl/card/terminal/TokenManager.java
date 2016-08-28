/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.terminal;

import com.istl.card.ReaderListener;
import com.istl.card.Utility;
import com.istl.card.data.parser.CardDataParser;
import com.istl.card.data.structure.CardDataStructure;
import com.istl.card.model.TLVPos;
import com.istl.card.reader.CardDataReader;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.smartcardio.Card;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;
import javax.smartcardio.TerminalFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TokenManager implements ITokenManager
{
    private ReaderListener readerListener;
    TerminalFactory factory = null;
    List<CardTerminal> terminals = null;
    CardTerminal activeTerminal = null;
    Card activeToken = null;
    CardDataReader activeDataReader = null;
    
    
    
    public TokenManager(ReaderListener listener)
    {
        readerListener = listener;
        activeDataReader = new CardDataReader();        
    }
    
    @Override
    public void init() throws Exception
    {
        factory = TerminalFactory.getDefault();
        terminals = factory.terminals().list();
    }
    
    @Override
    public void getReaderList() throws Exception
    {
        List<String> cardReaderList = new ArrayList();
        for(CardTerminal ct:terminals)
        {
            cardReaderList.add(ct.toString());
        }
        readerListener.refreshReaderList(cardReaderList);
    }
    
    @Override
    public void selectToken(int idx) throws Exception
    {
        activeTerminal = terminals.get(idx);
        if(!activeTerminal.isCardPresent())
        {
            throw new Exception("No card present in terminal");
        }
        activeToken = activeTerminal.connect("*");        
        byte[] cmd = {(byte)0,(byte)202,(byte)2,(byte)70,(byte)16};
        ResponseAPDU answer = activeToken.getBasicChannel().transmit(new CommandAPDU(cmd));

        byte[] data = answer.getData();
        readerListener.cardSelected(Utility.byteArrayToHexString(data));
        activeDataReader.setReadCard(activeToken);
        
                
    }
    
    @Override
    public void readBiographicData() throws Exception
    {
        HashMap<String,byte[]> parsedRecords = new HashMap();
        HashMap<String,Object> updateRecords = new HashMap();
        
        String fileIDPath = CardDataStructure.DirectoriesInfo[0].getId()+CardDataStructure.DirectoriesInfo[1].getId()+CardDataStructure.ReadOnlyDataFilesInfo[6].getId();
        byte[] data = activeDataReader.readFile(fileIDPath,CardDataStructure.ReadOnlyDataFilesInfo[6].getSize());
        
        TLVPos tlvPos = new TLVPos();                
        if(CardDataParser.parseTlvEncodedData(data,CardDataStructure.ReadOnlyDataFilesInfo[6].getTag().getBytes("ASCII"), 0 , tlvPos))
        {
            byte[] newData = new byte[tlvPos.getValueLen()];
            System.arraycopy(data, tlvPos.getValueStarts(), newData, 0, tlvPos.getValueLen());
            CardDataParser.parseInfo(newData,CardDataStructure.ReadOnlyDataFilesInfo[6].getFields(),parsedRecords);            
        }
        
        Set<String> recordKeys = parsedRecords.keySet();        
        for(String _key:recordKeys)
        {                        
            if(
                    (_key.equalsIgnoreCase("NameBangla"))
                    ||
                    (_key.equalsIgnoreCase("Father"))
                    ||
                    (_key.equalsIgnoreCase("Mother"))                    
                    ||
                    (_key.equalsIgnoreCase("VoterAdd"))
              )
            {                                                         
                updateRecords.put(_key, new String(parsedRecords.get(_key),"UTF-16LE"));                        
            }else
            {                                              
                updateRecords.put(_key, new String(parsedRecords.get(_key)));                        
            }
        }
        
        
        parsedRecords = null;
        
        readerListener.biographicDataReady(updateRecords);
    }
    @Override
    public void readPhoto() throws Exception
    {
        HashMap<String,Object> photoMap = new HashMap();
        String fileIDPath = CardDataStructure.DirectoriesInfo[0].getId()+CardDataStructure.DirectoriesInfo[1].getId()+CardDataStructure.ReadOnlyDataFilesInfo[1].getId();
        byte[] data = activeDataReader.readFile(fileIDPath,CardDataStructure.ReadOnlyDataFilesInfo[1].getSize());        
        byte[] dgData = CardDataParser.parseDGData(data);        
        List<byte[]> photos = CardDataParser.parsePhoto(dgData);
        
        if( (photos!=null) && (photos.size()>0) )
        {
            byte[] jpgData = photos.get(0);
            BufferedImage bi = ImageIO.read(new ByteArrayInputStream(jpgData));            
            photoMap.put("photo", bi);            
        }
        
        readerListener.photoDataReady(photoMap);
    }
    
    @Override
    public void readExtendedBiographicData() throws Exception
    {
        HashMap<String,byte[]> parsedRecords = new HashMap();
        HashMap<String,Object> updateRecords = new HashMap();
        
        String fileIDPath = CardDataStructure.DirectoriesInfo[0].getId()+CardDataStructure.DirectoriesInfo[2].getId()+CardDataStructure.UpdatableDataFilesInfo[1].getId();
        byte[] data = activeDataReader.readFile(fileIDPath,CardDataStructure.UpdatableDataFilesInfo[1].getSize());
        
        TLVPos tlvPos = new TLVPos();                
        if(CardDataParser.parseTlvEncodedData(data,CardDataStructure.UpdatableDataFilesInfo[1].getTag().getBytes("ASCII"), 0 , tlvPos))
        {
            byte[] newData = new byte[tlvPos.getValueLen()];
            System.arraycopy(data, tlvPos.getValueStarts(), newData, 0, tlvPos.getValueLen());
            CardDataParser.parseInfo(newData,CardDataStructure.UpdatableDataFilesInfo[1].getFields(),parsedRecords);            
        }
        
        Set<String> recordKeys = parsedRecords.keySet();
        
        for(String _key:recordKeys)
        {            
            if( _key.equalsIgnoreCase("Qualification") || _key.equalsIgnoreCase("Profession") || _key.equalsIgnoreCase("VisIdenMark"))
            {
                updateRecords.put(_key, new String(parsedRecords.get(_key) , "UTF-16LE"));                        
            }else
            {
                updateRecords.put(_key, new String(parsedRecords.get(_key)));
            }
        }                
        
        parsedRecords = null;
        
        readerListener.extendedBiographicDataReady(updateRecords);
    }
    
    @Override
    public void readExtendedDemographicData() throws Exception
    {
        
    }
    
    @Override
    public void readRelationshipData() throws Exception
    {
        HashMap<String,byte[]> parsedRecords = new HashMap();
        HashMap<String,Object> updateRecords = new HashMap();
        
        String fileIDPath = CardDataStructure.DirectoriesInfo[0].getId()+CardDataStructure.DirectoriesInfo[2].getId()+CardDataStructure.UpdatableDataFilesInfo[2].getId();
        byte[] data = activeDataReader.readFile(fileIDPath,CardDataStructure.UpdatableDataFilesInfo[2].getSize());
        
        TLVPos tlvPos = new TLVPos();                
        if(CardDataParser.parseTlvEncodedData(data,CardDataStructure.UpdatableDataFilesInfo[2].getTag().getBytes("ASCII"), 0 , tlvPos))
        {
            byte[] newData = new byte[tlvPos.getValueLen()];
            System.arraycopy(data, tlvPos.getValueStarts(), newData, 0, tlvPos.getValueLen());
            CardDataParser.parseInfo(newData,CardDataStructure.UpdatableDataFilesInfo[2].getFields(),parsedRecords);            
        }
        
        Set<String> recordKeys = parsedRecords.keySet();
        
        for(String _key:recordKeys)
        {
            if(_key.equalsIgnoreCase("SpouseName"))
            {
                updateRecords.put(_key, new String(parsedRecords.get(_key) , "UTF-16LE"));                        
            }else
            {
                updateRecords.put(_key, new String(parsedRecords.get(_key)));
            }
        }
        
        parsedRecords = null;
        
        readerListener.relationshipDataReady(updateRecords);
    }
    
    @Override
    public void readSubscriptionData() throws Exception
    {
        HashMap<String,byte[]> parsedRecords = new HashMap();
        HashMap<String,Object> updateRecords = new HashMap();
        
        String fileIDPath = CardDataStructure.DirectoriesInfo[0].getId()+CardDataStructure.DirectoriesInfo[2].getId()+CardDataStructure.UpdatableDataFilesInfo[3].getId();
        byte[] data = activeDataReader.readFile(fileIDPath,CardDataStructure.UpdatableDataFilesInfo[3].getSize());
        
        TLVPos tlvPos = new TLVPos();                
        if(CardDataParser.parseTlvEncodedData(data,CardDataStructure.UpdatableDataFilesInfo[3].getTag().getBytes("ASCII"), 0 , tlvPos))
        {
            byte[] newData = new byte[tlvPos.getValueLen()];
            System.arraycopy(data, tlvPos.getValueStarts(), newData, 0, tlvPos.getValueLen());
            CardDataParser.parseInfo(newData,CardDataStructure.UpdatableDataFilesInfo[3].getFields(),parsedRecords);            
        }
        
        Set<String> recordKeys = parsedRecords.keySet();
        
        for(String _key:recordKeys)
        {
            ///System.out.println(_key+" = "+new String(parsedRecords.get(_key) , "UTF-8"));
            updateRecords.put(_key, new String(parsedRecords.get(_key) , "UTF-8"));                        
        }
        
        parsedRecords = null;
        
        readerListener.subscriptionDataReady(updateRecords);
    }
    
    @Override
    public void readFingerprintData() throws Exception
    {
        HashMap<String,byte[]> parsedRecords = new HashMap();
        HashMap<String,Object> updateRecords = new HashMap();
        
        String fileIDPath1 = CardDataStructure.DirectoriesInfo[0].getId()+CardDataStructure.DirectoriesInfo[1].getId()+CardDataStructure.ReadOnlyDataFilesInfo[2].getId();
        String fileIDPath2 = CardDataStructure.DirectoriesInfo[0].getId()+CardDataStructure.DirectoriesInfo[1].getId()+CardDataStructure.ReadOnlyDataFilesInfo[3].getId();
        
        byte[] data1 = activeDataReader.readFile(fileIDPath1,CardDataStructure.ReadOnlyDataFilesInfo[2].getSize());
        byte[] data2 = activeDataReader.readFile(fileIDPath2,CardDataStructure.ReadOnlyDataFilesInfo[3].getSize());
        
        TLVPos tlvPos = new TLVPos();                
        if(CardDataParser.parseTlvEncodedData(data1,CardDataStructure.ReadOnlyDataFilesInfo[2].getTag().getBytes("ASCII"), 0 , tlvPos))
        {
            byte[] newData = new byte[tlvPos.getValueLen()];
            System.arraycopy(data1, tlvPos.getValueStarts(), newData, 0, tlvPos.getValueLen());
            CardDataParser.parseInfo(newData,CardDataStructure.ReadOnlyDataFilesInfo[2].getFields(),parsedRecords);            
        }                
        
        tlvPos = new TLVPos();                
        if(CardDataParser.parseTlvEncodedData(data2,CardDataStructure.ReadOnlyDataFilesInfo[3].getTag().getBytes("ASCII"), 0 , tlvPos))
        {
            byte[] newData = new byte[tlvPos.getValueLen()];
            System.arraycopy(data2, tlvPos.getValueStarts(), newData, 0, tlvPos.getValueLen());
            CardDataParser.parseInfo(newData,CardDataStructure.ReadOnlyDataFilesInfo[3].getFields(),parsedRecords);            
        }
        
        Set<String> recordKeys = parsedRecords.keySet();        
        for(String _key:recordKeys)
        {           
                if(
                        _key.equalsIgnoreCase("PublicFingerCode1")
                        ||
                        _key.equalsIgnoreCase("PublicFingerCode2")
                        ||
                        _key.equalsIgnoreCase("SecuredFingerCode1")
                        ||
                        _key.equalsIgnoreCase("SecuredFingerCode2")
                   )
                {
                    byte[] b = parsedRecords.get(_key);
                    updateRecords.put(_key, new Integer(b[0]));
                }else
                {
                    byte[] b = parsedRecords.get(_key);
                    ByteBuffer bb = ByteBuffer.allocate(b.length);
                    bb.put(b);
                    updateRecords.put(_key, bb);
                    FileOutputStream fos = new FileOutputStream("G:/Hack/"+_key+".template");
                    fos.write(b);
                    fos.close();
                }                                
        }
        
        parsedRecords = null;
        
        readerListener.fingerprintDataReady(updateRecords);
    }

    @Override
    public void readDemographicData() throws Exception {
        
        HashMap<String,byte[]> parsedRecords = new HashMap();
        HashMap<String,Object> updateRecords = new HashMap();
        
        String fileIDPath = CardDataStructure.DirectoriesInfo[0].getId()+CardDataStructure.DirectoriesInfo[2].getId()+CardDataStructure.UpdatableDataFilesInfo[0].getId();
        byte[] data = activeDataReader.readFile(fileIDPath,CardDataStructure.UpdatableDataFilesInfo[0].getSize());
        
        TLVPos tlvPos = new TLVPos();                
        if(CardDataParser.parseTlvEncodedData(data,CardDataStructure.UpdatableDataFilesInfo[0].getTag().getBytes("ASCII"), 0 , tlvPos))
        {
            byte[] newData = new byte[tlvPos.getValueLen()];
            System.arraycopy(data, tlvPos.getValueStarts(), newData, 0, tlvPos.getValueLen());
            CardDataParser.parseInfo(newData,CardDataStructure.UpdatableDataFilesInfo[0].getFields(),parsedRecords);            
        }
        
        Set<String> recordKeys = parsedRecords.keySet();
        
        for(String _key:recordKeys)
        {               
            if(_key.equalsIgnoreCase("OtherAdd"))
            {
                updateRecords.put(_key, new String(parsedRecords.get(_key) , "UTF-16LE"));                        
            }else
            {
                updateRecords.put(_key, new String(parsedRecords.get(_key)));                        
            }
        }
        
        parsedRecords = null;
        
        readerListener.demographicDataReady(updateRecords);
    }

    

    
}
