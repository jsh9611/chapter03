package paint;

public class Triangle extends Shape{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	

	@Override          // 오버라이드가 되는지 안되는지 컴파일러가 확인해줌.마킹만
	public void draw() {
		
		System.out.println("삼각형을 그렸습니다.");
		
	}



}
