/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.sun.jna.FromNativeContext;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

/**
 *
 * @author User
 */
public class BufferPointer extends PointerType
{
        private boolean immutable;
        public BufferPointer() 
        { 
        }
        public BufferPointer(Pointer p) 
        { 
            ///setPointer(p); 
            immutable = true; 
        }
        /** Override to the appropriate object for INVALID_HANDLE_VALUE. */
        public Object fromNative(Object nativeValue, FromNativeContext context) 
        {            
            Object o = super.fromNative(nativeValue, context);
            System.out.println("fromNative Called >>>> "+o);
            return null;
        }
        public void setPointer(Pointer p) 
        {
            if (immutable)
                throw new UnsupportedOperationException("immutable reference");
            ////super.setPointer(p);
        }
}
