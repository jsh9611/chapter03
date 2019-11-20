package me.jangsh9611.paint.shape;

import me.jangsh9611.paint.i.Drawable;

//추상화로 draw메소드를  못불러오게 문법적으로 막음
public abstract class Shape implements Drawable {  
	private String fillColor;
	private String lineColor;
	
	public abstract void draw() ;
	
//	public void draw() {
//		System.out.println("구현할 수 없습니다.");
//	}
	
}