package paint;

//int abs(int number) {
//	if (number < 0) {
//		number = number * -1;
//	}
//	return number;
//}

public class PaintApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		drawPoint(p);

		Point p2 = new Point(50, 100);
		drawPoint(p2);
		
		//메소드 오버로딩 테스트
		p2.show();
		p2.show(false);
		p2.show(true);		
		
		//메소드 오버라이딩 테스트
		Point p3 = new ColorPoint();
		p3.setX(200);
		p3.setY(300);
		((ColorPoint)p3).setColor("red");
		//p3.setColor("red");
		drawPoint(p3);

		p3.show();
		
	}
	
	public static void drawPoint(Point point) {
		
		point.show();
	}
	
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		
//		colorPoint.show();
//	} drawPoint(p3);
}
