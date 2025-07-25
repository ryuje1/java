import java.util.Scanner;

public class C0724_07 {
	// 2차원 배열 - 중요 외우기** //

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 입력받아 출력하시오.
		// 1. 변수 배열 선언 - name, score, total, avg
		// 2. 값 입력 - 이름
		// 3. score 값 입력 - 국어, 영어, 수학
		// 4. total, avg 값 입력
		// 5. 출력
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"국어", "영어", "수학"};
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d. 이름을 입력해주세요.  \n", i+1);
			name[i] = scan.next();
			for(int j=0; j<score[i].length; j++) {				
				System.out.printf("%d. %s점수를 입력해주세요.  \n", i+1, title[j]);
				score[i][j] = scan.nextInt();
			}
			total[i] = score[i][0]+score[i][1]+score[i][2];
			avg[i] = total[i]/3.0;
		}
		
		System.out.println();
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-----------------------------------------------");
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score.length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f \n", avg[i]);
		}
	}

}
