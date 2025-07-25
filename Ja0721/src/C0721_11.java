import java.util.Scanner;

public class C0721_11 {
	// scanner, printf //
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.  ");
		String name = scan.nextLine();
		System.out.println("국어점수를 입력하세요.  ");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.  ");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.  ");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("----------------------------------------------------------");
		System.out.printf("%s, %d, %d, %d, %d, %.2f \n", name, kor, eng, math, total, avg);

	}

}
