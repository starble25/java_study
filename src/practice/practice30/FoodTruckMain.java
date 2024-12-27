package practice.practice30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruckMain {

	public static void main(String[] args) {
		
		FoodTruck ft = new FoodTruck();
		
		ft.addMenu("녹차", 2000);
		ft.addMenu("홍차", 3000);
		ft.addMenu("커피", 5000);
		
		ft.startSales();
	}

}

class FoodTruck {
	String truckName;	// 트럭이름
	int totalSales;		// 총 매출액
	boolean isOpened;	// 영업 중 여부
	List<Food> foodList; // 판매하는 메뉴 음식 리스트
	Scanner scanner = new Scanner(System.in);
	
	FoodTruck() {	//FoodTruck생성 시 foodList 초기화
		totalSales = 0;
		foodList = new ArrayList<Food>();
	}
	
	public void addMenu(String foodName, int price) {	//메뉴 추가
		foodList.add(new Food(foodName, price));
	}
	
	public void startSales() {
		System.out.println("===영업 시작===");
		
		while(true) {
			System.out.println("<1.메뉴보기 2.주문하기 3.재고관리 4.마감하기>");
			System.out.print("메뉴를 선택하세요:");
//			int input = scanner.nextInt();
//			String input = scanner.nextLine();
			
			int menu = 0;
			try {
				menu = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				menu = 0;
			}
			System.out.println();
			
//			int menu;
//			try {
//				menu = Integer.parseInt(input);
//			} catch (Exception e) {
//				menu = 0;
//			}
			
			switch(menu) {
				case 1: // 1.메뉴보기
					System.out.println("메뉴 목록");
					showMenu();
					System.out.println();System.out.println();
					continue;
					
				case 2: // 2.주문하기
					showMenu();
					System.out.println();
					System.out.print("주문할 메뉴를 선택하세요 :");
					int order = scanner.nextInt();
//					if(foodList.get(order-1).stock > 0)
					System.out.println(foodList.get(order-1).foodName + " 주문완료!");
					foodList.get(order - 1).stock--;			//주문 시 재고 -1개
					totalSales += foodList.get(order - 1).price;	//매출 증가
					System.out.println();
					continue;
					
				case 3: // 3.재고관리
					System.out.println("재고관리");
					System.out.print("재고 추가할 메뉴를 입력하세요:");
					order = scanner.nextInt();
					System.out.print("추가할 갯수를 입력하세요:");
					int amount = scanner.nextInt();
					foodList.get(order-1).stock += amount;
					System.out.printf("'%s' 재고 %d개 추가되었습니다. ", foodList.get(order-1).foodName, amount);
					System.out.printf("현재 재고 :%d개\n", foodList.get(order-1).stock);
					System.out.println();
					continue;
					
				case 4: // 4.마감하기
					System.out.println("마감!");
					System.out.printf("총 매출: %d원\n", totalSales);
					break;
					
				default:
					System.out.println("잘못 입력하셨습니다.");
					continue;
			}
			
			break;
		}
	}
	
	public void showMenu() {
		for(int i=0; i<foodList.size(); i++) {
			System.out.printf("%d.%s(%d개) ", i+1, foodList.get(i).foodName, foodList.get(i).stock);
		}
	}
	
}

class Food {
	String foodName;
	int price;
	int stock;

	public Food(String foodName, int price) {
		this.foodName = foodName;
		this.price = price;
		this.stock = 10;	//기본 재고 10개
	}

}

/*
푸드트럭
- 푸드트럭은 여러종류의 음식들을 메뉴로 가지고 있을 수 있다.
- 각 음식들은 각각의 이름, 가격, 재고를 가지고 있다.
- 초기에 이름과 가격을 가지고 생성된다.
- 각 음식별 재고를 설정할 수 있다.
- 메뉴를 보여주는 기능(메뉴와 함께 주문가능한 재고까지)이 있다.
- 메뉴중 주문을 할 수 있으며, 주문 시 금액만큼 매출이 증가하고 재고가 떨어진다.
- 재고가 없는 메뉴는 판매할 수 없다.

-기능 기준 (메뉴보기, 주문하기, 재고관리(메뉴 재고 추가), 마감하기)

- 마감시 남은 재고만큼 매출액이 마이너스된다.
※마이너스 금액은 각 음식의 가격의 30% 원가
- 마감시 당일 매출액을 보여주고 종료됩니다.

김밥 1000 재고 50개
40개 -> 40,000원
10개 ->마감 -> 3000
매출 4만 - 폐기손해3천 최종매출 37000원
*/