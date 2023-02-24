package Exam05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Flower flower1 = new Flower();
		flower1.flowerName = "창포꽃";
		flower1.petalLength = 7;
		flower1.sepalLength = 2;
		
		Flower flower2 = new Flower();
		flower2.flowerName = "코스모스";
		flower2.petalLength = 4;
		flower2.sepalLength = 1;
		
		System.out.printf("%s은 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.", flower1.flowerName, flower1.petalLength, flower1.sepalLength);
		System.out.println();
		System.out.printf("%s는 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.", flower2.flowerName, flower2.petalLength, flower2.sepalLength);
	}
}

/*
창포꽃은 꽃잎 길이가 7cm, 꽃 받침 길이가 2cm 입니다.
코스모스는 꽃잎 길이가 4cm, 꽃 받침 길이가 1cm 입니다.
*/