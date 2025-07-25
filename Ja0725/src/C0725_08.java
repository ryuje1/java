import java.util.Arrays;
import java.util.Scanner;

public class C0725_08 {

	public static void main(String[] args) {
		// 로또번호 맞추기 프로그램
		Scanner scan = new Scanner(System.in);
		int[] num = new int[45];	// 1-45
		int[] lotto = new int[6];	// 로또번호
		int[] myNo = new int[6];	// 입력번호
		int[] okNo = new int[6];	// 정답번호
		int count = 0;				// 정답개수
		
		// 번호 넣기
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		// 번호 섞기
		int temp = 0;
		int rnum = 0;
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 로또번호 복사
		System.arraycopy(num, 0, lotto, 0, 6);
//		for(int i=0; i<6; i++) {
//			lotto[i] = num[i];
//		}
		
		// 직접입력 6개
		for(int i=0; i<6; i++) {
			System.out.println("1-45까지 숫자를 입력하세요.  ");
			myNo[i] = scan.nextInt();
		}
		
		// 출력
//		System.out.print("직접입력 : ");
//		for(int i=0; i<6; i++) {
//			System.out.print(myNo[i]+"\t");
//		}
//		System.out.println();
		
		// 입력번호, 로또번호 비교
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(myNo[i] == lotto[j]) {
					okNo[count] = myNo[i];
					count++;
					break;
				}
			}
		}
		
		
		System.out.println("직접입력 : "+Arrays.toString(myNo));
		System.out.println("로또번호 : "+Arrays.toString(lotto));
		System.out.print("정답번호 : ");
		for(int i=0; i<count; i++) {
			System.out.println(okNo[i]+",");
		}
		System.out.println();
		System.out.println("정답개수 : "+count);
		
		
		
	}

}
