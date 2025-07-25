import java.util.Scanner;

public class C0722_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.  ");
		int score = scan.nextInt();
		
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그 이하 F
		// 100~97 : A+, 96~94 : A, 90~93 : A-
		String result = "";
		if (score>=90) {
//			System.out.print("A");
//			if(score >= 97) {
//				System.out.print("+");
//			}else if (score <= 93 ) {
//				System.out.print("-");
//			}
			result = "A";
			if(score >=97) {
				result += "+";
			}else if(score<=93) {
				result += "-";
			}
		}else if(score>=80) {
			System.out.print("B");
			if(score >= 87) {
				System.out.print("+");
			}else if (score <= 83 ) {
				System.out.print("-");
			}
		}else if(score>=70) {
			System.out.print("C");
			if(score >= 77) {
				System.out.print("+");
			}else if (score <= 73 ) {
				System.out.print("-");
			}
		}else if(score>=60) {
			System.out.print("D");
			if(score >= 67) {
				System.out.print("+");
			}else if (score <= 63 ) {
				System.out.print("-");
			}
		}else {
			System.out.println("F");
		}
		
		System.out.println("결과 : "+result);
		
		
//		// 양수, 0, 음수
//		System.out.println("숫자를 입력해주세요.  ");
//		int input = scan.nextInt();
//		
//		if(input > 0) {
//			System.out.println("양수입니다.");
//		}else if(input==0) {
//			System.out.println("0 입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
		
	}

}
