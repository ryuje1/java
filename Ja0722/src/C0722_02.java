import java.util.Scanner;

public class C0722_02 {
	// Scanner //

	// 메소드 (함수) - 제일 처음에 시작하는 함수가 main 함수
	public static void main(String[] args) {
		// 입력 받으려면
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.  ");
		String name = scan.nextLine();
		
		System.out.println("국어점수를 입력하세요.  ");
		// nextByte(), nextShort(), nextLong(), nextFloat(), nextDouble()
		int kor = scan.nextInt();
		
		System.out.println("영어점수를 입력하세요.  ");
		int eng = scan.nextInt();
		
		System.out.println("수학점수를 입력하세요.  ");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("이름 : "+name);
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("합계 : "+total);
		System.out.printf("평균 : %.2f \n", avg);
		
		System.out.println("------------------------------------------------------------");
		// %d - 정수, %s - 문자열, %f - 실수, %c - 문자
		System.out.printf("%s, %d, %d, %d, %d, %.2f \n", name, kor, eng, math, total, avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name, kor, eng, math, total, avg);
	}

}
