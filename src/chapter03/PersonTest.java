package chapter03;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		// public은 외부에서 접근이 가능하다.
		p.name = "사람";
		
		// protected는 같은패키지에서는 접근 가능하다.
		p.height = 170;
		
		// default는 같은패키지에서는 접근 가능하다.
		p.age = 10;
		
		// private는 내부에서만 가능하다.
		// p.weight = 60;
	}

}