/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm.CSD550E;

import com.faisal.tm.LibraryLoader;
import com.faisal.tm.CSD550E.CSD200Library.CG4LedType;
import com.faisal.tm.CSD550E.CSD200Library.CG4ScannerType;
import com.faisal.tm.CSD550E.CSD200Library.ReturnCodes;
import com.sun.jna.Native;

/**
 *
 * @author User
 */
public class Test 
{
    static
    {
        Native.setProtected(true);
    }
    
    public static void main(String[] args)
    {
        int nRc;
        CSD200Library ll= null;
        
        try
        {
            ll= (CSD200Library)LibraryLoader.getLibrary("CG4EssentialsApi","com.faisal.tm.CSD550E.CSD200Library");
            nRc = ll.CG4_Main_DeInitialize();
            nRc = ll.CG4_Main_Initialize(502);
            
            if(nRc != CSD200Library.ReturnCodes.CG4_STATUS_OK)
            {
              System.out.println("3M Cogent CSD200 scanner initialization failed. Error Code: " + nRc);
            }
            else
            {
              nRc = ll.CG4_Controls_SetLEDs(CSD200Library.CG4LedType.CG4_LED_EXTEND, 1);
              nRc = ll.CG4_Capture_Calibration();
              if (nRc != CSD200Library.ReturnCodes.CG4_STATUS_OK)
              {
                System.out.println("3M Cogent CSD200 scanner calibration failed. Error Code: " +nRc);
              }
              ll.CG4_Controls_SetLEDs(CSD200Library.CG4LedType.CG4_LED_EXTEND, 0);
              System.out.println("3M Cogent CSD200 scanner initialization is success.");
             
              ///CG4_M_Main_GetConnectedScanner(CSD200Library.CG4MScannerExist.ByReference scannerExist);
              
              CSD200Library.CG4MScannerExist.ByReference scannerExist = new CSD200Library.CG4MScannerExist.ByReference();
              nRc = ll.CG4_M_Main_GetConnectedScanner(scannerExist);
              
              if (nRc != CSD200Library.ReturnCodes.CG4_STATUS_OK)
              {
                  System.out.println("Could not check scanner existence.");
              }else
              {
                  System.out.println(scannerExist.nDevConnected);
                  for(int i=0;i<scannerExist.nDevConnected;i++)
                  {
                      System.out.println(scannerExist.scannerType[i]);
                  }
              }
            }
            
            Thread.sleep(10000);
            
            ////nRc = ll.CG4_Main_DeInitialize();
            
        }catch(Exception exc)
        {
            exc.printStackTrace();
        }finally
        {
            if(ll!=null)
            {
                ll.CG4_Main_DeInitialize();
            }
        }
    }
}
