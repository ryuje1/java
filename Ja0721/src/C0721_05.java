
public class C0721_05 {
	// 문자와 문자열 //

	public static void main(String[] args) {
		char ch = 'A';
//		char ch2 = 'AB'; // 에러 - 문자 2개 불가
		String str = "AB";
//		char ch3 = ''; // 에러 - 아무것도 안넣거나 null값은 불가
		char ch4 = ' '; // 빈공백문자 가능
		String str2 = "";
		String str3 = " ";
		
		// String > double > float > long > int > short, char > byte	(크기순)
		// 작은 타입에서 큰 타입에 넣는건 무조건 가능(자동변환) 큰 타입에서 작은 타입에서 넣는건 때에 따라 가능/불가 (강제형변환, 선언 필요)
		
		String s1 = "A"+"B"; // 가능 -> "AB"
		String s2 = ""+ 7; // ""+"7" 문자열로 자동변환 -> "7" (문자열이라 사칙연산 불가, 문자열 더하기만 가능)
		// ""+7+7 -> "7"+7 -> "7"+"7"
		// 7+7+"" -> 14+"" -> "14"+"" -> "14" (문자열이라 사칙연산 불가, 문자열 더하기만 가능)
	}

}
