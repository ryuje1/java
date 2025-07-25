import java.util.Scanner;

public class C0723_07 {
	// while문 //
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.  ");
		int num = scan.nextInt();
		System.out.println("1) 짝수   2) 홀수   3) 모두");
		int num2 = scan.nextInt();
		
		int i = 1;
		while(i<=100) {
			if(num < i) break;
			if(num2 == 1) {
				if(i%2==1) {					
					i++;
					continue;
				}
			}else if(num2 == 2) {
				if(i%2==0) {					
					i++;
					continue;
				}
			}
			System.out.println(i);
			if(i == num) break;
			i++;
		}
		
		
//		// 입력된 숫자에서 멈춤하는 프로그램을 구현하시오.
//		int i = 0;
//		while(true) {
//			System.out.println(i);
//			if(i == num) break;
//			i++;
//		}
		
		
		
//		// 1-100까지 랜덤숫자 출력하시오.
//		int rnum = (int)(Math.random()*100)+1;
//		
//		// 10번을 입력받아 (10번 이후 종료)
//		// 입력 : 5		정답, 오답 입력된숫자가 큽/작습 니다
//		// 정답 : 값
//		Scanner scan = new Scanner(System.in);
//		System.out.println("~랜덤 숫자 맞추기 게임~");
//		
//		int i = 0;
//		while(i<=10) {
//			System.out.println("숫자를 입력해주세요.  ");
//			int num = scan.nextInt();
//			if(num == rnum) {
//				System.out.println("정답입니다~~~!!~!~!~!~!~!~!~~!!~~!");
//				System.out.printf("입력숫자 : %d, 정답 : %d \n", num, rnum);
//				break;
//			}else if(num > rnum) {
//				System.out.println("땡!!!!!!! 입력숫자가 더 큽니다");
//			}else {
//				System.out.println("땡!!!!!!! 입력숫자가 더 작습니다");
//			}
//			i++;
//		}
		
		
//		// 구구단 2-9단까지 출력하시오.
//		// 2 x 1 = 2
//		int i = 2;
//		
//		while(i<=9) {
//			System.out.printf("[ %d 단 ]\n", i);
//			int j = 1;
//			while(j<=9) {
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		// 1~500 까지 합을 구하시오.
//		int sum = 0;
//		int i = 1;
//		while(i<=500) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1-500까지의 합계 : "+sum);
		
//		// 500을 넘는 시점의 i, sum 출력하시오.
//		int sum = 0;
//		int i = 1;
//		while(i<=500) {
//			sum += i;
//			if(sum >= 500) break;
//			i++;
//		}
//		System.out.printf("i : %d, sum : %d\n", i-1, sum-i);
//		System.out.printf("i : %d, sum : %d\n", i, sum);
		
		
//		// while
//		int sum = 0;
//		int i = 1;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println("합계 : "+sum);
//		
//		System.out.println("----------------");
//		
//		// for
//		int sum = 0;
//		int i = 1;
//		for(i=1; i<=10; i++) {
//			sum += i;
//		}
//		
//		System.out.println("합계 : "+sum);
	}

}
