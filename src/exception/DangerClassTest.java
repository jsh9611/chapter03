package exception;

import java.io.IOException;

public class DangerClassTest {

	public static void main(String[] args) {
		DangerClass dc = new DangerClass();
		try {
			System.out.println("예외 발생 전");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();			
		}
		

	}

}
