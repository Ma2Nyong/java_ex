package Exam03.exex09;

public class E01Ternary {
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? y : -y;
		
		System.out.println(absX + "," + absY);
	}
}
