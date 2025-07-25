import java.util.Scanner;

public class C0723_04 {
	// 반복문 //

	public static void main(String[] args) {
		int rnum = (int)(Math.random()*10)+1;	// 1-10까지 랜덤숫자 생성
		
		for(int i=0; i<5; i++) {
			// 숫자 맞추기 프로그램
			
			Scanner scan = new Scanner(System.in);
			System.out.printf("숫자를 입력해주세요. (%d)  \n", (i+1));
			int choice = scan.nextInt();
			
			if (choice==rnum) {				
				System.out.printf("정답!  입력 : %d \n", choice);
				break;
			}else if(choice > rnum) {				
				System.out.println("오답! 입력한 수가 랜덤 수보다 큽니다.");
			}else {				
				System.out.println("오답! 입력한 수가 랜덤 수보다 작습니다.");
			}
			
		}
		System.out.println("정답 : "+rnum);
		
		
//		int a = 1;
//		int b = 2;
//		int c,d = 0;
//		int e=0, f=10;			// 같은 타입은 한줄로 표기 가능
////		int g=0, double h = 0;  // 다른 타입은 한줄로 표기 불가
		
		
//		// 무한반복
//		for (int i=0;; i++) {
//			System.out.println(i);
//		}
//		
//		while(true) {
//			// 무한반복
//		}
		
		
//		int sum = 0;
//		for (int i=1; i<=10; i++) {
//			sum = sum+i;
////			sum += i;
//		}
//		
//		System.out.println(sum);
		
		
//		// 1-10:55  1-100:5050  1-1000:500500  1-10000:50005000
//		int sum = 0;
//		int i = 0;
//		for(i=1; i<=10; i++) {
//			System.out.println(i);
//			sum += i;
//		}
//		// 정수 %d, 실수 %f, 문자열 %s, 문자 %c
//		System.out.printf("[ 1 ~ %d까지의 합 : %d ]\n",(i-1), sum);
//		System.out.println("합계 "+sum);
//		
		
		
//		// 반복문 - for, while, do while
//		// 처리속도는 동일
//		for(int i=0; i<10; i+=2) {
//			System.out.println(i);
//		}
//		
//		System.out.println("---------------");
//		
//		int j=0;
//		while(j<10) {
//			System.out.println(j);
//			j++;
//		}
//		
//		System.out.println("---------------");
//		
//		// do while : 1번은 꼭 실행되어야 할때 사용
//		int k=0;
//		do {
//			System.out.println(k);
//			k++;
//		}while(k<10);
		
	}

}
