import java.util.Scanner;

public class C0723_11 {
	// 배열 선언, 출력 //

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		int[] total = new int[2];
		double[] avg = new double[2];
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d. 이름을 입력해주세요  ", i+1);
			name[i] = scan.next();
			System.out.printf("%d. 국어점수를 입력해주세요  ", i+1);
			kor[i] = scan.nextInt();
			System.out.printf("%d. 영어점수를 입력해주세요  ", i+1);
			eng[i] = scan.nextInt();
			System.out.printf("%d. 수학점수를 입력해주세요  ", i+1);
			math[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
			
			System.out.printf("이름\t국어\t영어\t수학\t평균\n");
			System.out.println("--------------------");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], kor[i], eng[i], math[i], total[i], avg[i]);
			System.out.println();
		}
	}

}
