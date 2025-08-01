import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Stuscore[] s = new Stuscore[10];
		ArrayList<Stuscore> list = new ArrayList<Stuscore>();
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
				System.out.println();
				System.out.println("[ 학생성적 삭제 ]");
				System.out.println("삭제할 학생의 이름을 입력하세요.  ");
				String name = scan.next();
				int temp = 0;
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getName().equals(name)) {	// list.get(i).getName().contains(name)
						temp = 1;
						System.out.printf("%s 학생을 찾았습니다. \n", name);
						System.out.printf("[ %s 학생 삭제 ]\n", name);
						System.out.println("1. 삭제");
						System.out.println("2. 삭제취소");
						choice = scan.nextInt();
						switch(choice) {
						case 1:
							list.remove(i);
							System.out.printf("%s 학생을 삭제했습니다. \n", name);
							break;
						case 2:
							System.out.println("삭제가 취소되었습니다.");
							break;
						}
					}
				}
				
				if(temp == 0) {
					System.out.println("                      [ 학생 검색 ]");
					System.out.println("찾고자 하는 학생이 없습니다. 다시 입력해주세요~");
					System.out.println();
				}
				
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
