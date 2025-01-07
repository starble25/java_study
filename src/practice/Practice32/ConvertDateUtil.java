package practice.Practice32;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertDateUtil {
	
	/*
	-- SQL
	DATE
	TIMESTAMP

	-- JAVA
	LocalDate
	LocalDateTime
	*/
	
	//Timestamp -> LocalDateTime
	public static LocalDateTime convertTimestampToLocalDataTime(Timestamp ts) {
		return ts.toLocalDateTime();
	}
	
	//LocalDateTime -> Timestamp
	public static Timestamp convertLocalDateTimeToTimestamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt);
	}
	
	//String -> LocalDateTime
	public static LocalDateTime convertStringToLocalDateTime(String str) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(str, dtf);
		return ld.atStartOfDay();
	}
	
	public static LocalDateTime convertStringToLocalDateTime2(String str) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ld = LocalDate.parse(str, dtf);
		return ld.atStartOfDay();
	}
	
	//LocalDateTime -> String
	public static String convertLocalDateTimeToString(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return ldt.format(dtf);
	}
	
	public static String convertLocalDateTimeToString2(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		return ldt.format(dtf);
	}
	
	public static String convertLocalDateTimeToString3(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return ldt.format(dtf);
	}
	
}
