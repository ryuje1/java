
public class C0729_12 {

	public static void main(String[] args) {
		// 배열 선언
		Pro[] p = new Pro[10];
		
		p[0] = new Pro();
		System.out.println(p[0].serialNo);
		p[1] = new Pro();
		System.out.println(p[1].serialNo);
		p[2] = new Pro();
		System.out.println(p[2].serialNo);
		p[3] = new Pro();
		System.out.println(p[3].serialNo);
		p[4] = new Pro();
		System.out.println(p[4].serialNo);
		
		p[5] = new Pro("스마트폰");
		System.out.println(p[5].serialNo);
		p[6] = new Pro("스마트폰");
		System.out.println(p[6].serialNo);
		p[7] = new Pro("스마트폰");
		System.out.println(p[7].serialNo);
		p[8] = new Pro("스마트폰");
		System.out.println(p[8].serialNo);
		p[9] = new Pro("스마트폰");
		System.out.println(p[9].serialNo);
		
//		p[0] = 객체선언();
//		// serialNo 자동부여, 스마트폰
//		p[1] = 객체선언;
//		p[2] = 객체선언;
//		p[3] = 객체선언;
//		p[4] = 객체선언;
//		
//		// 이름 포함 객체선언 ("스마트폰")
//		p[5] = Pro("스마트폰");
//		p[6]
//		p[7]
//		p[8]
//		p[9]
		
	}

}
