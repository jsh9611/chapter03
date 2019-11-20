package me.jangsh9611.paint.main;

import me.jangsh9611.paint.i.Drawable;
import me.jangsh9611.paint.point.ColorPoint;
import me.jangsh9611.paint.point.Point;
import me.jangsh9611.paint.shape.Circle;
import me.jangsh9611.paint.shape.Rect;
import me.jangsh9611.paint.shape.Shape;
import me.jangsh9611.paint.shape.Triangle;
import me.jangsh9611.paint.text.GraphicText;

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
		
		// 5. instanceof 연산자 테스트
		// 	  상속관계에 있는 클래스들만 가능하다(부모거나 자식)
		Shape s = new Rect();
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);		
		System.out.println(s instanceof Drawable);	
		
		Rect r = new Rect();
		System.out.println(r instanceof Object);
		System.out.println(r instanceof Shape);
		System.out.println(r instanceof Rect);
		// System.out.println(r instanceof Triangle);
		
		// 인터페이스의 경우 구현관계는 부모자식 상관없이 연산이 가능하다.
		System.out.println(r instanceof Drawable);
		//System.out.println(r instanceof String); 불가능
		//System.out.println(r instanceof List); 가능
		//									구현되잇는지안되어잇는지
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