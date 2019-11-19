package chapter03;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();           // Person() 생성하면서 여기서 한번 불리고
		
		// public은 외부에서 접근이 가능하다.
		p.name = "사람";
		
		// protected는 같은패키지에서는 접근 가능하다.
		p.height = 170;
		
		// default는 같은패키지에서는 접근 가능하다.
		p.age = 10;
		
		// private는 내부에서만 가능하다.
		// p.weight = 60;
		
		// 자식 생성자와 부모 생성자 호출관계
		Student s = new Student();        // 여기서 한번 더 불림.
	}

}