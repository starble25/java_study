package study.refer;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3};
		
		System.out.println( arr1[0] == arr1[1] );
		//						int == int
		
		String[] arr2 = {"A", "B", "C"};
		
		System.out.println( arr2[0] == arr2[1]);
		// 					 String == String			(주소비교)
		//					arr2[0].equals(arr2[1]) 	(값 비교)
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		
		String[][] arr3 = { {"A", "B", "C"}, {"D", "E", "F"} };
		
		System.out.println(arr3[0][1].equals(arr3[1][2]));
		//						String.equals(String)
		
		
	}

}
