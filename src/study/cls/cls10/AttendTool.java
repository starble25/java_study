package study.cls.cls10;

public class AttendTool {	// 출결도구

	boolean isOn;
	String forOrg;
	
	//int 1:출석성공 2:퇴실성공 3:실패
	public int checkAttend2(Card card) {
		//card확인
		//오늘기록X -> 출석
		return 1;
		
		//출석기록 -> 퇴실
		//return 2;
	}
	
	//출석체크 결과 -> true / false
	public boolean checkAttend(Card card) {
		//구성원 목록
		//목록 == card.id
		//출석상태 체크
		return true;
	}
}
