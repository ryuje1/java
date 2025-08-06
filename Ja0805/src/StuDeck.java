import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	
	private int no=0,kor=0,eng=0,math=0,total=0,rank=0,choice=0,temp=0;
	private double avg = 0;
	private String name = "";
	private String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
	private Student s;
	int[] score = new int[3];
	
	//파일읽어오기 메소드
	public void stuFileRead(ArrayList<Student> list) throws Exception {
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
			list.add(new Student(no,name,kor,eng,math,total,avg));
		}
		br.close();
		fr.close();
		
		System.out.println("[ c:/aaa/student.txt 파일 읽어오기 성공 ] ");
		System.out.println();
	}//stuFileRead
	
	int stu_menuPrint() {		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("7. 합계정렬");
		System.out.println("8. 번호정렬");		
		System.out.println("9. 파일저장");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요. ");
		int choice = scan.nextInt();
		
		return choice;
	} //stu_menuPrint
	
	// 1. 학생성적입력
	public void stu_input(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 학생성적 입력 ]");
		System.out.printf("%d번째 학생이름을 입력하세요. (0. 이전페이지 이동)  ", Student.count+1);
		name = scan.next();
		// 0 입력시 이전페이지 이동
		if(name.equals("0")) return;	// 메소드 실행중지
		for(int i=0; i<3; i++) {
			System.out.printf("%s 점수를 입력하세요.  ", title[i+2]);
			score[i] = scan.nextInt();
		}
		
		list.add(new Student(name, score[0], score[1], score[2]));
		System.out.printf("%s 학생 성적이 저장되었습니다. ", name);
		System.out.println();
	} //stu_input
	
	// 2. 학생성적 출력
	public void stu_output(ArrayList<Student> list) {
		System.out.println();
		System.out.println("                     [ 학생성적 출력 ] ");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],
				title[5],title[6],title[7]
				);
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			s = list.get(i); //Object->Stuscore
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank()
					);
		}
		System.out.println();
	}//stu_output
	
	// 3. 학생성적 수정
	public void stu_update(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("수정하려는 학생 이름을 입력하세요.  ");
		name = scan.next();
		temp = 0;  //학생성적 검색 유무
		for(int i=0; i<list.size(); i++) {
			if( list.get(i).getName().contains(name) ){
				temp = 1;  //검색됨
				System.out.println("이름 : "+list.get(i).getName());
				no = i; //i번째 정보 가져오기
				break;	//for문 종료
			} //if				
		} //for
		
		if(temp == 1) {
			System.out.println("[ 수정 과목 선택 ]");
			System.out.println("1. 국어");
			System.out.println("2. 영어");
			System.out.println("3. 수학");
			System.out.println("원하는 번호를 선택하세요.  ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("현재 국어점수 : "+list.get(no).getKor());
				System.out.println("수정할 국어 점수를 입력해주세요.  ");
				list.get(no).setKor(scan.nextInt());
				list.get(no).setTotal(list.get(no).getKor()+list.get(no).getEng()+list.get(no).getMath());
				list.get(no).setAvg(list.get(no).getTotal()/3.0);
				System.out.println("국어 점수 수정이 완료되었습니다.");
				break;
			case 2:
				System.out.println("현재 영어점수 : "+list.get(no).getEng());
				System.out.println("수정할 영어 점수를 입력해주세요.  ");
				list.get(no).setEng(scan.nextInt());
				list.get(no).setTotal(list.get(no).getKor()+list.get(no).getEng()+list.get(no).getMath());
				list.get(no).setAvg(list.get(no).getTotal()/3.0);
				System.out.println("영어 점수 수정이 완료되었습니다.");
				break;
			case 3:
				System.out.println("현재 수학점수 : "+list.get(no).getMath());
				System.out.println("수정할 수학 점수를 입력해주세요.  ");
				list.get(no).setMath(scan.nextInt());
				list.get(no).setTotal(list.get(no).getKor()+list.get(no).getEng()+list.get(no).getMath());
				list.get(no).setAvg(list.get(no).getTotal()/3.0);
				System.out.println("수학 점수 수정이 완료되었습니다.");
				break;
			}
		}else {					
			System.out.printf("%s (으)로 검색된 이름이 없습니다. 다시 입력해주세요~  \n", name);
		}
		System.out.println();
	} //stu_update
	
	// 4. 학생성적 삭제
	public void stu_delete(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 학생성적 삭제 ]");
		System.out.println("삭제하려는 학생 이름을 입력하세요.  ");
		name = scan.next();
		temp = 0;  //학생성적 검색 유무
		for(int i=0; i<list.size(); i++) {
			if( list.get(i).getName().equals(name) ){
				System.out.println("이름 : "+list.get(i).getName());
				temp = 1;  //검색됨
				no = i; //i번째 정보 가져오기
				break;	//for문 종료
			} //if				
		} //for
		if(temp == 1) {
			System.out.printf("%s 학생이 검색되었습니다. ", name);
			System.out.printf("%s 학생을 삭제하시겠습니까? \n", name);
			System.out.println("1. 삭제");
			System.out.println("2. 취소");
			System.out.println("원하는 번호를 입력하세요.  ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				list.remove(no);
				System.out.printf("%s 학생 성적이 삭제되었습니다. \n", name);
				System.out.println();
				break;
			case 2:
				System.out.println("삭제를 취소합니다.");
				break;
			}
		}else {
			System.out.printf("%s (으)로 검색된 이름이 없습니다. 다시 입력해주세요~  \n", name);
		}
	} //stu_delete
	
	// 5. 등수처리
	public void stu_rank(ArrayList<Student> list) {
		System.out.println("[ 등수처리 ]");				
		for(int i=0; i<list.size(); i++) {
			int count = 1;
			for(int j=0; j<list.size(); j++)
				if(list.get(i).getTotal() < list.get(j).getTotal())
					count++;
			list.get(i).setRank(count);
		}
		System.out.println("등수처리가 완료되었습니다!");
		System.out.println();
	} //stu_rank
	
	// 6. 이름정렬
	public void sort_name(ArrayList<Student> list) {
		System.out.println("[ 이름 정렬 ]");
		System.out.println("1. 이름순차정렬");
		System.out.println("2. 이름역순정렬");
		System.out.println("0. 정렬취소");
		System.out.println("원하는 번호를 입력하세요.  ");
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("[ 이름순차정렬 ]");
			list.sort(new Comparator<Student>() {
				public int compare(Student o1, Student o2) {
					// o1이 더 크면 순서 변경
					return o1.getName().compareTo(o2.getName());
				}
			});
			break;
		case 2:
			System.out.println("[ 이름역순정렬 ]");
			list.sort(new Comparator<Student>() {
				public int compare(Student o1, Student o2) {
					// o2가 더 크면 순서 변경
					return o2.getName().compareTo(o1.getName());
				}
			});
			break;
		case 0:
			System.out.println("[ 이름정렬 취소 ]");
			System.out.println("정렬을 취소합니다!");
			System.out.println();
			break;
		}
	} //sort_name
	
	// 7. 합계정렬
	public void sort_total(ArrayList<Student> list) {
		System.out.println("[ 합계 정렬 ]");
		System.out.println("1. 합계순차정렬");
		System.out.println("2. 합계역순정렬");
		System.out.println("0. 정렬취소");
		System.out.println("원하는 번호를 입력하세요.  ");
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("[ 합계순차정렬 ]");
			list.sort(new Comparator<Student>() {
				public int compare(Student o1, Student o2) {
					// o1이 더 크면 순서 변경
					return o1.getTotal() - o2.getTotal();
				}
			});
			break;
		case 2:
			System.out.println("[ 합계역순정렬 ]");
			list.sort(new Comparator<Student>() {
				public int compare(Student o1, Student o2) {
					// o2가 더 크면 순서 변경
					return o2.getTotal() - o1.getTotal();
				}
			});
			break;
		case 0:
			System.out.println("[ 합계정렬 취소 ]");
			System.out.println("정렬을 취소합니다!");
			System.out.println();
			break;
		}
	} //sort_total
	
	// 8. 번호정렬
	public void sort_no(ArrayList<Student> list) {
		System.out.println("[ 번호 정렬 ]");
		System.out.println("1. 번호순차정렬");
		System.out.println("2. 번호역순정렬");
		System.out.println("0. 정렬취소");
		System.out.println("원하는 번호를 입력하세요.  ");
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("[ 번호순차정렬 ]");
			list.sort(new Comparator<Student>() {
				public int compare(Student o1, Student o2) {
					// o1이 더 크면 순서 변경
					return o1.getNo() - o2.getNo();
				}
			});
			break;
		case 2:
			System.out.println("[ 번호역순정렬 ]");
			list.sort(new Comparator<Student>() {
				public int compare(Student o1, Student o2) {
					// o2가 더 크면 순서 변경
					return o2.getNo() - o1.getNo();
				}
			});
			break;
		case 0:
			System.out.println("[ 번호정렬 취소 ]");
			System.out.println("정렬을 취소합니다!");
			System.out.println();
			break;
		}
	} //sort_no
	
	// 9. 파일저장
	public void stu_fileWrite(ArrayList<Student> list) throws Exception {
		FileWriter fw = new FileWriter("c:/aaa/student.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<list.size();i++) {
			Student s = list.get(i);
			String st = String.format("%d,%s,%d,%d,%d,%d,%f,%d\r\n", 
			s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
			s.getTotal(),s.getAvg(),s.getRank());
			bw.write(st);
		}
		bw.close();
		fw.close();
		System.out.println("파일저장 완료");
	}//stu_fileWrite
	
	
}
