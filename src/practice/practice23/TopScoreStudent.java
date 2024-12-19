package practice.practice23;

public class TopScoreStudent {
	public static void main(String[] args) {
// 배열 생성
		String[] names = { "Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton" };
		int[] scores = { 65, 74, 23 ,75, 68, 96, 88, 98, 54 };

// 1등 인덱스 검색
		int i = topIndex(scores);

// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
	}

// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int topIndex(int[] arr) {
		
		int index = 0;
		int maxIndex = 0;
		int maxNum = 0;
		for(int item : arr) {
			if(maxNum < item) {
				maxNum = item;
				maxIndex = index;
			}
			index++;
		}
		
		return maxIndex;
	}
}
