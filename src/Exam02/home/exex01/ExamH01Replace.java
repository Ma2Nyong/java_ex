package Exam02.home.exex01;

public class ExamH01Replace {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("%d %d\n", a, b);
		
	}
}
