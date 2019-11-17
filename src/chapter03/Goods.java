package chapter03;

public class Goods {
	
	private static int count;
	
	private String name;
	private  int price;             // 디폴트는 접근가능. 같은 패키지에서만 접근 가능함.
	private int countStock;
	private int countSold;
	
	public String getName() {
		return name;
	}
	
	public Goods() {
		Goods.count += 1;  //count += 1; 도 가능. 같은 클래스 안에선 좀 봐준다.
	
	}
	
	public static void showCount() {
		System.out.println(count); //내부에서는 생략해서 부를수있다. Goods.count
		//name = "....";   오류
	}
	public void test() {
		System.out.println(Goods.count);
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price <= 0) {
			this.price = 0;
		} else {
		this.price = price;
	}
		
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	
	public void showInfo() {
		System.out.println(
			"상품이름 : " + name + 
			", 가격:" + price + 
			", 재고개수: " + countStock + 
			", 팔린 개수: " + countSold);
	}

	
	
}
