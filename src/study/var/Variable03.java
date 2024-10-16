package study.var;

public class Variable03 {

	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = d1;
		
		int i1 = 30;
		int i2 = i1;
		// int i3 = 3.123;	정수형변수 int = 실수형 값X
		
		i2 = (int) d2; // int = double
					   // i2 = (int)3.14;
					   // i2 = 3;
		
		System.out.println(i2);
		
		// double -> int 변환		소수점 사라짐
		
		// java 정수 -> int 인식
		// java 실수 -> double 인식
		
		float f1 = 4.43f;
		double d3 = f1; //double = float
		
		double d4 = 300; // double = 정수형숫자(int) 자동타입변환
		// 300.0
		System.out.println(d4);
		
		
		// 연산에서 형변환
		int intValue = 10;
		double doubleValue = 5.5;
		
		//	int result = intValue + doubleValue;	X
		
		int result = intValue + (int)doubleValue;
		//	int	   = int	  + (int)double
		//	int	   = 10		  + 5
		
		result = (int)(intValue + doubleValue);
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rt = (int)dv1 + (int)dv2;
		//				5 + 6
		System.out.println(rt);
		
		rt = (int)(dv1 + dv2);
		//   (int) 12
		System.out.println(rt);
		
	}

}
