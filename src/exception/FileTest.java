package exception;

import java.io.FileInputStream; // ctrl + shift + o
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args)  { 
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("hello.txt");
			int data = fis.read();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.: " + e);
			return;
		} catch (IOException e) {
			System.out.println("에러: " + e);
			return;
		} finally {
			System.out.println("자원정리");
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
