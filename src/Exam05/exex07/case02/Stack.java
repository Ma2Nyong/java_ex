package Exam05.exex07.case02;

import Exam05.exex06.case02.Console;

public class Stack {
	public static void first() {
		Console.info("first() start.");
		
		int a = 0;
		Stack.second();
		
		Console.info("first() end.");
	}
	
	public static void second() {
		Console.info("second() start.");
		
		int a = 0;
		
		Console.info("second() end.");
	}
}
