package check;

public class Test01 {
	
	public static void main(String[] args) {
		
		String[] str1 = {"A", "B", "C"};
		
		String[] str2 = str1;
		
		System.out.print("str1[] = ");
		System.out.print(str1[0] + " ");
		System.out.print(str1[1] + " ");
		System.out.print(str1[2] + " ");
		System.out.println();
		
		System.out.print("str2[] = ");
		System.out.print(str1[0] + " ");
		System.out.print(str1[1] + " ");
		System.out.print(str1[2] + " ");
		System.out.println();
		
		System.out.println("==============");
		
		str2[0] = "D";
		System.out.println("str1[] = " + str1[0] + " " + str1[1] + " " + str1[2]);
		System.out.println("str2[] = " + str2[0] + " " + str2[1] + " " + str2[2]);
		
//		System.out.println();
//		
//		int[] arr1 = {1, 2, 3};
//		int[] arr2 = arr1;
//		arr2[0] = 90;
//		
//		System.out.println(arr1[0] +" " +arr1[1] +" " +arr1[2] +" ");
		
		
	}

}
