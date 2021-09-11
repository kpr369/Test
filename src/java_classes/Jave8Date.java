package java_classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Jave8Date {

	
	public static void main(String[] args) {
		
	/*	ZoneId zone = ZoneId.of("Pacific/Auckland");
		LocalDate date = LocalDate.now(zone);
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd");
		System.out.println(date.format(pattern));*/
/*		
		LocalTime local = LocalTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("mm");
		System.out.println(local.format(pattern));*/
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
	}
}
