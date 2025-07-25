import java.util.Scanner;

public class C0723_03 {
	// random() //

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		double ran = (int)(Math.random()*10)+1;  // 1-10
		int rnum = (int)(Math.random()*10)+1;
		System.out.println(rnum);
		System.out.println("[ 랜덤숫자 맞추기 ]");
		System.out.println("1-10까지 숫자를 입력하세요.  ");
		int input = scan.nextInt();
		
		// 정답   오답 1 - 입력숫자가 더 큽니다.  오답 2 - 입력숫자가 더 작습니다. 
		// if문 사용
		
		if (input > rnum) {
			System.out.println("입력 숫자가 더 큽니다.");
		}else if(input < rnum) {
			System.out.println("입력숫자가 더 작습니다");
		}else {
			System.out.println("정답~!~!~!~!~!!!!");
		}
		
		System.out.println(rnum);
	}

}
