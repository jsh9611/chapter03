package chapter03_2;

import chapter03.Customer;

public class VIPCustomer extends Customer {
	public void set() {
		// public은 접근 가능(어디서든지 접근 가능)
		job = "student";
		
		// protected는 접근가능(자식에서 접근 가능)
		address = "서울시 은평구 구파발동";
		
		// default는 다른 패키지 에서는 접근 불가능.
		// age = 19;
		
		// private는 자식에서 접근할 수 없다.
		// name = "둘리";
	}
}
