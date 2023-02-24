package Exam04.home.exex02;

import java.util.Scanner;

public class H01Coupon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = 2;
		String coupon = "";
		
		if(grade == 1) coupon = "5만원";
		else if(grade == 2) coupon = "1만원";
		else coupon = "1천원";
		
		System.out.println(coupon);
	}
}
