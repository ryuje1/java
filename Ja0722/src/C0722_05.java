import java.util.Scanner;

public class C0722_05 {
	// if문, OR(||)/AND(&&) //

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.  ");
		String input = scan.next();		// scan.nextInt()  scan.nextChar() X
		char ch = input.charAt(0);		// charAt(n):n번째 문자를 떼오라는 의미  abc -> a:0, b:1, c:2
		System.out.println("입력 문자 : "+ch);
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.  ");
//		int num = scan.nextInt();
//		// 1과 10 사이인지 확인해서 1~10 사이의 숫자입니다 / 1~10 사이의 숫자가 아닙니다.
//		if (num >=1 && num <=10) {
//			System.out.println("1~10 사이의 숫자입니다.");
//		}else {
//			System.out.println("1~10 사이의 숫자가 아닙니다.");
//		}
//		
//		if(num<1 || num>10) {
//			System.out.println("1~10 사이의 숫자가 아닙니다.");
//		}else {
//			System.out.println("1~10 사이의 숫자입니다.");
//		}
		
		
//		double d = 0.1f;
//		System.out.println(d);
//		
//		double d_2 = 0.1;
//		System.out.println(d_2);
		
		
//		if ('A'== 65) {  // A:65, a:97, 0:48
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
//		// 숫자를 입력받아, 10보다 큰수인지 작은수인지 출력하시오.
//		// 10보다 큰수입니다 / 10보다 작은수입니다.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.  ");
//		int num = scan.nextInt();	
//		System.out.println("입력한 숫자 : "+num);
//		
//		if(num > 10) {
//			System.out.println("10보다 큰수입니다.");
//		}else if(num < 10) {
//			System.out.println("10보다 작은 수입니다.");
//		}
		
		
//		int share = 10/8;   // 몫
////		double share2 = 10/8.0;
//		int remain = 10%8;  // 나머지
//		System.out.println(share);
//		System.out.println(remain);
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.  ");
//		int input = scan.nextInt();
//		if(input%2 == 0) {
//			System.out.println("짝수 입니다. ");
//		}else {
//			System.out.println("홀수 입니다. ");
//		}
		
	}

}
