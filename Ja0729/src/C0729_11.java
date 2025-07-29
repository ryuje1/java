
public class C0729_11 {

	public static void main(String[] args) {
		Stuscore s1 = new Stuscore();
		System.out.println(s1.no);
		Stuscore s2 = new Stuscore();
		System.out.println(s2.no);
		Stuscore s3 = new Stuscore("이순신", 100, 100, 99);
		System.out.println(s3.no);
		Stuscore s4 = new Stuscore("강감찬", 90, 90, 99);
		System.out.println(s4.no);
		
//		Stuscore s = new Stuscore();		// 객체선언
		// 배열선언
		Stuscore[] s = new Stuscore[5];
		s[0] = new Stuscore();		// = Stuscore s[0] = new Stuscore(); 와 동일
		s[1] = new Stuscore();
		s[2] = new Stuscore("이순신", 100, 100, 99);
		s[3] = new Stuscore("강감찬", 90, 90, 99);
	}

}
