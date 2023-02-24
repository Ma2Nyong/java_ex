package Exam05.exex09.case02;

public class Phone {
	private static int cnt;
	private int serial;
	
	{
		serial = ++cnt * 100;
	}
	
	public Phone() {}
	
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}
}
