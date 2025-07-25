import java.util.Scanner;

public class C0723_10 {
	// 배열 - 성적 입력받아 출력 //

	public static void main(String[] args) {
		// 이름 5명을 입력받아 아래와 같이 출력하시오.
		// 입력이름 : 홍길동 유관순 이순신 강감찬 김구
		// 국어점수 : 100 100 99 80 70
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력해주세요  ");
			name[i] = scan.next();
			System.out.println("국어점수를 입력해주세요");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력해주세요");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력해주세요");
			math[i] = scan.nextInt();
		}
		
		System.out.println("이름\t국어\t영어\t수학\n");
		System.out.println("--------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", name[i], kor[i], eng[i], math[i]);
		}
		
		
		
//		System.out.print("이름 : ");
//		for(int i=0; i<name.length; i++) {
//			System.out.print(name[i]+" ");
//		}
//		System.out.println();
//		System.out.print("국어점수 : ");
//		for(int i=0; i<kor.length; i++) {
//			System.out.print(kor[i]+" ");
//		}
//		System.out.println();
//		System.out.print("영어점수 : ");
//		for(int i=0; i<eng.length; i++) {
//			System.out.print(eng[i]+" ");
//		}
//		System.out.println();
//		System.out.print("수학점수 : ");
//		for(int i=0; i<math.length; i++) {
//			System.out.print(math[i]+" ");
//		}
//		System.out.println();
		
	}

}
