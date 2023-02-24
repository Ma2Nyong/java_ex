package Exam04.exex02;

public class E02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold" -> coupon = "5만원";
		case "silver" -> coupon = "5만원";
		default -> coupon = "1천원";
		}
		
		switch(grade) {
		case "gold", "silver" -> coupon = "5만원";
		default -> coupon = "1천원";
		}
		System.out.println(coupon);
	}
}
