package Exam04.exex01;

public class E03If {
	public static void main(String[] args) {
		int hour = 13;
		
		if(hour < 12) {
			System.out.println("Good Morning.");
		} else if (hour < 18) {
			System.out.println("Good Afternoon.");
		} else if (hour < 21) {
			System.out.println("Good evening.");
		} else {
			System.out.println("Good night.");
		}
		
		String bow = "";
		if (hour < 12) bow = "Good Morning.";
		else if (hour < 18) bow = "Good Afternoon.";
		else if (hour < 21) bow = "Good enening.";
		else bow = "Good night.";
		System.out.println(bow);
	}
}
