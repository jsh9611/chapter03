package paint;

public class Point implements Drawable{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public Point() {
		System.out.println("Point() 호출");
	}
	public Point(int x, int y) {   // int (valueX, int valueY)
	//	x = x; 이러면 자기꺼에 자기꺼 넣는거되어버림. this가 객체라는거
		this.x = x;                // x = valueX;
		this.y = y;			 	   // y = valueY;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		
		return y; // return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show() {
		System.out.println("점[" + x + ", " + y + "]을 그렸습니다.");
	}
	
	public void show(boolean visible) {
		if(visible) {                                    // if(visible == true) 는 바보같다.
			show();
		} else {
			System.out.println("점[" + x + ", " + y + "]을 지웠습니다.");
		}
	}

	@Override
	public void draw() {
		show();
	}
}	