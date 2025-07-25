
public class C0722_04 {
	// 소수점 절사, round/floor/ceil //
	
	public static void main(String[] args) {
		double p = 123.5468777;  // 소수점 4자리까지만 남기고 절사하시오.
		double p2 = (int)(p*10000.0)/10000.0;
		System.out.println(p2);
		
		
//		double pi = 3.141592;  // 3.14 남김
//		double s_pi = (int)(pi * 1000.0) / 1000.0;  // (int)(3141.592)/1000.0 = 3.141
//		System.out.println(pi);
//		System.out.println(s_pi);
		
		// 소수점 둘째자리까지 남기고 싶으면 (int)(n*100.0)/100.0
		// 파이썬의 round(반올림), floor(버림), ceil(올림) = 자바도 동일
		
		// floor
		double d = Math.floor(p*100000.0)/100000;	// double로 반환하므로 int로 받을때는 형변환 필요
		System.out.println(d);
		
		// round
		// 소수점 5자리에서 반올림해서 4자리까지 출력하시오.
		double num = Math.round(p*10000)/10000.0;
		System.out.println(num);

		// ceil
		// 소수점 3자리에서 올림해서 2자리까지 출력하시오.
		double cnum = Math.ceil(p*100)/100.0;
		System.out.println(cnum);
	}

}
