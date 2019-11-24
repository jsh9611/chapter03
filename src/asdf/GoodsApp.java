package asdf;

import chapter03.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("nikon", 400000, 30, 50);	
		
		camera.showInfo(); // 반환타입이 없기 때문에 값을 받을 수 없다.
	}

}
