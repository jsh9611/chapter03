package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		
		System.out.println("Some Code 1");
		System.out.println("Some Code 2");
		System.out.println("Some Code 3");
		
		try {
			int result = 1000 / a;

		} catch(ArithmeticException ex) {
			
			// 1. 사과
			System.out.println("ㅈㅅ");
			
			// 2. 로그 남기기
			System.out.println(ex);
			
			// 3. 정상종료
			return;

			// 1, 2, 3번을 하지 못하면
			// 다음 코드라도 적어놓고 절대 catch블록을 비워놓지 말아야 한다.
			// ex.printStackTrace();
			
		}
		
		System.out.println("Some Code 4");
		System.out.println("Some Code 5");
		System.out.println("Some Code 6");
	}

}
