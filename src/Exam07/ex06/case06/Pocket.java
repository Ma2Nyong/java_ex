package Exam07.ex06.case06;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
	}
	
	public void printList(List<?> list) {
		System.out.println(list);
	}
	
	public double add(List<? extends Number> list) {
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();
		
		return sum;
	}
	
}
