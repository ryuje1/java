
public class C0721_01 {

	// 변수타입 //
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print('안녕하세요');
		System.out.println("안녕하세요");
		System.out.println("자바시작");
		
		//---------------------------------------------------
		// 변수 타입 : 8개
		// char, boolean, (byte, short, *int, long), (float, *double)		* = 기본형
		
		// 실수형 : float, double
		// 소수점의 유효성, float : 8자리까지 정확, double : 15자리까지 정확
		// 1.1234567 890  1.123456789012345 6789 6000
		float f = 1.1F; // float타입 : 접미사 F 붙여야함
		double d = 1.1; // double타입 : 접미사 D 생략가능
		
		// 정수형 : byte, short, int, long 4개
		// int - 21억까지 숫자표현
		// long - 900경까지 숫자표현, 뒤에 L 붙여야함 (21억까지는 L 안붙여도 되지만 웬만하면 L 붙이기)
		// byte - 127까지 숫자표현
		// short - 32000 정도까지 숫자표현
		long h = 22000000000L;
		long h2 = 5L;
		long h3 = -222222222L;
		
		int i = 10;
		int i2 = 2000;
		int i3 = -2000000;
//		int i = 2200000000; // 에러 - 21억까지만 가능
		
		// 논리형 : true, false만 가능
		boolean b = true;		// true, false는 소문자로 작성
		boolean b2 = false;
//		boolean b3 = 'a'; // 에러 - true, false만 가능
		
		// 문자형 : 홑따옴표 ' ' 가능, 문자는 1개만 가능
		char c = 'A';
		char c2 = 'B';
		System.out.print(c);
		System.out.print(c2);
		String str = "AB"; 			// 문자열 변수
		System.out.println(str);
//		char a = "A"; // 에러 - 문자형은 ' '로 입력해야함, 1개의 문자만 가능
//		char a = 'AB'; // 에러 - 1개만 가능
	}

}
