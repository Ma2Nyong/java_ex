package Exam05.exex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n>");
	}
	
	public static String inStr(String msg) {
		String tmp = "";
		boolean isGood = false;
		do {
			Console.inMsg(msg);
			tmp = sc.nextLine();
			isGood = tmp.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err("문자가 아닙니다.");
		}while (!isGood);
		
		return tmp;
	}
	
	public static int inNum(String msg) {
		String tmp = "";
		boolean isGood = false;
		do {
			Console.inMsg(msg);
			tmp = sc.nextLine();
			isGood = tmp.matches("^[1-9][0-9]*");
			if(!isGood) Console.err("자연수가 아닙니다.");
		}while (!isGood);
	
		return Integer.parseInt(tmp);
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR]" + msg);
	}
}
