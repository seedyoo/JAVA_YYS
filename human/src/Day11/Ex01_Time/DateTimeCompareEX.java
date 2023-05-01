package Day11.Ex01_Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareEX {

	public static void main(String[] args) {
		//	2023년 5월 1일 12시 0분 0초
		LocalDateTime todayDateTime = LocalDateTime.of(2023, 05, 01, 12, 0, 15);
		System.out.println("오늘 : " + todayDateTime);
 		
		// 2023년 10월 26일 17시 40분 0 초 
		LocalDateTime endDateTime = LocalDateTime.of(2023, 10, 26, 17, 40, 0);
		System.out.println("종강 : " + endDateTime);
		
		// A.isBefore(B)	: A가 B보다 이전이면 true, 아니면 false
		// A.isEqual(B)	: A와 B가 같은 시간이면 true, 아니면 false
		// A.isAfter(B)		: A가 B보다 이후이면 true, 아니면 false
		
		if( todayDateTime.isBefore(endDateTime) ) {
			System.out.println("훈련과정 진행 중");
		}
		else if( todayDateTime.isEqual(endDateTime) ) {
			System.out.println("종강");
		}
		else if( todayDateTime.isAfter(endDateTime) ) {
			System.out.println("훈련과정 종료");
		
		
		// until()
		// : LocalDateTime 객체의 날짜/시간부터 인자로 지정한 객체의 날짜/시간까지
		//	 남은 시간을 반환하는 메소드
		long remainYear = todayDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = todayDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = todayDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = todayDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = todayDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = todayDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 개월 수 : " + remainMonth);
		System.out.println("남은 일 수 : " + remainDay);
		System.out.println("남은 시 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();
		
		
		// between()
		// - ChronoUnit.상수.between(시작일자, 종료일자)
		// : 시작일자와 종료일자의 남은 시간을 지정한 상수 단위에 맞게 변환하는 메소드
		remainYear = ChronoUnit.YEARS.between(todayDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(todayDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(todayDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(todayDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(todayDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(todayDateTime, endDateTime);
				
		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 개월 수 : " + remainMonth);
		System.out.println("남은 일 수 : " + remainDay);
		System.out.println("남은 시 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();
		
		
		
		}		
	}
}

