
public class C0721_07 {
	// 형변환 (Casting) //

	public static void main(String[] args) {
		int a = 7000000;
		int result = 7000000 * 7000000 / 7000000; // 7000000
		// 49,000,000,000,000 -> 49조. 21억까지만 int
		System.out.println("result : "+result); // -183
		
		int result2 = 7000000 / 7000000 * 7000000; // 7000000
		System.out.println("result2 : "+result2); // 7000000
		
		// 곱하기를 먼저하는지 나누기를 먼저하는지에 따라 결과값이 달라짐
		
		
		int n = 65;
		System.out.println("n : "+n);
//		char ch = n; // 에러
		char ch = (char) n;		// ch에도 65라는 숫자가 들어있고 65에 맞는 문자를 출력해줌
		System.out.println("ch : "+ch);
		
		float f = 1.6f;
		System.out.println("f : "+f);  // 1.6 (출력할때는 f 출력X)
//		int num = f; // 에러
		int num = (int) f;	// 강제형변환 - 앞에 타입을 반드시 붙여야 함.
		System.out.println("num : "+num);  // 1
		float f2 = num;		// 자동형변환 - 앞에 타입을 안붙여도 됨.
		System.out.println("f2 : "+f2);	   // 1.0
	}

}
