package quiz.quiz13;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class OrderApiService {
	
	public static CustomerDTO orderInfo() throws ParseException {
		//
		//요청 변수 지정(+인증키 지정)
		//요청
		//응답 받은 데이터
		
		String str = "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"John Doe\",\r\n"
				+ "\"contacts\": [\r\n"
				+ "{\r\n"
				+ "\"type\": \"email\",\r\n"
				+ "\"value\": \"john.doe@example.com\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"type\": \"phone\",\r\n"
				+ "\"value\": \"01023456789\"\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"address\": {\r\n"
				+ "\"street\": \"123 Main Street\",\r\n"
				+ "\"city\": \"Seoul\",\r\n"
				+ "\"zipcode\": \"12345\"\r\n"
				+ "},\r\n"
				+ "\"orders\": [\r\n"
				+ "{\r\n"
				+ "\"orderId\": \"ORD-001\",\r\n"
				+ "\"date\": \"2024-07-09\",\r\n"
				+ "\"items\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"Smartphone\",\r\n"
				+ "\"quantity\": 2\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 2,\r\n"
				+ "\"name\": \"Laptop\",\r\n"
				+ "\"quantity\": 1\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"orderId\": \"ORD-002\",\r\n"
				+ "\"date\": \"2024-07-10\",\r\n"
				+ "\"items\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 3,\r\n"
				+ "\"name\": \"Headphones\",\r\n"
				+ "\"quantity\": 1\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ ""
				;
		
		CustomerDTO customerDTO = new CustomerDTO();
		
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject)parser.parse(str);
		JSONArray orders = (JSONArray)obj.get("orders");
		for(int i=0; i<orders.size(); i++) {
			JSONObject order = (JSONObject)orders.get(i);
			System.out.println(order.get("orderId"));
			System.out.println(order.get("date"));
			
			JSONArray items = (JSONArray)order.get("items");
			for(int j=0; j<items.size(); j++) {
				JSONObject item = (JSONObject)items.get(j);
				System.out.println(item.get("id"));
				System.out.println(item.get("name"));
				System.out.println(item.get("quantity"));
			}
		}
		
		return customerDTO;
	}
}
