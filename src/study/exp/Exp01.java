package study.exp;

import java.util.Scanner;

public class Exp01 {
	//Exception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp tt = null;
		
		if(tt != null) {
			tt.t = 10;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("숫자 입력하세요:");
		String s = scanner.nextLine();
		
		int n = 0;
		try {
			System.out.println("ParseInt 전");
			n = Integer.parseInt(s);
			System.out.println("ParseInt 후");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("여기 finally");
		}
		
		System.out.println("입력한 숫자는: " + n);
		
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class Temp {
	int t;
}