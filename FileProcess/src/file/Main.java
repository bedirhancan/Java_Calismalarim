package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		//FileOutputStream fileOutputStream=null;
		FileInputStream fileInputStream=null;
		try {
			//fileOutputStream=new FileOutputStream("test.txt",true);
			//fileOutputStream.write(77);
			//String metin="\nZeynep Kuş";
			//byte[] array=metin.getBytes();
			//fileOutputStream.write(array);
			
			fileInputStream=new FileInputStream("test.txt");
			String metin="";
			int okunan;
			while((okunan=fileInputStream.read())!= -1) {
				metin += (char) okunan;
			}
			System.out.println(metin);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileInputStream.close();
			}
			catch (IOException e) {
					System.err.println("Dosya I/O hatası oluştu");
					e.printStackTrace();
			}
		}
		System.out.println("Program kapanıyor..");
	}

}
