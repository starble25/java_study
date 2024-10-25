package quiz;

public class Quiz04 {

	public static void main(String[] args) {

		/*
		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
		//규칙 찾아보기.

		1 2 2 2 2
		3 1 2 2 2
		3 3 1 2 2
		3 3 3 1 2
		3 3 3 3 1
		*/
		
		int[][] arr = new int[5][5];
		int i, j;
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				if(i == j) {
					arr[i][j] = 1;
				} else if(i > j) {
					arr[i][j] = 3;
				} else {
					arr[i][j] = 2;
				}
//				System.out.print(arr[i][j] + " ");
			}
//			System.out.println();
		}
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
