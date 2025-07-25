import java.util.Scanner;

public class C0724_09 {
	// 학생성적프로그램 - 입력, 출력, 수정  중요 외우기** // 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 변수 배열 선언
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0;	// 입력된 학생 수
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
		int choice = 0;
		
		loop:while(true) {			
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("------------------");
			System.out.println("원하는 번호를 입력하세요.   (0.종료)  ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				
				no[count] = count+1;	// 학생번호 입력
				System.out.printf("%d번 학생 이름을 입력하세요.  (0.이전)  ", count+1);
				name[count] = scan.next();
				// 이전
				if(name[count].equals("0")) {
					System.out.println("이전화면으로 이동합니다.");
					System.out.println();
					break;
				}
				
				// 국어, 영어, 수학 입력
				for(int i=0; i<score.length; i++) {
					System.out.printf("%s점수를 입력하세요.  ", title[i+2]);
					score[count][i] = scan.nextInt();
				}
				total[count] = score[count][0] + score[count][1] + score[count][2];
				avg[count] = total[count]/3.0;
				
				System.out.printf("%d번 학생성적이 저장되었습니다.\n",count+1);
				count++;
				break;
			case 2:
				System.out.println("[ 학생성적출력 ]");
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
				System.out.println("찾고자 하는 학생 이름을 입력하세요.   ");
				String search = scan.next();
				int temp = 0;
				
				for(int i=0; i<count; i++) {
					if(search.equals(name[i])) {
						System.out.printf("%s 학생을 찾았습니다.  \n", name[i]);
						
						System.out.println("[ 점수수정 ]");
						System.out.println("----------------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("0. 취소-이전화면 이동");
						System.out.println("---------------------");
						System.out.println("원하는 번호를 입력하세요.  ");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1: case 2: case 3:
							// 현재 국어점수 : 100
							// 변경점수를 입력하세요.
							// 90
							int c_kor = score[i][choice-1];
							System.out.printf("현재 %s점수 : %d \n", title[choice+1], c_kor);
							System.out.println("변경할 점수를 입력하세요  ");
							score[i][choice-1] = scan.nextInt();
							total[i] = score[i][0]+score[i][1]+score[i][2];
							avg[i] = total[i]/3.0;
							System.out.printf("%s점수가 %d -> %d로 변경되었습니다. \n", title[choice+1], c_kor, score[i][choice-1]);
							break;
						case 0:
							System.out.println("점수변경을 취소했습니다.");
							System.out.println();
							break;
						}
						
						temp = 1;	// 학생이 있을 시
					}
				}//for
				
				if(temp==0) {
					System.out.printf("찾고자 하는 %s 학생이 없습니다. \n", search);
					System.out.println();
				}
				
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;
			} //switch
		} //while
	} //main

} //class
