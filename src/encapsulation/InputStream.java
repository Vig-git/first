package encapsulation;

import java.io.FileInputStream;

public class InputStream {

	public static void main(String[] args) {
		try {
			FileInputStream oo=new FileInputStream("D:\\test.txt");
			int q=oo.read();
			System.out.println((char)q);
			oo.close();
			
		}
		catch(Exception e){
			
		}
	}

}
