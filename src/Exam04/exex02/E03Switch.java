package Exam04.exex02;

public class E03Switch {
	public static void main(String[] args) {
		int day = 2;
		
		String dayName = switch(day) {
		case 1 -> "sunday";
		case 2 -> "monday";
		case 3 -> "tuesday";
		case 4 -> "wednesday";
		case 5 -> "thursday";
		case 6 -> "firday";
		case 7 -> "saturday";
		default -> "none";
		};
		
		System.out.println(dayName);
	}
}
