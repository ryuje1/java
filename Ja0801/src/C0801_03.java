
public class C0801_03 {

	public static void main(String[] args) {
		// java.lang 패키지 중 Object 클래스
		
		// getClass()
		Student s = new Student();
		System.out.println(s.getClass().getName());
		
		
//		Person p1 = new Person();
//		System.out.println(p1);
//		System.out.println();
		
		
		
		// toString() - 객체를 출력할때 원하는 형태로 출력하는 메소드
//		Student s1 = new Student(1, "홍길동");
//		System.out.println(s1);
//		
//		Student s2 = new Student(s1);	// 깊은복사
//		
//		Student s3 = null;
//		s3 = s1;	// 얕은복사 - 주소값만 복사, s1을 변경하면 s3도 변경됨
		
		
		
		
		// hashcode() - 데이터 수정이 되었는지 확인
		// 비밀번호 암호화할때 사용
//		String str1 = "1111";
//		String str2 = "abcd";
//		String str1 = new String("국토교통부가 31일 발표한 '6월 주택통계'에 따르면 올해 상반기 전국 주택 인허가 물량은 13만8천456가구로 작년 같은 기간보다 7.6% 줄었다. 지방 부동산시장의 침체가 상반기 인허가 물량을 끌어내렸다.\r\n"
//				+ " \r\n"
//				+ "수도권 인허가(7만3959가구)가 22.7% 늘었지만, 지방(6만4497가구)은 28.0% 줄었다.\r\n"
//				+ " \r\n"
//				+ "착공과 분양은 지방은 물론 수도권에서도 줄었다. 상반기 주택 착공은 10만3147가구로 작년 같은 기간보다 18.9% 감소했다. 수도권 착공(6만5631가구)이 8.1%, 지방(3만7516가구)은 32.8% 줄었다.");
//		String str2 = new String("서울 아파트 준공은 올해 상반기 2만9420가구로 작년 같은 기간보다 102.9% 증가했다.\r\n"
//				+ " \r\n"
//				+ "주택공급 지표에 빨간불이 켜진 가운데 악성 미분양 주택은 2022년 7월 이후 23개월 만에 처음으로 감소세를 보였다.\r\n"
//				+ " \r\n"
//				+ "지난달 말 기준 전국의 준공 후 미분양 주택은 2만6716가구로 전월보다 1.1%(297가구) 줄었다. 일반 미분양 주택도 5개월 연속 감소했다. 지난달 6만3734가구로 전월보다 4.4%(2944가구) 줄었다.\r\n"
//				+ " \r\n"
//				+ "수도권 미분양(1만3939가구)이 8.9%, 지방(4만9795가구)은 3.1% 줄었다. 지난달 전국의 주택 매매(신고일 기준)는 7만3838건으로, 전월보다 17.8% 증가했다.\r\n"
//				+ " \r\n"
//				+ "올해 3월 토지거래허가구역 확대 지정 여파로 4∼5월 두 달 연속 감소세를 보였던 서울 주택 거래량은 6월 1만5천442건으로 반등했다. 전월보다 42.1% 늘었다..\r\n"
//				+ "");
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
//		String str1 = new String("abc");
//		String str2 = new String("ab1c");
//		System.out.println();
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
		// equals() 메소드
//		String str1 = new String("aaa");
//		String str2 = new String("aaa");
//		
//		if(str1.equals(str2)) {
//			System.out.println("같다");
//		}
		
		
//		Student s1 = new Student(1, "홍길동");
//		Student s2 = new Student(1, "홍길동");
//		
//		if(s1.equals(s2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
//		if(s1==s2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
//		Person p1 = new Person();
//		p1.id = 199901011110111L;
//		p1.name = "홍길동";
//		p1.address = "서울";
//		
//		Person p2 = new Person(199901011110111L, "홍길동", "서울");
//		
//		if(p1.equals(p2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		
//		System.out.println("p1 : "+p1);
//		System.out.println("p2 : "+p2);
		
		
		
//		String str1 = new String("aaa");
//		String str2 = new String("aaa");
//		
//		if(str1==str2) {		// 객체변수, 참조변수는 등가비교 안됨
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		
//		if(str1.equals(str2)) {	// Object클래스의 메소드 를 상속받아 사용
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
//		int a1 = 100;
//		int a2 = 100;
//		
//		if(a1 == a2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
	}

}
