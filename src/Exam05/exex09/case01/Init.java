package Exam05.exex09.case01;

import Exam05.exex06.case02.Console;

public class Init {
	private static int s;
	private int i;
	
	static {
		Init.s = 1;
		Console.info("static{}");
	}
	
	{
		this.i = 1;
		Init.s = 1;
		Console.info("{}");
	}
	
	{
		Console.info("{}2");
	}
	
	public Init() {
		Console.info("Init()");
	}
	
	public Init(int i) {
		Console.info("Init(int)");
	}
	
}
