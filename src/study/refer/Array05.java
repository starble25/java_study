package study.refer;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50 };
		
		for(int i=0; i<5; i++) {
			System.out.print("arr[" + i + "]="  + arr[i] + " ");
		}
		System.out.println();
		
		
		for(int value : arr) {	//{10, 20, 30, 40, 50};
			
			//전체 갯수만큼 처음부터 끝까지 다 반복
			//값만 주어지고, 인덱스는 모른다.
			System.out.print( value + " " );
		}
		
		
		int[] scores = {90, 95, 100, 80, 75};
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		
		sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println(sum);
		
		
		// 모든 점수를 -5
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i] - 5;
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		for(int score : scores) {
			score = score - 5;
			System.out.print(score + " ");
		}
		System.out.println();
		
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
		
	}

}
