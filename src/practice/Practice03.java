package practice;

public class Practice03 {

	public static void main(String[] args) {
		
		/*
		1. 아래 코드에서 예상되는 출력 결과를 작성하세요
		int x = 2;
		int y = 3;
		int z;

		System.out.println("x="+x + " y="+y);
		System.out.println(x + y);
		System.out.println(x++ + y++);
		System.out.println("x="+x + " y="+y);
		z = ++x + ++y;
		System.out.println("x="+x + " y="+y);
		z--;
		x += --y;
		System.out.println("x="+x + " y="+y + " z="+z);
		x = 10;
		z = x/y++;
		System.out.println("x="+x + " y="+y + " z="+z);
		System.out.println("x="+(x*2) + " y="+ ++y + " z="+z);
		System.out.println("x="+x + " y="+y + " z="+z);
		
		
		x=2 y=3
		5
		5
		x=3 y=4
		x=4 y=5
		x=8 y=4 z=8
		x=10 y=5 z=2
		x=20 y=6 z=2
		x=10 y=6 z=2


		2. 아래 조건에 대한 출력 결과를 예상해서 작성하세요
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println( (a<b) && (c>=a) );
		System.out.println( (a == b ) || ( a >= b) || (c > 10) );
		boolean result = !(c == 3);
		System.out.println( result );
		
		
		true	// true && true
		false	// false || false || false 
		false
		

		3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.

		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
		6000원 이하 -> "훌륭"
		6000원 초과 ~ 8000원 -> "선방"
		8000원 초과 ~ 12000원 -> "눈물"
		12000원 초과 -> "물로배채우기"

		int menuPrice = 30000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result = ________;
		System.out.println(result);
		*/
		
		int menuPrice = 8000;
		String result = (menuPrice <= 6000) ? "훌륭" : 
			(menuPrice <= 8000) ? "선방" : 
			(menuPrice <= 12000) ? "눈물" : "물로배채우기" ;
		System.out.println(result);

	}

}
