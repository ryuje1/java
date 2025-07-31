import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Stuscore[] s = new Stuscore[10];
		ArrayList list = new ArrayList();
		StuDeck stuDeck = new StuDeck();
		
		loop:while(true) {
			int choice = stuDeck.menu_print();
			
			switch(choice) {
			case 1:		// 성적입력 - 이름, 국어, 영어, 수학 -> 번호, 합계, 평균은 자동입력
				stuDeck.stu_input(list);
				break;
			case 2:		// 성적출력
				stuDeck.stu_output(list);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.\n");
				break loop;
			}// switch
		}// while
		
		
		
	}

}
