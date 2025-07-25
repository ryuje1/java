import java.util.Scanner;

public class C0724_10 {
	// 학생성적프로그램 연습 //

	public static void main(String[] args) {
		
		// 1. 변수배열선언 - 번호, 이름, 점수, 합계, 평균, 타이틀, count
		// 2. 출력 구문 - while(true), switch구문
		// 3. 입력부분
		// 4. 취소부분 추가
		// 5. 출력부분
		// 6. 프로그램 종료 부분
		
		Scanner scan = new Scanner(System.in);
		
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0;
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
	
		loop:while(true) {
			System.out.println("[ 성적프로그램 ]");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적수정");
			System.out.println("3. 학생성적출력");
			System.out.println("0. 프로그램종료");
			System.out.println("번호를 입력해주세요.  (0.종료)  ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				
				no[count] = count +1;
				System.out.printf("%d번 학생 이름을 입력하세요.  (0.이전)  ", count+1);
				name[count] = scan.next();
				if (name[count].equals("0")) break;
				
				for(int i=0; i<score.length; i++) {
					System.out.printf("%s성적을 입력해주세요.  ", title[i+2]);
					score[count][i] = scan.nextInt();
				}
				total[count] = score[count][0] + score[count][1] + score[count][2];
				avg[count] = total[count]/3.0;
				
				System.out.printf("%d번 학생 성적이 입력되었습니다. \n", count+1);
				
				break;
			case 2:
				System.out.println("[ 학생성적출력 ] ");
				for(int i=0; i<title.length; i++) {
					System.out.print(title[i]+"\n");
				}
				System.out.println("-------------------------------------------------------");
				for(int i=0; i<score.length; i++) {
					System.out.print(no[i]+"\t");
					System.out.print(name[i]+"\t");
					for(int j=0; j<score.length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.print(total[i]+"\t");
					System.out.printf("%.2f \n", avg[i]);
				}
				
				break;
			case 3:
				System.out.println("[ 학생성적수정 ]");
				break;
			case 0:
				System.out.println("종료합니다.");
				break loop;
			}
		}
		
		
	}

}
