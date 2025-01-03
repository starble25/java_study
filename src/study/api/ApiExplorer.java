/* Java 1.8 샘플 코드 */
package study.api;

import java.io.IOException;
import java.util.List;

public class ApiExplorer {
    public static void main(String[] args) {
    	
    	List<ArplInfo> arplList;
    	try {
    		arplList = ArplApiService.forecaseDustArplInfoList("2024-12-11");
    		
    		//json -> 자바 ArplInfo 객체로 변환 완료
    		for(ArplInfo info : arplList) {
    			System.out.println( info.toString() );
    		}
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
        
    	//ArplInfo 객체 -> DB 저장
    	
    	//ArplDAO
        
    }
    
}