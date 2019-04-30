package practice;
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
public class StringTest1 {
public static void main(String args[]) throws Exception
{
	FileOutputStream fos = new FileOutputStream("java.txt");
	String str = "javac vsp.java";
	byte[] b = str.getBytes();
	fos.write(b);
	System.out.println("File Created");
	FileOutputStream fos1 = new FileOutputStream("vsp.java");
	
	FileInputStream fis = new FileInputStream("java.txt");
	
	/*byte[] b1 = new byte((byte) fis.available());
	fis.read(b1);
	String s = new String(b1);
	System.out.println(s);*/
	 System.out.println("Bytes to be read " + fis.available());
	 int n = fis.read();
	 while(n != -1)
	 {
		 
		 if((char)n == 'J')
		 {
			 System.out.print("VSPJ");System.out.print((char)n);
		 }
		 else{
			 System.out.print((char)n);
		 }
		 
		 n=fis.read();
		 Thread.sleep(200);
	 }
	
	
	
	
	
}
}
