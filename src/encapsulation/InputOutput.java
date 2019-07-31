package encapsulation;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class InputOutput {
	

	public static void main(String[] args) {
		
		try {
			FileOutputStream   oo=new FileOutputStream("D:\\test_titus.txt");
			BufferedOutputStream bf=new BufferedOutputStream(oo);
			String s="welcome";
			byte b[]=s.getBytes();
			bf.write(b);
			bf.flush();
			oo.close();
			System.out.println("success");
		}
		
		catch(Exception e) {
			
			
		}
		
	}

}
