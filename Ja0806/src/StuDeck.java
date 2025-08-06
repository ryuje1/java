import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>();
	private Student s;
	int no=0, kor=0, eng=0, math=0, total=0, rank=0, choice=0;
	double avg = 0;
	String name = "";
	String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
	
	// 파일읽어오기
	public void File_read(ArrayList<Student> list) throws Exception {
		FileReader fr = new FileReader("c:/aaa/student.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			list.add(new Student(no, name, kor, eng, math, total, avg, rank));
		}
		br.close();
		fr.close();
		System.out.println("파일 읽어오기 완료\n");
	} //File_read
	
	// 메뉴출력
	int menu_print() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("-----------------------");
		System.out.println("1. 학생성적 입력");
		System.out.println("2. 학생성적 출력");
		System.out.println("3. 등수처리");
		System.out.println("4. 이름정렬");
		System.out.println("5. 파일저장");
		System.out.println("0. 프로그램 종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.  ");
		choice = scan.nextInt();
		
		return choice;
	} //menu_print

	// 1. 학생성적입력
	public void stu_input(ArrayList<Student> list) {
		System.out.println("[ 학생성적 입력 ]");
		System.out.printf("%d. 이름을 입력해주세요.  ", Student.count+1);
		name = scan.next();
		System.out.println("국어 성적을 입력해주세요.  ");
		kor = scan.nextInt();
		System.out.println("영어 성적을 입력해주세요.  ");
		eng = scan.nextInt();
		System.out.println("수학 성적을 입력해주세요.  ");
		math = scan.nextInt();
		list.add(new Student(name, kor, eng, math));
		
		System.out.printf("%s 학생 성적이 입력되었습니다. \n", name);
	} //stu_input

	// 2. 학생성적출력
	public void stu_output(ArrayList<Student> list) {
		System.out.println("[ 학생성적 출력 ]");
		System.out.println("------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", title[0], title[1], title[2], title[3], title[4], title[5], title[6], title[7]);
		System.out.println("------------------------------------------------------------");
		for(int i=0; i<list.size(); i++) {
			s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s.getNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
		System.out.println();
	} //stu_output

	// 3. 등수처리
	public void stu_rank(ArrayList<Student> list) {
		for(int i=0; i<list.size(); i++) {
			int count = 1;
			for(int j=0; j<list.size(); j++) {
				if(list.get(i).getTotal() < list.get(j).getTotal()) {
					count++;
				} //if
			} //for
			list.get(i).setRank(count);
		}
		System.out.println("등수처리 완료되었습니다.");
	} //stu_rank

	// 4. 이름정렬
	public void sort_name(ArrayList<Student> list) {
		System.out.println("[ 이름정렬 ]");
		System.out.println("1. 이름순차정렬");
		System.out.println("2. 이름역순정렬");
		System.out.println("3. 취소");
		System.out.println("원하는 번호를 입력하세요.  ");
		choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("[ 이름순차정렬 ]");
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			System.out.println("이름순차정렬 완료했습니다.");
			break;
		case 2:
			System.out.println("[ 이름역순정렬 ]");
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o2.getName().compareTo(o1.getName());
				}
			});
			System.out.println("이름역순정렬 완료했습니다.");
			break;
		case 3:
			System.out.println("정렬을 취소합니다. \n");
			break;
		}
	} //sort_name

	// 5. 파일저장
	public void File_write(ArrayList<Student> list) throws Exception {
		FileWriter fw = new FileWriter("c:/aaa/student.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0; i<list.size(); i++) {
			s = list.get(i);
			String st = String.format("%d,%s,%d,%d,%d,%d,%f,%d\r\n",
					s.getNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
			bw.write(st);
		}
		bw.close();
		fw.close();
		System.out.println("파일 저장 완료");
	} //File_write
	
	
	
	
	
}
