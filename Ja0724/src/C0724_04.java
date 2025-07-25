import java.util.Scanner;

public class C0724_04 {
	// 로또 번호 맞추기 입력번호, 로또번호 출력 - 중요 외우기** // 

	public static void main(String[] args) {
		// 1-45 까지 숫자 6개를 입력받고
		// 로또번호 6개를 생성해서 출력하시오.
		// 입력번호 : 1 45 3 10 5 20
		// 로또번호 : 20 4 9 35 7 21
		Scanner scan = new Scanner(System.in);
		
		// 1-45 번호 입력
		int[] num = new int[45];
		for(int i=0; i<45; i++) {
			num[i] = i+1;
		}
		
		// 번호 입력받기
		int[] input = new int[6];
		for(int i=0; i<input.length; i++) {
			System.out.printf("%d. 번호를 입력하세요.  \n", i+1);
			input[i] = scan.nextInt();
		}
		
		// 1-45 번호 섞기
		int rnum = 0;
		int temp = 0;
		for(int i=0; i<300; i++) {			
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		System.out.println();
		
		// 출력
		System.out.print("입력 번호 : ");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		
		System.out.println();
		
		int[] lotto = new int[6];
		System.out.print("로또 번호 : ");
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = num[i];
			System.out.print(lotto[i]+" ");
		}
		
	}

}
