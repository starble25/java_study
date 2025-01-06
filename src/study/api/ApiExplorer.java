/* Java 1.8 샘플 코드 */
package study.api;

import java.io.IOException;
import java.util.List;

public class ApiExplorer {
    public static void main(String[] args) {
    	
    	List<ArplInfo> arplList = null;
    	try {
    		arplList = ArplApiService.forecastDustArplInfoList("2024-12-11");
    		
    		//json -> 자바 ArplInfo 객체로 변환 완료
    		for(ArplInfo info : arplList) {
    			System.out.println( info.toString() );
    		}
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
        
    	//ArplInfo 객체 -> DB 저장
    	
    	//ArplDAO
        ArplDAO arplDAO = new ArplDAO();
        
        int count = 0;
        for(ArplInfo ai : arplList) {
        	count += arplDAO.saveArplInfo(ai);
        }
        System.out.println(count + "개 저장성공");
        
        //API >> 데이터확보 >> 저장
        //누적해서 데이터를 계속 저장/활용
        //	1) 기존데이터 delete >> 새로 insert
        //	2) MERGE 처리
        
//        int result = arplDAO.saveArplInfo(arplList.get(0));
//        if(result > 0) {
//        	System.out.println("저장 잘 됨");
//        }
        
    }
    
    public static String convertValueToString(Object obj) {
    	
    	return obj == null ? "" : obj.toString();
    }
    
}

