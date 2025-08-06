import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {
	
	public static void main(String[] args) throws Exception {
		//선언부
		Scanner scan = new Scanner(System.in);
		StuDeck stuDeck = new StuDeck();
		ArrayList<Student> list = new ArrayList<Student>();
		int no=0,kor=0,eng=0,math=0,total=0,rank=0,temp=0;
		double avg = 0;
		String name = "";
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		int[] score = new int[3];
		
		//파일읽어오기
		stuDeck.stuFileRead(list);
		
		loop:while(true) {
			// 상단메뉴 출력 메소드 호출
			int choice = stuDeck.stu_menuPrint();
			
			switch(choice) {
			case 1:	// 학생성적입력
				stuDeck.stu_input(list);
				break;
			case 2:	// 학생성적출력
				stuDeck.stu_output(list);
				break;
			case 3:
				stuDeck.stu_update(list);
				break;
			case 4:
				stuDeck.stu_delete(list);
				break;
			case 7:	// 파일저장
				stuDeck.stu_fileWrite(list);
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}//switch
			
		}
		
	}
	
}
