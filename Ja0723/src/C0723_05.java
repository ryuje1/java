import java.util.Scanner;

public class C0723_05 {
	// for문 //

	public static void main(String[] args) {
		
//		// 1-100까지의 합을 출력하시오.
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			sum += i;
//		}
//		System.out.printf("1-100까지의 합 : "+sum);
		
		// 1에서 얼마까지 해야 합계가 100이 넘는 시점을 출력하시오.
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			sum += i;
//			if (sum >= 100) {
//				System.out.printf("i : %d, sum : %d \n", i, sum);
//				break;
//			}
//		}
		
		// 500 넘는 시점 바로 전단계를 출력하시오.
		int sum = 0;
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
			System.out.printf("i : %d, sum : %d \n", i, sum);
			if (sum >= 500) break;
		}
		System.out.printf("i : %d, sum : %d \n", i-1, sum-i);
		
		
//		// 1-10까지 숫자의 합을 출력하시오.
//		// 두 수를 입력받아 (2,7) 2에서 7까지의 합을 구하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요   ");
//		int num = scan.nextInt();
//		System.out.println("숫자2를 입력해주세요   ");
//		int num2 = scan.nextInt();
//		int temp = 0;
//		if (num > num2) {
//			temp = num;
//			num = num2;
//			num2 = temp;
//		}
//		
//		int sum = 0;
//		for(int i=num; i<=num2; i++) {
//			sum += i;
//		}
//		System.out.println("합계 : "+sum);
		
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("합계 : "+sum);
	}

}
