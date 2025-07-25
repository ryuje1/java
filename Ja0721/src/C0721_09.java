import java.util.Scanner;

public class C0721_09 {
	// Scanner 문제 //

	public static void main(String[] args) {
		// 두 숫자를 입력받아 더한 값을 출력하시오.
		// 100 + 5 = 105
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자1를 입력해주세요. ");
		int num1 = scan.nextInt();
		System.out.println("숫자2를 입력해주세요. ");
		int num2 = scan.nextInt();
		System.out.println("숫자 더하기 : "+(num1+num2));
		int result = num1+num2;
		System.out.println("숫자 더하기 : "+result);
		
	}

}
