package asdf;

public class Goods {
		
	private String name;
	private  int price;             // 디폴트는 접근가능. 같은 패키지에서만 접근 가능함.
	private int countStock;
	private int countSold;
	
	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;        // 초기화
						
	}
	public void showInfo() {
		System.out.println(
			"상품이름 : " + name + 
			", 가격:" + price + 
			", 재고개수: " + countStock + 
			", 팔린 개수: " + countSold);
	}

	
	
}
