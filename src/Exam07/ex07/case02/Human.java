package Exam07.ex07.case02;

@FunctionalInterface
public interface Human {
	void say(); // fuctional 은 추상메소드 하나만 가질 수 있다.
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}
