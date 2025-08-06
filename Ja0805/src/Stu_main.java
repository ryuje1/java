import java.util.Scanner;

public class Stu_main {

	public static void main(String[] args) {
		
		loop:while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 학생성적 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력해주세요.   ");
			int choice = scan.nextInt();
			
			int count = 0;
			int[] stuscore = new int[3];
			String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
			
			switch(choice) {
			case 1:				
				System.out.println("[ 학생성적 입력 ]");
				System.out.printf("%d. 학생의 이름을 입력해주세요. ", count+1);
				String name = scan.next();
				
				for(int i=2; i<stuscore.length; i++) {
					System.out.printf("%s 성적을 입력해주세요.  ", title[i]);
					stuscore[i] = scan.nextInt();
				}
				int total = stuscore[0]+stuscore[1]+stuscore[2];
				double avg = total/3.0;
				System.out.printf("%s 학생 성적 입력 완료", name);
				System.out.println();
				break;
			case 2:
				System.out.println("[ 학생성적 출력 ]");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", title[0], title[1], title[2], title[3], title[4], title[5], title[6]);
				for(int i=0; i<=count; i++) {
					System.out.println("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n");
				}
				break;
			case 3:
				System.out.println("[ 학생성적 수정 ]");
				break;
			case 4:
				System.out.println("[ 학생성적 삭제 ]");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;
			}
		}
		
		
		
	}

}
