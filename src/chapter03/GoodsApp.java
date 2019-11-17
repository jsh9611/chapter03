package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();

		
		camera.setName("nikon");
		//camera.setPrice(400000);
		camera.setPrice(-10);
		// camera.price = -10; // 오류
		camera.setCountStock(30);
		camera.setCountSold(50);
		
//		System.out.println("상품이름 : " + camera.getName() + 
//							", 가격 : " + camera.getPrice() + 
//							", 재고개수:" + camera.getCountStock() + 
//							", 팔린 개수: " + camera.getCountSold() );
//		
		//		goods.price = 0;    // private 걸려있으면 접근불가. public은 접근가능.
		
		
		camera.showInfo();
		
		Goods camera2 = new Goods();
		Goods camera3 = new Goods();		
		Goods camera4 = new Goods();

		
		Goods.showCount();
	}

}
