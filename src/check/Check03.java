package check;

public class Check03 {

	public static void main(String[] args) {
		
		/*
		p.201 8번		
		int[][] array = {
				 {95, 86},
				 {83, 92, 96},
				 {78, 83, 93, 87, 88}
		};
		배열 전체 합, 평균
		*/
		
		int[][] array = {
				 {95, 86},
				 {83, 92, 96},
				 {78, 83, 93, 87, 88}
		};
		
		
		int i, j;
		int sum = 0;
		int count = 0;
		
		for(i=0; i<array.length; i++) {
			for(j=0; j<array[i].length; j++) {
				sum = sum + array[i][j];
				count++;
			}
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / count);
		
		System.out.println();
		
		
		/*
		p.201 7번		
		int[] array = { 1, 5, 3, 8, 2 };
		최대값 출력
		*/
		
		int[] array2 = { 1, 5, 3, 8, 2 };
		
		int maxNum = 0;
		
		for(i=0; i<array2.length - 1; i++) {
			if(array2[i] >= array2[i+1]) {
				maxNum = array2[i];
			} else {
				maxNum = array2[i+1];
			}
		}
		
		System.out.println(maxNum);
		
		
	}

}
