package Exam08.ex04.case01;

public class C05Hirearchy {
	public static void main(String[] args) {
		try {
			int i = 3 / 0;
		} catch(ArithmeticException e) {
			System.err.println("ArithmeticException.");
		} catch(Exception e) {
			System.err.println("Exception.");
		}
	}
}
