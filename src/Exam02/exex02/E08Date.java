package Exam02.exex02;

import java.time.LocalDate;

public class E08Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		date = date.plusDays(1);
		date = date.minusDays(1);
		
		System.out.println(date);
	}
}
