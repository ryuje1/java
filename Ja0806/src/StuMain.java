import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		// 파일읽어오기 - aaa/student.txt
		// list에 저장
		// 학생성적 입력, 출력, 등수처리, 이름정렬, 파일저장까지
		// 출력 -> 정렬 -> 등수처리 -> 파일저장 -> 입력 순서
		
		ArrayList<Student> list = new ArrayList<Student>();
		int choice=0;
		StuDeck stuDeck = new StuDeck();
		
		// 파일읽어오기
		stuDeck.File_read(list);
		
		loop:while(true) {
			choice = stuDeck.menu_print();
			
			switch(choice) {
			case 1:		// 입력
				stuDeck.stu_input(list);
				break;
			case 2:		// 출력
				stuDeck.stu_output(list);
				break;
			case 3:		// 등수처리
				stuDeck.stu_rank(list);
				break;
			case 4:		// 이름정렬
				stuDeck.sort_name(list);
				break;
			case 5:		// 파일저장
				stuDeck.File_write(list);
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			} //switch
		} //while
		
	} //main

} //class
