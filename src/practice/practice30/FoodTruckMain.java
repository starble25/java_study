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
		isOpened = true;
		System.out.println("===영업 시작===");
		
		while(isOpened) {
			
			int menu = getMainMenu();
			
			switch(menu) {
				case 1: // 1.메뉴보기
					showMenu();
					break;
					
				case 2: // 2.주문하기
					orderMenu();
					break;
					
				case 3: // 3.재고관리
					manageStock();
					break;
					
				case 4: // 4.마감하기
					System.out.println("마감!");
					System.out.printf("총 매출: %d원\n", totalSales);
					isOpened = false;
					
			}
		}
	}
	
	public void showMenu() {
		for(int i=0; i<foodList.size(); i++) {
			System.out.printf("%d.%s(%d개) ", i+1, foodList.get(i).foodName, foodList.get(i).stock);
		}
		System.out.println();
	}
	
	int getMainMenu() {
		
		int menu = 0;
		
		while(true) {
			System.out.println("<1.메뉴보기 2.주문하기 3.재고관리 4.마감하기>");
			System.out.print("메뉴를 선택하세요:");
			
			try {
				menu = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				menu = 0;
			}
			
			if( menu >=1 && menu <= 4) {
				break;
			} else {
				System.out.println(">>> 보기 중에 선택하세요(1 ~ 4)");
			}
			System.out.println();
		}

		return menu;
	}
	
	void orderMenu() {	//주문하기
		int menuIndex = getFoodMenuIndex();
		
		Food selectedFood = foodList.get(menuIndex);
		
		if(selectedFood.stock > 0) {
			System.out.println(selectedFood.foodName + " 주문완료!");
			selectedFood.stock--;			//주문 시 재고 -1개
			totalSales += selectedFood.price;	//매출 증가
		} else {
			System.out.println("해당 메뉴는 품절입니다!");
		}
		System.out.println();
	}
	
	int getFoodMenuIndex() {	//메뉴의 인덱스 선택
		int order;
		
		while(true) {
			showMenu();
			System.out.print(">>> 메뉴를 선택하세요 :");
			
			try {
				order = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				order = 0;
			}
			
			if(order >=1 && order <= foodList.size()) {
				break;
			} else {
				System.out.println(">>> 메뉴보기 중에 선택하세요");
			}
		}
		
		return (order - 1);	//해당 메뉴의 index 반환
	}
	
	void manageStock() {	//재고관리
		System.out.println("재고관리");
		int order = getFoodMenuIndex();
		
		System.out.print("추가할 갯수를 입력하세요:");
		int amount = scanner.nextInt();
		
		foodList.get(order).stock += amount;
		System.out.printf("'%s' 재고 %d개 추가되었습니다. ", foodList.get(order).foodName, amount);
		System.out.printf("현재 재고 :%d개\n", foodList.get(order).stock);
		System.out.println();
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