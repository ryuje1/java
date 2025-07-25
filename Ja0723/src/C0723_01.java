import java.util.Scanner;

public class C0723_01 {
	// 21억 이하/이상 계산 //

	public static void main(String[] args) {
		// 숫자 입력받아
		Scanner scan = new Scanner(System.in);
		
		//
		System.out.println("[ 덧셈 프로그램 ]");
		System.out.println("1. 21억 이하 덧셈");
		System.out.println("2. 21억 이상 덧셈");
		System.out.println("-----------------");
		System.out.println("원하는 번호를 입력하세요.  ");
		int choice = scan.nextInt();	// nextDouble()
		
		switch(choice) {
		case 1:
			// 21억 이하 int
			System.out.println("숫자를 입력하세요  ");
			int input = scan.nextInt();
			System.out.println("숫자2를 입력하세요  ");
			int input2 = scan.nextInt();
			int total = input+input2;
			System.out.println("합계 : "+total);
			break;
		case 2:
			// 21억 이상 long
			System.out.println("숫자를 입력하세요  ");
			int inputL = scan.nextInt();
			System.out.println("숫자2를 입력하세요  ");
			int inputL2 = scan.nextInt();
			long totalL = inputL+(long)inputL2;
			System.out.println("합계 : "+totalL);
			break;
		}
		
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		System.out.println("숫자2를 입력하세요.");
//		int input2 = scan.nextInt();
//		long total = input+(long)input2;
//		
//		System.out.println("입력숫자 : "+input);
//		System.out.println("입력숫자2 : "+input2);
//		System.out.println("합계 : "+total);
	}

}
