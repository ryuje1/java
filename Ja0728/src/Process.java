import java.util.Arrays;
import java.util.Scanner;

public class Process {
	Scanner scan = new Scanner(System.in);	// 인스턴스 변수 => 모든 메소드가 공용으로 사용가능 (=전역변수) numProcess(), gugudan() 둘 다 사용가능
	// 인스턴스변수 : 객체선언 해야 사용가능. / 클래스변수 : 객체선언 없이 사용가능. 공용으로 사용
	
	void numProcess(){
		// 숫자맞추기 프로그램 구현하시오.
		// 랜덤 1-100까지 10번 입력받고 10번 이후 정답 출력
		int[] input = new int[10];
		int answer = (int)(Math.random()*100)+1;

		int i = 0;
		while(i<10) {
			System.out.println("[ 숫자 맞추기 ]");
			System.out.println("1-100까지 숫자를 입력해주세요.  ");
			input[i] = scan.nextInt();
			
			if(input[i] == answer) {
				System.out.println("정답!!");
			}else if(input[i] > answer) {
				System.out.println("오답!! 입력숫자가 더 큽니다.");
			}else {
				System.out.println("오답!! 입력숫자가 더 작습니다.");
			}
			System.out.println();
		}
		
		System.out.println("정답 : "+answer);
		System.out.println("입력번호 : "+Arrays.toString(input));
	}
	
	
	void gugudan() {
		// 구구단
		System.out.println("2단에서부터 원하는 단을 입력하세요.");
		int number = scan.nextInt();
		
		System.out.println("[ 구구단 ]");
		System.out.println("-------------------");
		
		for(int i=2; i<=number; i++) {
			System.out.printf("[ %d단 ]\n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	
	// 자바 메소드 단점 : return은 1개만 보낼 수 있음 (파이썬은 여러개 가능~)
	void resultProcess(int a, int b, double[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
	
	
	// 로또 맞추기 메소드
	int lottoProcess(int count, int[] myNo, int[] num, int[] lotto, int[] okNo) {
		
		// 로또번호
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		// 번호섞기
		int temp = 0;
		int rnum = 0;
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 배열 복사
		System.arraycopy(num, 0, lotto, 0, 6);
		
		// myNo 번호 입력
		for(int i=0; i<myNo.length; i++) {
			System.out.printf("%d. 1-45까지 숫자를 입력해주세요.  ", i+1);
			myNo[i] = scan.nextInt();
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {				
				if(myNo[i] == lotto[j]) {
					okNo[count] = lotto[j];
					count++;
					break;
				}
			}
		}
		
		return count;
	}
	
	
	

}
