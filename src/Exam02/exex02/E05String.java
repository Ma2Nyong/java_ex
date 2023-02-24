package Exam02.exex02;

public class E05String {
	public static void main(String[] args) {
		String comment = """
				이 식당에 방문하길 잘했네요.
				"참 맛있다."
				라는 말이 절로 나오네요.
				""";
		System.out.println(comment);
		
		String color = """
				red
				green
				blue
				""";
		System.out.println(color);
		
		color = """
				red  \s
				green\s
				blue \s
				""";
		System.out.println(color);
		
		String type = "int";
		String code = """
				public void println(val);
				)""";
		System.out.println(code);
		
		code = """
				<html>
					<body>
						<p>Hello, Java</p>
					</body>
				</html>		""";
		System.out.println("|" + code + "|");
	}
}
