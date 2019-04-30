package co.vsp.io;

import java.io.FileOutputStream;

public class FOSTest {
public static void main(String[] args) throws Exception{
	FileOutputStream fos = new FileOutputStream("java.txt");
	fos.close();
}
}
