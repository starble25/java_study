package practice;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int select;
		int exit = 0;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("5. 종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			select = scanner.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 5:
				System.out.println("프로그램이 종료됩니다.");
				exit = 1;
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");	
			}
			System.out.println();
			
			if(exit == 1)
				break;
		}
		
		
		
//		String[] menuArr = {"입력", "수정", "조회", "삭제", "종료"};
//		while(true) {
//			for(int i=0; i<menuArr.length; i++) {
//				System.out.printf("%d. %s\n", (i+1), menuArr[i]);
//			}
//			System.out.print("메뉴 번호를 입력하세요 : ");
//			int menu = scanner.nextInt();
//			if(menu >=1 && menu <= 4) {
//				System.out.println( menuArr[menu-1] + " 메뉴입니다.");
//			} else if(menu ==5) {
//				System.out.println("프로그램이 종료됩니다.");
//				break;
//			} else {
//				System.out.println("잘못 입력");
//			}
//		}
		
		
		
	}

}
