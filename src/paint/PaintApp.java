package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		// drawPoint(p);
		draw(p);

		Point p2 = new Point(50, 100);
		// drawPoint(p2);
		draw(p2);

		// 1. 메소드 오버로딩 테스트
		p2.show();
		p2.show(false);
		p2.show(true);

		// 2. 메소드 오버라이딩 테스트
		Point p3 = new ColorPoint();

		p3.setX(200);
		p3.setY(300);
		// ((Point)p3).setX(200);
		// ((Point)p3).setY(300); 생략 가능

		((ColorPoint) p3).setColor("red");
		// p3.setColor("red"); 부모에선 자식꺼 모름. 명시적 캐스팅

		// drawPoint(p3);
		draw(p3);

		p3.show(false);
		p3.show(true);

		// 3. 상속관계에서의 생성자 호출 테스트
		Point p4 = new ColorPoint(500, 100, "Yellow");

		// drawPoint(p4);
		draw(p4);

		// 4. Shape Test
//		drawShape(new Triangle());
//		drawShape(new Rect());
//		drawShape(new Circle());
		draw(new Triangle());
		draw(new Rect());
		draw(new Circle());
		draw(new GraphicText("Hello World"));
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}

//	public static void drawPoint(Point point) {
//		point.show();
//	}
//	public static void drawShape(Shape shape) {
//	shape.draw();

//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
}