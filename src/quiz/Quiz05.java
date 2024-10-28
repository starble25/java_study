package quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		/*
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		1.
		1 2 3 4
		5 6 7 8
		9 10 11 12
		13 14 15 16
		
		2.
		1 5 9 13
		2 6 10 14
		3 7 11 15
		4 8 12 16
		
		3.
		16 15 14 13
		12 11 10 9
		8 7 6 5
		4 3 2 1
		
		4.
		16 12 8 4
		15 11 7 3
		14 10 6 2
		13 9 5 1
		 */
		
		
		
		
		int[][] arr1= new int[4][4];
		int num = 1;
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				arr1[i][j] = num;
				num++;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		int[][] arr2= new int[4][4];
		num = 1;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				arr2[j][i] = num;
				num++;
			}
		}
		
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		int[][] arr3= new int[4][4];
		num = 1;
		
		for(int i=arr3.length-1; i>=0; i--) {
			for(int j=arr3.length-1; j>=0; j--) {
				arr3[i][j] = num;
				num++;
			}
		}
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3.length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		int[][] arr4= new int[4][4];
		num = 1;
		
		for(int i=arr4.length-1; i>=0; i--) {
			for(int j=arr4.length-1; j>=0; j--) {
				arr4[j][i] = num;
				num++;
			}
		}
		for(int i=0; i<arr4.length; i++) {
			for(int j=0; j<arr4.length; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
