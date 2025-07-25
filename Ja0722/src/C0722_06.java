import java.util.Scanner;

public class C0722_06 {
	// charAt //

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.  ");
		String input = scan.next();
		
		char ch = input.charAt(0);
		
		// 숫자인지 아닌지 출력하시오.
		if(ch >= '0' && ch <= '9') {
			System.out.println("숫자입니다.");
			int num = ch-'0';	// 문자형을 정수형으로 타입 변경
								// Integer.parseInt(input)
		}else {
			System.out.println("숫자가 아닙니다");
		}
		
		
//		// 첫글자가 영문자인지 아닌지 출력하시오.
//		// 영문자입니다 / 영문자가 아닙니다.
//		
//		String input = scan.next();
//		char ch = input.charAt(0);
//		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//			System.out.println("영문자입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}
//		
//		System.out.println("입력 : "+input);
//		System.out.println("입력 1 : "+ch);
	}

}
