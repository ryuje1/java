import java.util.Arrays;
import java.util.Scanner;

public class C0725_06 {
	// 배열 //
	
	public static void main(String[] args) {
		// 배열
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[45];	//랜덤번호 45개
		int[] lotto = new int[6];	//로또번호 6개
		int[] myNo = new int[6];	//입력번호 6개
		int[] okNo = new int[6];	//정답번호 6개
		int count = 0;				//맞힌개수
		
		for(int i=0; i<6; i++) {
			System.out.println("입력된 번호 : "+Arrays.toString(myNo));
			System.out.println("1-45까지 번호를 입력하세요.  ");
			myNo[i] = scan.nextInt();
		}
		
		
		// 배열 번호 입력
		for(int i=0; i<45; i++) {
			arr[i] = i+1;
		}
		
		// 랜덤 섞기	**중요
		int temp = 0;	// 임시저장번호
		int rnum = 0;	// 랜덤번호
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);		// 0-44
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		// 배열 복사 (arraycopy 메소드 사용)
		System.arraycopy(arr, 0, lotto, 0, 6);
		
		
		//배열 번호출력
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+"  ");
		}
		
//		//배열 번호출력
//		for(int i=0; i<45; i++) {
//			if(i==0) {
//				System.out.print(arr[i]+"\t");
//				continue;
//			}
//			else if(i%5==0) {
//				System.err.println();
//			}
//			System.out.print(arr[i]+"\t");
//		}
		
		
		
//		int rnum = (int)(Math.random()*45)+1;
		
//		0*10 <= x*10 < 1*10
//		(int)0 <= (int)(x*10) < (int)10
//		(int)0+1 <= (int)(x*10)+1 < (int)10+1
//		1 <= (int)(x*10)+1 <= 10		

//		int a = (int)(Math.random()*10)+1;
//		int a_2 = (int)(Math.random()*100)+1;
//		int a_3 = (int)(Math.random()*50)+1;
//		int a_4 = (int)(Math.random()*50);		//0-49
//		int a_5 = (int)(Math.random()*10);		//0-9
//		int a_6 = (int)(Math.random()*45);		//0-44
//		int a_7 = (int)(Math.random()*45)+1;	//1-45
		
//		double a = Math.random();
//		System.out.println(a);
		
		
//		// 퀴즈
//		// 45개 배열을 생성해서 1-45까지 숫자를 입력하시오.
//		int[] arr = new int[45];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//			System.out.println(arr[i]);
//		}
		
		
//		// 배열선언
//		int[] arr = new int[5];
//		// 배열 값 입력
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
//		int[] arr = {1,2,3,4,5};  // 배열 선언과 값 입력		=> 자주 사용
//		int[] arr = new int[] {1,2,3,4,5};	// 위와 동일
		
//		// 배열 선언 후 for문으로 값 입력		=> 값이 많을때 자주 사용
//		int[] arr = new int[5];
//		for(int i=0; i<5; i++) {
//			arr[i] = i+1;
//		}
//		
//		
//		// 배열 출력
//		for(int i=0; i<5; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
	}

}
