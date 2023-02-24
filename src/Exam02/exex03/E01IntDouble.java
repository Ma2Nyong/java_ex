package Exam02.exex03;

public class E01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i;
		System.out.printf("%f, %d\n", d, i);
		
		i = (int)d;
		System.out.printf("%f, %d", d, i);
	}
}
