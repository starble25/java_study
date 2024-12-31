package quiz;

import java.util.HashMap;
import java.util.Map;

public class Quiz09 {

	public static void main(String[] args) {
		/*
		// completion.length = participant.length - 1
//		String[] participant = {"leo", "kiki", "eden"};
//		String[] completion = {"kiki", "eden"};
		String filter = "";
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		Set<String> set = new HashSet<String>(); 
		
		for(String str : completion) {	//완주자 추가
			int temp1 = set.size();
			set.add(str);
			int temp2 = set.size();
			if(temp2 > temp1) {
				filter = str;
			}
		}
		
		for(String str : participant) {	//참가자 추가
			int temp1 = set.size();
			set.add(str);
			int temp2 = set.size();
			if(temp2 > temp1) {
				filter = str;
			}
			System.out.println(str);
		}
		System.out.println("======");
		System.out.println(filter);
 		*/
		
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"kiki", "eden"};
		
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		
		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
		
		String result1 = solution(participant1, completion1);
		String result2 = solution(participant2, completion2);
		String result3 = solution(participant3, completion3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
	
	public static String solution(String[] participant, String[] completion) {
		
		//1. 참가자 목록에서 완주자 목록 이름 하나씩 지우기
//		List<String> partList = new ArrayList<String>(List.of(participant));
//		List<String> compList = new ArrayList<String>(List.of(completion));
//		for(String s : compList) {
//			partList.remove(s);
//		}
//		return partList.get(0);
		
		//HashSet 활용
		//2. 완주자 목록 추가 >> 참가자에서 하나씩 지우기
//		Set<String> compSet = new HashSet<String>();
//		for(String s : completion) { // 완주자 추가
//			compSet.add(s);
//		}
//		for(String s : participant) {
//			if(compSet.contains(s)) { // 있으면 삭제
//				compSet.remove(s);
//			} else {	// 없으면 완주 못한사람 리턴
//				return s; // compiler는 조건 안에있는 return 실행이 안될수도 있다로 판단
//			}
//		}
//		return null;	//리턴 명시 필수
		
		//HashMap 활용
		Map<String, Integer> pMap = new HashMap<String, Integer>();
		for(String s : participant) {
			if(pMap.containsKey(s)) {
				pMap.put(s, pMap.get(s) + 1);
			} else {
				pMap.put(s, 1);
			}
		}
		
		for(String s : completion) {
			pMap.put(s,  pMap.get(s) - 1);
		}
		for(String key : pMap.keySet()) {
			if(pMap.get(key) == 1) { //미완주자
				return key;
			}
		}
		
		return null;
	}

}


