import java.util.Scanner;

public class C0725_10 {

	public static void main(String[] args) {
		// 학생성적프로그램
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		//-----------------
		// 원하는 번호를 입력하세요. >>
		
		Scanner scan = new Scanner(System.in);
		
		int[] no = new int[3];				// 번호
		String[] name = new String[3];		// 이름
		int[][] score = new int[3][3];		// 성적 - 학생 별 국어, 영어, 수학 성적
		int[] total = new int[3];			// 성적 합계
		double[] avg = new double[3];		// 성적 평균
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
		int count = 0;						// 입력된 학생 수
		
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("원하는 번호를 입력하세요.  ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:		// 학생 성적 입력
				System.out.println("[ 성적입력 ]");
				
				// 정보 및 성적 입력받아 저장
				no[count] = count+1;
				System.out.printf("%d. 이름을 입력해주세요.  \n", count+1);
				name[count] = scan.next();
				for(int i=0; i<3; i++) {						
					System.out.printf("%d. %s성적을 입력해주세요.  \n", count+1, title[i+2]);
					score[count][i] = scan.nextInt();					
				}
				total[count] = score[count][0] + score[count][1] + score[count][2];
				avg[count] = total[count]/3.0;
				
				System.out.printf("%d번 학생 성적이 입력되었습니다. \n\n", count+1);
				count++;	// 학생 입력했으니 count 증가
				
				break;
			case 2:		// 학생 성적 출력
				System.out.println("[ 성적출력 ]");
				// 타이틀 출력
				for(int i=0; i<title.length; i++) {					
					System.out.printf("%s\t", title[i]);
				}
				System.out.println();
				System.out.println("-------------------------------------------------------");
				
				// 학생 정보 및 성적 출력
				for(int i=0; i<name.length; i++) {
					System.out.print(no[i]+"\t");
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.print(total[i]+"\t");
					System.out.printf("%.2f \n", avg[i]);
				}
				
				break;
			case 3:		// 학생 성적 수정
				System.out.println("[ 성적수정 ]");
				
				// 학생 이름 검색
				System.out.println("수정할 학생 이름을 입력해주세요.  ");
				String search = scan.next();
				int temp = 0;		// 존재하는지 확인용 변수
				
				for(int i=0; i<count; i++) {					
					if(search.equals(name[i])) {
						temp += 1;
						System.out.printf("%s 학생을 찾았습니다.", name[i]);
						
						System.out.println("1. 국어성적 수정");
						System.out.println("2. 영어성적 수정");
						System.out.println("3. 수학성적 수정");
						System.out.println("0. 이전화면 이동");
						System.out.println("원하는 번호를 입력해주세요.  ");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1: case 2: case 3:
							int current = score[count][]
							System.out.printf("현재 %s 성적 : %d", );
							break;
						case 0:
							System.out.println("이전화면으로 이동합니다.");
							break;
						}
					}
				}
				
				if(temp == 0) {
					System.out.printf("%s 학생을 찾지 못했습니다. 다시 입력해주세요.", search);
				}
				
				
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;
			}
		}
		
		
		
	}

}
