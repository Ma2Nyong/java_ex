package Exam07.home.ex04.case02;

public class Card {
	public int cardNum;
	
	public Card(int cardNum) {
		this.cardNum = cardNum;
	}
	
	@Override
	public String toString() {
		return this.cardNum + " ";
	}
}
