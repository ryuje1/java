import java.util.Scanner;

public class C0723_06 {
	// 중첩 for문 //

	public static void main(String[] args) {

		System.out.printf("[%5d]\n", 5);
		System.out.printf("[%05d]\n", 5);
		
		for(int i=1; i<=100; i++) {
			System.out.printf("%03d \n", i);
		}
		
		int a = 99;
		System.out.println("0"+a);	//099
		String str = String.format("%03d", a);
		System.out.println(str);
		
//		// 별찍기 1 > 2 > 3 > 4 > 5
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// 별찍기 5 > 4 > 3 > 2 > 1
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

//		// 구구단을 출력
//		// 2 x 1 = 2	3 x 1 = 3	4 x 1 = 4	...
//		// 2 x 2 = 2
//		for(int i=2; i<=9; i++) {
//			System.out.printf("[ %d 단 ]\t\t", i);
//		}
//		System.out.println();
//		
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
//				System.out.printf("%d x %d = %d\t", j, i, i*j);
//			}
//			System.out.println();
//		}
//		
		
		
//		// 000 ~ 999 출력
//		for(int i=0; i<=9; i++) {
//			for(int j=0; j<=9; j++) {
//				for(int k=0; k<=9; k++) {
////					System.out.println(""+i+j+k);
//					System.out.printf("%d%d%d\n", i, j, k);
//				}
//			}
//		}
		
		
//		// 2개 숫자를 입력받아, (3,7) 3~7단까지 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.  ");
//		int num = scan.nextInt();
//		System.out.println("숫자2를 입력하세요.  ");
//		int num2 = scan.nextInt();
//		
//		int temp = 0;
//		if(num > num2) {
//			temp = num;
//			num = num2;
//			num2 = temp;
//		}
//		
//		System.out.println();
//		for(int i=num; i<=num2; i++) {
//			System.out.printf("[ %d 단 ] \n", i);
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d * %d = %d \n", i, j, i*j);
//			}
//			System.out.println();
//		}
		
		
//		// 중첩 for문
//		// 구구단 출력
//		for(int i=2; i<=9; i++) {
//			System.out.printf("[ %d 단 ] \n", i);
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d x %d = %d \n", i, j, i*j);
//			}
//			System.out.println();
//		}
	}
}
