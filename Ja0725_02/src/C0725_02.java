
public class C0725_02 {

	public static void main(String[] args) {
		// 홍길동 100 100 99 299 99.67
		// 객체선언
		Stuscore s = new Stuscore();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 99;
		s.total = s.kor + s.eng + s.math;
		s.avg = s.total/3.0;
		System.out.println(s.kor);
		System.out.println(s.total);
		System.out.println(s.avg);
		
		System.out.println(s);

		int[] arr = {1,2,3,4,5};
		System.out.println(arr);
		
	}

}
