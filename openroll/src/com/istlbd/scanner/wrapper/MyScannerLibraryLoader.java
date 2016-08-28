/*    */ package com.istlbd.scanner.wrapper;
/*    */ 
/*    */ import com.sun.jna.Native;
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ 
/*    */ public class MyScannerLibraryLoader
/*    */ {
/* 21 */   private static Object myLib = null;
/*    */ 
/*    */   private static void loadFromJar()
/*    */   {
/* 30 */     String path = "TIGERSCANNER";
/*    */ 
/* 32 */     loadLib(path, "JTwain", false);
/*    */   }
/*    */ 
/*    */   private static void loadLib(String path, String name, boolean dependency)
/*    */   {
/* 37 */     String toLoad = name;
/* 38 */     name = name + ".dll";
/*    */     try
/*    */     {
/* 43 */       InputStream in = MyScannerLibraryLoader.class.getResourceAsStream("/nativelib/" + name);
/* 44 */       File fileOut = new File(System.getProperty("java.io.tmpdir") + "/" + path + "/nativelib/");
/* 45 */       if (!fileOut.exists())
/*    */       {
/* 47 */         fileOut.mkdirs();
/*    */       }
/*    */ 
/* 50 */       fileOut = new File(System.getProperty("java.io.tmpdir") + "/" + path + "/nativelib/" + name);
/* 51 */       if (!fileOut.exists())
/*    */       {
/* 53 */         fileOut.createNewFile();
/*    */       }
/* 55 */       OutputStream out = new FileOutputStream(fileOut);
/*    */ 
/* 57 */       IOUtils.copy(in, out);
/* 58 */       in.close();
/* 59 */       out.close();
/* 60 */       if (dependency) {
/* 61 */         System.load(fileOut.toString());
/*    */       }
/*    */       else {
/* 64 */         System.load(fileOut.toString());
/* 65 */         myLib = Native.loadLibrary(toLoad, TwainLibrary.class);
/*    */       }
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 70 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public static TwainLibrary getTwainLibrary()
/*    */   {
/* 76 */     if (myLib == null) return null;
/* 77 */     return (TwainLibrary)myLib;
/*    */   }
/*    */ 
/*    */   static
/*    */   {
/*    */     try
/*    */     {
/* 24 */       myLib = Native.loadLibrary("JTwain", TwainLibrary.class); } catch (UnsatisfiedLinkError e) { loadFromJar(); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           E:\projects\production\STANDALONES\flatbedscanner\scanner jars\Scanner.jar
 
 * JD-Core Version:    0.6.2
 */