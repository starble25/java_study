package study.iter;

import java.util.Iterator;

public class Iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1; i<=5; i++) {
			System.out.println("피곤하다");			
		}
		
		int j = 1;
		while(j<=5) {
			System.out.println("졸리다");
			j++;
		}
		
		/*
		 * while(true) { System.out.println("무한"); }
		 */
		
		int k = 10;
		do {
			System.out.println("k do while");
		} while(k<5);
		
		
		k = 1;
		while(true) {
			System.out.println(k);
			k++;
			
			if(k == 10) {
				break;
			}
		}
		
		
		System.out.println("====================");
		for(int i=1; i<=10; i++) {
			if(i == 5)
				continue;
			
			System.out.println(i);
		}
		
		
	}

}
