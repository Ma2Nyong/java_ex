package Exam02.exex01;

public class E05Scope {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		{
			int x = 0;
			int y = 0;
		}
		int x = 0;
	}
}
