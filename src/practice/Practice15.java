package practice;

import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		// 메뉴, 수량, 총액, 추가주문
		int menu, menuCount, total;
		total = 0;
		String order;
		
		int menu1 = 0;	//아메리카노
		int menu2 = 0;	//카페라떼
		int menu3 = 0;	//바닐라라떼
		int menuSum1, menuSum2, menuSum3;
		
		int exit = 0;
		
		while(true) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 아메리카노	3500원");
			System.out.println("2. 카페라떼	4100원");
			System.out.println("3. 바닐라라떼	4300원");
			System.out.println("=====================");
			
			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();
			if(!(menu == 1 || menu == 2 || menu == 3)) {
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요");
				continue;
			} else {
				System.out.print("수량 선택 : ");
				menuCount = scanner.nextInt();
			}
			scanner.nextLine();
			
			switch(menu) {
			case 1:
				menu1 = menu1 + menuCount;
				break;
			case 2:
				menu2 = menu2 + menuCount;
				break;
			case 3:
				menu3 = menu3 + menuCount;
				break;
			}
			System.out.println();
			
			while(true) {
				System.out.print("추가 주문하시겠습니까?(y/n)");
				order = scanner.nextLine();
				if( !( order.equals("y") || order.equals("n") ) ) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					continue;
				} else if(order.equals("y")) {
					break;
				} else {
					exit = 1;
					break;
				}
			}
			
			if(exit == 1)
				break;
		}
		
		menuSum1 = menu1 * 3500;
		menuSum2 = menu2 * 4100;
		menuSum3 = menu3 * 4300;
		total = menuSum1 + menuSum2 + menuSum3;
		
		System.out.println("=====================");
		if( !(menu1 == 0) )
			System.out.printf("아메리카노 %d잔 : %d원\n", menu1, menuSum1);
		if( !(menu2 == 0) )
			System.out.printf("카페라떼 %d잔 : %d원\n", menu2, menuSum2);
		if( !(menu3 == 0) )
			System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3, menuSum3);
		System.out.println("=====================");
		System.out.printf("총액 : %d원", total);
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		int menu, count;
		String addOrder;
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼"}; // 메뉴이름
		int[] priceArr = {3500, 4100, 4300};				// 메뉴가격
		int[] countArr = new int[menuArr.length];			// 메뉴 주문수량
		
		while(true) {
			
			while(true) {
				for(int i=0; i<menuArr.length; i++) {
					System.out.printf("%d.%-8s %6d원\n", i+1, menuArr[i], priceArr[i]);
				}
				
				System.out.println("====================");
				
				System.out.print("메뉴 선택 : ");	//1, 2, 3
				menu = scanner.nextInt();
				
				if( menu >= 1 && menu <= menuArr.length ) {
					break;
				} else {
					System.out.println("잘못 입력했습니다. 다시 입력하세요");
				}
			}
			
			System.out.print("수량 선택 : ");
			count = scanner.nextInt();
			countArr[menu-1] += count;	// 수량 증가시키기
			
			scanner.nextLine();
			while(true) {
				System.out.print("추가 주문하시겠습니까?(y/n)");
				addOrder = scanner.nextLine();
				
				if( addOrder.equals("y") || addOrder.equals("n") )
					break;
				else {
					System.out.println("잘못 입력했습니다. 다시 입력하세요");
				}
			}
			
			if(addOrder.equals("n")) {
				int total = 0;
				for(int i=0; i<menuArr.length; i++) {
					
					if(countArr[i] > 0) {
						System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i] * priceArr[i]);
						total = total + (countArr[i] * priceArr[i]);
					}
				}
				
				System.out.println("====================");
				System.out.println("총액 : " + total + "원");
				break;
			}
			
			
		}
		
		
	}

}
