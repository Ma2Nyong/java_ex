package Exam03.exex09;

public class E02Grade {
	public static void main(String[] args) {
		int score = 50;
		char grade = score >= 90 ? 'A' : (score >= 80  ? 'B' : 'C' );
		System.out.println(grade);
	}
}
