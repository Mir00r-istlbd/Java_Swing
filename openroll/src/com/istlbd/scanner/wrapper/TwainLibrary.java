package com.istlbd.scanner.wrapper;

import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;

public abstract interface TwainLibrary extends StdCallLibrary
{
  public abstract int isTwainAvailble();

  public abstract int getAvailableSources(PointerByReference paramPointerByReference, IntByReference paramIntByReference);

  public abstract void acquire(String paramString);

  public abstract void acquire2(String paramString, PointerByReference paramPointerByReference);
}

/* Location:           E:\projects\production\STANDALONES\flatbedscanner\scanner jars\Scanner.jar
 
 * JD-Core Version:    0.6.2
 */