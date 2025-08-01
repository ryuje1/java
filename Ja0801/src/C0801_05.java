import java.util.Arrays;

public class C0801_05 {

	public static void main(String[] args) {
		
		String[] strArr = {"a.txt", "b.hwp", "c.xls", "d.txt", "e.png", "f.jpg"};
		// txt 파일은 몇개 있는지 출력하시오.
		
		int tcount = 0;
		int icount = 0;
		int hcount = 0;
		
		for(int i=0; i<strArr.length; i++) {			
			if(strArr[i].endsWith("txt")) {
				tcount++;
			}
			if(strArr[i].endsWith("png") || strArr[i].endsWith("jpg")) {
				icount++;
			}
			if(strArr[i].endsWith("hwp")) {
				hcount++;
			}
		}
		System.out.println("txt 파일 개수 : "+tcount);
		System.out.println("이미지 파일 개수 : "+icount);
		System.out.println("한글 파일 개수 : "+hcount);
		
		
//		String str = "aaa.txt";
//		System.out.println(str.endsWith("txt"));
		
		
		// split - 분리자를 통해 배열로 리턴
//		String str = "홍길동, 유관순, 이순신, 강감찬, 김구";
//		String[] name = str.split(",");
//		System.out.println(Arrays.toString(name));
		
//		String str2 = "1,홍길동,100,100,100,300,100.0";
//		// split으로 분리한 다음 student 객체로 선언을 해보세요.
//		// 분리하면 String 타입 -> int 타입, double 타입으로 변경
//		// 객체선언해서 진행
//		String[] stu = str2.split(",");
//		int stuNo = Integer.parseInt(stu[0]);
//		String stuName = stu[1];
//		int kor = Integer.parseInt(stu[2]);
//		int eng = Integer.parseInt(stu[3]);
//		int math = Integer.parseInt(stu[4]);
//		int total = Integer.parseInt(stu[5]);
//		double avg = Double.parseDouble(stu[6]);
//		
//		Student s = new Student(stuNo, stuName, kor, eng, math);
//		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
//		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s \n", title[0], title[1], title[2], title[3], title[4], title[5], title[6]);
//		System.out.println("------------------------------------------------------");
//		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg());
		
		
		
		
		
		
		
		
//		String str = "     ab   c     ";
//		System.out.println(str);
//		
//		// trim() - 빈공백제거 안에 있는 공백 제거X
//		System.out.println(str.trim());
//		
//		// replace - 대체
//		System.out.println(str.replace("ab", "x"));
//		
//		// replace - " "을 ""로 대체
//		System.out.println(str.replace(" ", ""));
		
		
		
//		String str = "abcabcaaabbbbbbbchijkcaacaaaaaa";
//		// c가 몇개 있는지 출력하시오. indexOf("c", 0);
//		int n = 0;
//		int count = 0;
//		
//		while(true) {
//			n = str.indexOf("c", n);
//			
//			if(n == -1) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			
//			System.out.println(n);
//			n++;
//			count++;
//		}
//		
//		System.out.println("c의 개수 : "+count);
		
		
		
	}

}
