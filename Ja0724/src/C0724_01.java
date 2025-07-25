import java.util.Scanner;

public class C0724_01 {
	// 2차원 배열 //

	public static void main(String[] args) {
		// 이름 5개를 입력받아 출력하시오.
		// 국어,영어,수학,합계,평균 출력하시오.
		// 이름 국어 영어 수학 합계 평균
		// 홍길동 100 100 99 299 99.67
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d. 이름을 입력해주세요.  \n", i+1);
			name[i] = scan.next();
			System.out.printf("%d. 국어성적을 입력해주세요.  \n", i+1);
			kor[i] = scan.nextInt();
			System.out.printf("%d. 영어성적을 입력해주세요.  \n", i+1);
			eng[i] = scan.nextInt();
			System.out.printf("%d. 수학성적을 입력해주세요.  \n", i+1);
			math[i] = scan.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		
		System.out.println();
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("----------------------------------------------");
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], kor[i], eng[i], math[i], total[i], avg[i]);
		}
		
		
//		// 배열 선언 1
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		
//		for(int i=0; i<5; i++) {
//			arr[i] = i+1;
//		}
//		
//		// 배열 선언 2
//		int[] arr2 = {1,2,3,4,5};
//		
//		// 배열 선언 3
//		int[] arr3 = new int[] {1,2,3,4,5};
//		
//		
//		// 출력
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}

}
