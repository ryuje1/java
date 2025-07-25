import java.util.Scanner;

public class C0722_10 {
	// String 비교 - equals()함수 //

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String input = scan.next();
		String str1 = "c";	// == 비교안됨, equals()함수를 사용해야 비교가능
		char ch = 'c';
		
		if(input.equals("c") || input.equals("C")) {
			System.out.println("c입니다.");
		}else {
			System.out.println("c가 아닙니다.");
		}
		if(input.equalsIgnoreCase("c")) {
			System.out.println("c입니다.");
		}else {
			System.out.println("c가 아닙니다.");
		}
	}

}
