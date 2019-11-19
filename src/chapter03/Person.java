package chapter03;

public class Person {
	// public static int count;
	public String name;
	protected int height;
	int age;
	private int weight;
	
	public Person( ) {
		System.out.println("생성자 생성될때 Person() 호출");
	}
	
	public void info() {
		weight = 70;
	}
}
