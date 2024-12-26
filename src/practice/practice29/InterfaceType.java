package practice.practice29;

//basecode
public class InterfaceType {
	public static void main(String[] args) {
//객체 생성
		Food food = new Food("족발", 19800);
		Electronics el = new Electronics("에어팟", 199000);
		Clothing cl = new Clothing("셔츠", 49900);
		Orderable[] orders = {food, el, cl};
//총합 계산
		int totalPrice = 0;
		for(Orderable item : orders) {
			totalPrice += item.discountedPrice();
		}
//결과 출력
		System.out.println("총합: " + totalPrice + "원");
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	public int discountedPrice() {
//		return price = (int)(price*0.9); // 조회 할 때 마다 *0.9
		return (int)(price*0.9);
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		return (int)(price*0.8);
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
	public int discountedPrice() {
		return (int)(price*0.7);
	}
}
