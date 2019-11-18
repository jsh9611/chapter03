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

		Point p2 = new Point();
		p2.setX(50);
		p2.setY(100);
		drawPoint(p2);
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
}
