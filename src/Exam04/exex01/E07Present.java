package Exam04.exex01;

import java.util.Scanner;

public class E07Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mainChoice = 0;
		int subChoice = 0;
		String prize = "";
		String maker = "";
		
		System.out.print("1.냉장고, 2.세탁기\n> ");
		mainChoice = sc.nextInt();
		
		if(mainChoice == 1) prize = "냉장고";
		else if(mainChoice == 2) prize = "세탁기";
		else prize = "화장지";
		
		if(mainChoice < 3) {
			System.out.print("1.삼성, 2.LG\n> ");
			subChoice = sc.nextInt();
			if(subChoice == 1) maker = "삼성";
			else maker = "lG";
		}
		
		prize = maker + " " + prize;
		System.out.println(prize);
	}
}
