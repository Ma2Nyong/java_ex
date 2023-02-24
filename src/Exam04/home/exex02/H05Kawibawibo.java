package Exam04.home.exex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String meNum = "";
		String youNum = "";
		String bow = "";
		
		int Num1 = (int)(Math.random() * 3) +1;
		
		System.out.print("1.가위, 2.바위, 3.보\n>");
		int Num2 = sc.nextInt();
		
		switch(Num1) {
		case 1 -> meNum = "가위";
		case 2 -> meNum = "바위";
		case 3 -> meNum = "보";
		};
		
		switch(Num2) {
		case 1 -> youNum = "가위";
		case 2 -> youNum = "바위";
		case 3 -> youNum = "보";
		};
		
		if(meNum == youNum) bow = "Fair";
		else if (Num1 == 1 && Num2 == 2) bow = "you Win";
		else if (Num1 == 2 && Num2 == 3) bow = "you Win";
		else if (Num1 == 3 && Num2 == 1) bow = "you Win";
		else bow = "you lose";
		
		if (0 < Num2 && Num2 < 4) System.out.printf("you: %s\nme: %s\n", youNum, meNum);
		else bow = "입력값을 수정하여 주십시오."; // 왜 안되냐고!!
		
		System.out.println(bow); 
	}
}
/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라.
You win.
You lose.
Fair
중 하나이다.
--

1.가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/