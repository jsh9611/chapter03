package paint;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint() {
		// super(); 부모의 기본 생성자를 쓰겠다라고 자동으로 명시.
	}
	
	public ColorPoint(int x, int y, String color) {
		// super(); 부모의 기본 생성자를 쓰겠다라고 자동으로 명시.
		
		//this.x = x; // 부모에서는 x가 private
//		setX(x);
//		setY(y);
		super(x, y); // 기본 생성자 호출 안함
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		//super.show();   // 완전 재구현. 부모 무시
		System.out.println("점[" + getX() + ", " + getY() + " color=" + color + "]을 그렸습니다.");
	
	}
	
	
}
