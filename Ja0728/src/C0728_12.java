
public class C0728_12 {

	public static void main(String[] args) {
//		// 객체선언 - 다른 클래스의 메소드를 사용하고 싶으면 객체선언 필요
//		Cal c = new Cal();
//		
//		int a = 10;
//		int b = 5;
//		c.add(a, b);
		
//		// 객체선언 - 같은 클래스 내에서도 메소드를 사용하고 싶으면 객체선언 필요
//		C0728_12 c2 = new C0728_12();
//		int a = 10;
//		int b = 5;
//		c2.add2(a, b);

		
		// 인스턴스변수 - 객체선언 후 사용, 객체 개별 사용, 참조변수명.변수명
		Data d = new Data();
		d.x = 10;
		System.out.println("change메소드 호출 전 d.x : "+d.x);
		
		
		// 클래스변수 - 객체선언 없이 사용, 공용으로 사용, 클래스명.변수명
		// 클래스메소드 - 객체선언 없이 사용, 공용으로 사용, 클래스명.메소드명
		C0728_12.change(d);
		System.out.println("change메소드 호출 후 d.x : "+d.x);
		
		
	}

	static void change(Data d) {
		// static 붙이면 객체선언 없이 사용
		d.x = 1000;
		System.out.println("x : "+d.x);
	}
	
	
//	void add2(int a, int b) {
//		System.out.println(a+b);
//	}

}

class Data{
	int x;	// 인스턴스변수 - 클래스 내에 있고 static 안붙어있으면 인스턴스변수, 객체선언 후 사용, 객체 개별 사용, 참조변수명.변수명
	// static 붙어있으면 클래스변수 - 객체선언 없이 사용, 공용으로 사용, 클래스명.변수명
}