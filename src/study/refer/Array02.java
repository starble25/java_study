package study.refer;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nArr1 = new int[3][5];
		
		/* 0 1  2 3 4
		0  ㅁ ㅁ ㅁ ㅁ ㅁ
		1  ㅁ ㅁ ㅁ ㅁ ㅁ
		2  ㅁ ㅁ ㅁ ㅁ ㅁ
		 */
		
		int[] nA = {1,2,3,4,5,6,};
		
		int[][] nArr3 = { {1,2,3}, {4,5,6} };
		
		System.out.println(nArr3[1][1]);
		
		for(int i=0; i<nArr3.length; i++) {
//			for(int j=0; j<nArr3[0].length ;j++)
//			for(int j=0; j<nArr3[1].length ;j++)
			for(int j=0; j<nArr3[i].length ;j++) {
				System.out.print(nArr3[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
