import java.util.Scanner;

public class C0721_10 {
	// Scanner 문제, printf //

	public static void main(String[] args) {
		// 이름, 국어점수, 영어점수를 입력받아 이름,국어,영어,합계점수를 출력하시오.
		// 1.Scanner 2.이름 3.국어 4.영어 -> 이름,국어,영어,합계점수 출력
		
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
//		double avg = total/3;			// 99.0 -> total int타입, 3도 int타입이라 소수점 안나옴
		double avg = total/3.0;			// 99.66666666666667
//		double avg = (double)total/3;	// 99.66666666666667
//		double avg = total/(double)3;	// 99.66666666666667
		
		System.out.println("이름 : "+name);
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("합계점수 : "+total);
		System.out.println("평균점수 : "+avg);			// 99.66666666666667 15자리까지만 유효, 16자리(7)부터는 정확하지 않음 - 의미없는 숫자
		
		// println은 자리수 결정이 안됨 => printf 사용
		System.out.printf("합계 : %d \n", total);		// 정수
		System.out.printf("평균 : %.2f \n", avg);		// 실수
		System.out.printf("평균 : %e \n", avg);		// 지수
		
		System.out.println("---------------------------------------------");
		System.out.printf("이름 : %s, 국어:%d, 영어:%d, 수학:%d, 합계:%d, 평균:%.2f \n", name, kor, eng, math, total, avg);
		
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg);
	}

}
