package study.cls.cls08;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[4];
		
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		arr[3] = "D";
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		arr[2] = null;
		
		for(String item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ㄱ");
		list.add("ㄴ");
		list.add("ㄷ");		// 맨 끝에 객체 추가
		list.add(0, "ㄹ");	// 해당 인덱스에 객체 추가
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		//list.set(2, null);	// 해당 인덱스 객체 교체
		list.remove(2);			// 해당 인덱스 객체 삭제
		
		for(String item : list) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		
	}

}
