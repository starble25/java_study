package practice.practice22;

import java.util.ArrayList;

public class ChineseRestaurant {
	
	public static void main(String[] args) {
		
//		Menu jjajang = new Menu("짜장", 4900);
//		Menu jjambbong = new Menu("짬뽕", 5900);
//		Menu tangsook = new Menu("탕수육", 13900);
//		
//		ArrayList<Menu> menu = new ArrayList<Menu>();
//		menu.add(jjajang);
//		menu.add(jjambbong);
//		menu.add(tangsook);
		
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		menuList.add(new Menu("짜장", 4900));
		menuList.add(new Menu("짬뽕", 5900));
		menuList.add(new Menu("탕수육", 13900));
		
		Order order = new Order(123, menuList);
		System.out.printf("주문 합계: %d원\n", order.totalPrice());

		
		/*
		// 주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
		// 메뉴를 조합하여 주문을 생성
		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		Order order = new Order(123, menuArr);
		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
		*/
		
	}
	
}