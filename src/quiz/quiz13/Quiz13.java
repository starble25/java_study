package quiz.quiz13;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz13 {

	public static void main(String[] args) throws ParseException {
		
//		String jsonStr = OrderApiService.orderInfo();
		
		// 가공 parse		분석	(Integer.parseInt  Double.parseDouble)
		
		CustomerDTO customerDTO = OrderApiService.orderInfo();
		
	}

}
