import java.util.Scanner;

public class C0722_08 {

	public static void main(String[] args) {
		// if, switch - 조건문 / for, while - 반복문
		
//		String jumin = "880101-1011111";
//		String jumin2 = "991231-2011111";
//		char n = jumin2.charAt(7);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요");
		String input = scan.next();
		char n = input.charAt(7);
		
		if (n == '1' || n == '3' || n == '5') {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}
		
		switch(n) {
		case 1:
			System.out.println("남자입니다.");
		case 2:
			System.out.println("여자입니다.");
		case 3:
			System.out.println("남자입니다.");
		case 4:
			System.out.println("여자입니다.");
		}
		
		
//		int num = 5;
//		if(num%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		
		
//		// 상수는 값 변경 불가
//		final int MAX = 10;
//		MAX = 5;
	}

}
