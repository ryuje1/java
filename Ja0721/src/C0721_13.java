
public class C0721_13 {
	// 이항연산자 특징 //

	public static void main(String[] args) {
		int a = 1000000;
		int b = 1000000;
		long c = (long)a*b;
		System.out.println("c : "+c);	// 2000000000000;
		
		int d = 1000000;
		int e = 1000000;
//		int f = d * e / e;
		int f = (int)((long)d * e / e);
		System.out.println("f : "+f);	// -727
		int g = d / e * e;
		System.out.println("g : "+g);	// 1000000
	}

}
