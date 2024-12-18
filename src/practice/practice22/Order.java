package practice.practice22;

import java.util.ArrayList;

class Order {
	
	int orderNum;
	ArrayList<Menu> menus;
	
	public Order(int num, ArrayList<Menu> list) {
		orderNum = num;
		menus = list;
	}
	
	public int totalPrice() {
		int totalPrice = 0;
		for(Menu item : menus) {
			totalPrice += item.price;
		}
//		for(int i=0; i<menus.size(); i++) {
//			totalPrice += menus.get(i).price;
//		}
		return totalPrice;
	}
	
	/*
	// 필드(인스턴스 필드)
	int orderNum;
	Menu[] menus;
	// 생성자
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		// 1. 모든 주문 메뉴의 총합을 반환하세요.
		int totalPrice = 0;
		for(Menu item : menus) {
			totalPrice += item.price;
		}
		return totalPrice;
	}
	*/
	
}