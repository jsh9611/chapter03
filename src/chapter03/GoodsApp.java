package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();		
//		camera.setName("nikon");
//		//camera.setPrice(400000);
//		camera.setPrice(1000);
//		// camera.price = -10; // 오류
//		camera.setCountStock(30);
//		camera.setCountSold(50);
		
		Goods camera = new Goods("nikon", 400000, 30, 50);	
//		
//		//객체를 생성하는데 사용한 클래스 정보를 얻어온다.(클레스 이름, 메소드 정보, 필드 정보): reflection
//		//Class cls = camera.getClass();
//		//System.out.println(cls.getName());
//		
//		
////		System.out.println("상품이름 : " + camera.getName() + 
////							", 가격 : " + camera.getPrice() + 
////							", 재고개수:" + camera.getCountStock() + 
////							", 팔린 개수: " + camera.getCountSold() );
////		
//		//		goods.price = 0;    // private 걸려있으면 접근불가. public은 접근가능.
//		
//		int price = camera.getPrice();
//		System.out.println(price);
//		
		camera.showInfo(); // 반환타입이 없기 때문에 값을 받을 수 없다.
//		
//		
//		int discountPrice = camera.calcDiscountPrice(0.5);  // float 일땐 0.5f
//		System.out.println(discountPrice);
//
//		
//		Goods camera2 = new Goods();
////		Goods camera3 = new Goods();		
////		Goods camera4 = new Goods();
//
//		
//		Goods.showCount();
	}

}
