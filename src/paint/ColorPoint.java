package paint;

public class ColorPoint extends Point {
	private String color;

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
