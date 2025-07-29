import java.util.Scanner;

public class C0729_10 {

	public static void main(String[] args) {
		// 학생성적입력
		// no - 객체선언을 하면
		// 자동으로 번호가 증가되도록 구현
		// 이름, 국어, 영어, 수학을
		// 합계, 평균까지 입력되도록 구현
		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		int n = 0;	//배열에 사용하는 번호
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("원하는 번호를 입력하세요.  ");
		int choice = scan.nextInt();
		
		while(true) {
			switch(choice) {
			case 1:
				// 프로그램 구현
				// 이름, 국어, 영어, 수학 입력받아
				// 매개변수가 있는 생성자를 사용 저장하시오.
				// Stuscore 클래스 -> 초기화블럭 사용해서 번호 증가
				
				// 입력정보 : 1, 홍길동, 100, 100, 99, 299, 99.67
				// 입력정보 : 2, 유관순, 90, 90, 91, 271, 90.33
				s[n] = new Stuscore();
				
				System.out.printf("%d. 이름을 입력하세요.  \n", n+1);
				s[n].name = scan.next();
				System.out.printf("%d. 국어점수를 입력하세요.  \n", n+1);
				s[n].kor = scan.nextInt();
				System.out.printf("%d. 영어점수를 입력하세요.  \n", n+1);
				s[n].eng = scan.nextInt();
				System.out.printf("%d. 수학점수를 입력하세요.  \n", n+1);
				s[n].math = scan.nextInt();
				s[n].total = s[n].kor+s[n].eng+s[n].math;
				s[n].avg = s[n].total/3.0;
				
				System.out.printf("입력정보 : %d, %s, %d, %d, %d, %d, %.2f \n", s[n].no+1, s[n].name, s[n].kor, s[n].eng, s[n].math, s[n].total, s[n].avg);
				
				n++;
				
				break;
			}
		}
		
	}

}
