
public class C0722_03 {
	// 타입 변환 //

	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		
		char c3 = (char)(c1 + 1);	// char+int = int라서 강제형변환 => (char) 써줘야함
		System.out.println(c3);
		
		char c4 = ++c1;	 // 증감연산자 사용시 타입변경 안해도 됨
		System.out.println(c4);
		
		int i = 'B' - 'A';  // 66-65
		System.out.println(i);

		int i2 = 'b' - 'a';  // 98-97
		System.out.println(i2);
		
		int i3 = '1' - '0';	 // 49-48
		System.out.println(i3);
		
		int i4 = '3' - '0';  // 51-48
		System.out.println(i4);
		
		int i5 = '9' - '0';	 // 57-48 => 문자타입 숫자에서 0을 빼면 숫자 출력
		System.out.println(i5);
		
		int n = 5;
		String s = n+"";
		System.out.println(s);
	}

}
