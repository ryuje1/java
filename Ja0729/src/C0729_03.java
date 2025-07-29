
public class C0729_03 {

	public static void main(String[] args) {
		
		Card c = new Card();
		System.out.println(c.number);
		
//		int a = 10;
//		int a = 5;		// 동일이름안됨
		
		// 인스턴스 - 객체선언 후 사용
		MyMath m = new MyMath();
		
		m.add();	// 인스턴스 메소드 - 객체선언 후 사용
		m.a = 100;	// 인스턴스 변수 - 객체선언 후 사용
		m.b = 50;
		System.out.println(m.add());
		
		// 클래스 메소드 - 객체선언 없이 사용, 클래스명.메소드명ㅣ
		long result = MyMath.add(100, 50);
		System.out.println(result);
		
	}

}
