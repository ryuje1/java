import java.util.Scanner;

public class C0725_03 {
	// print, scanner //

	public static void main(String[] args) {
		// 콘솔창에서 입력받을때
		Scanner scanner = new Scanner(System.in);
		// 정수형 - nextInt(), nextByte(), nextShort(), nextLong()
		// 실수형 - nextDouble(), nextFloat()
		System.out.println("숫자를 입력하세요.");
		int a = scanner.nextInt();
		System.out.println("숫자 : "+a);

		
		
//		//문자열 - nextLine() : 엔터키까지 입력받음 + 띄어쓰기 이후 문자도 인식 / next() : 엔터키 입력안받음 + 띄어쓰기 이후 문자는 인식X
//		System.out.println("이름을 입력하세요  ");
//		String a = scanner.next();
//		scanner.nextLine();
//		System.out.println("아이디를 입력하세요  ");
//		String b = scanner.nextLine();
//		System.out.println("이름 : "+a);
//		System.out.println("아이디 : "+b);
		
		
		
//		// println, print, printf
//		System.out.println("a");	// println() : 자동 엔터키 입력
//		System.out.println("b");
//		System.out.println("c");
//		
//		System.out.print("d \n");	// \n : 엔터키 입력
//		System.out.print("e \t");	// \t : 탭키 입력
//		System.out.print("f");		// print() : 자동 줄바꿈X
//		
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		String d = "홍길동";
//		double e = 1.12345678;
//		System.out.println("a : "+a+"b : "+b);
//		// %d : 정수, %f : 실수, %s : 문자열, %c : 문자
//		System.out.printf("이름 : %s a: %d b: %d\n", d, a, b);
//		// %.2f : 소수점 2자리까지 표시
//		System.out.printf("값 : %.2f \n", e);
//		
//		int h = 123;
//		System.out.printf("%5d \n", h);		// 5자리까지 출력
//		System.out.printf("%05d \n", h);	// 5자리까지 출력하는데 공백은 0으로 채움
		
		
	}

}
