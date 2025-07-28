import java.util.Scanner;

public class C0728_10 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 더하기/빼기/곱하기/나누기를 구성하시오.
		// 2개 -> 3개
		// Cal2.java를 만들어서 구성하시오.
		
		Scanner scan = new Scanner(System.in);
		Cal2 c2 = new Cal2();
		
		System.out.println("숫자를 3개 입력하세요.  ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("[ 사칙연산 프로그램 ]");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("원하는 번호를 입력하세요.  ");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			c2.add(a, b, c);
			break;
		case 2:
			c2.minus(a, b, c);
			break;
		case 3:
			c2.multi(a, b, c);
			break;
		case 4:
			c2.devide(a, b, c);
			break;
		}
		
		
	}

}
