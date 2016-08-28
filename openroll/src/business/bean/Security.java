/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.bean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @Abdur Razzak 2016
 */
public class Security {
    boolean passStatus = false;
    
    public String convertMD5(String password) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());

        byte byteData[] = md.digest();

        // Convert the byte to hex format 
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
    
    public boolean cheeckPassword ( String userPass, String md5Pass ) {
        if ( userPass.equals(md5Pass) ) {
            passStatus = true;
        }
        else {
            passStatus = false;
        }
        
        return passStatus;
    }
}
