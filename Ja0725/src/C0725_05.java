import java.util.Scanner;

public class C0725_05 {
	// for문, while문

	public static void main(String[] args) {
		// 반복문
		Scanner scan = new Scanner(System.in);
		
		while(true) {			
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("원하는 번호를 입력하세요.  ");
			int choice = scan.nextInt();
			if(choice == 0) {
				break;
			}
		}
		
		
		
//		// for문 무한반복 (조건식이 없으면 무한반복)
//		int i = 0;
//		for(;;i++) {
//			System.out.println(i);
//		}
//		
//		
//		// while문 무한반복 (조건이 true이면 무한반복)
//		int i = 0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}
		
		
//		int sum = 0;
//		int i = 0;
//		while(i<=10) {
//			sum = sum + i;
//			i++;
//		}
//		
//		System.out.println(i-1);
//		System.out.println("합계 : "+sum);
		
		
//		int sum = 0;
//		int i = 0;
//		for(i=1; i<=10; i++) {
//			sum = sum + i;
//		}
//		
//		System.out.println(i);
//		System.out.println("합계 : "+sum);
		
		
		
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}
		
		
	}

}
