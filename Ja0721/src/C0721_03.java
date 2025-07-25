
public class C0721_03 {
	// 변수, 상수, 리터럴

	public static void main(String[] args) {
		int a = 10;
		a = 20;
		a = 50;
		System.out.println("a : "+a);
		int b = 100;
		b = 200;
		System.out.println("b : "+b);
		
		// 상수
		final int C = 1000;
//		C = 2000; // 에러 - 상수는 값 변경 불가
		System.out.println("C : "+C);
		
		//
		int d = a + b;
		System.out.println("d : "+d);
	}

}
