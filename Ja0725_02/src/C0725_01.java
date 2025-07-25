
public class C0725_01 {

	public static void main(String[] args) {
		// 변수 사용
		// 기본형 boolean, str, byte, short, int, long, float, double - 대입연산자(=) 사용
		int a = 10;
		String str2 = "abc";	// 대입연산자 사용
		// 객체 - 참조형변수 (참조변수)
		String str = new String("abc");
		
		// Tv class 사용법
		// 객체선언 - 인스턴스선언
		Tv t = new Tv();
		t.color = "white";
		t.channel = 7;
		t.channelUp();
		System.out.println("현재 채널 : "+t.channel);
		
		Tv t2 = new Tv();
		t.color = "pink";
		t.channel = 5;
		System.out.println("현재 채널 : "+t.channel);
		
		
		// 객체 선언
		Stuscore s = new Stuscore();
		
		
	}

}
