package Exam02.exex01;

import java.util.Scanner;

public class E03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String str = sc.nextLine();
		//System.out.printf("%s 을 입력했습니다.", str);
		
		/*
		System.out.print("숫자를 입력하세요. \n>");
		int i = sc.nextInt();
		System.out.print(i + "을 입력했습니다.");
		
		System.out.print("숫자를 입력하세요. \n>");
		i = sc.nextInt(); sc.nextLine();
		System.out.print(i + "을 입력했습니다.");
		
		System.out.print("문자열을 입력하세요. \n>");
		String str = sc.nextLine();
		System.out.println(str + "을 입력했습니다.");
		*/
		
		System.out.print("문자를 입력하세요. \n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c + "를 입력했습니다.");
	}
}
