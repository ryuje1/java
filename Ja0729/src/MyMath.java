
public class MyMath {
	
	static long c;						// 클래스 변수 - static 있음, 클래스 내 선언
	
	long a, b;							// 인스턴스 변수 - 자동초기화됨(숫자 : 0, boolean : false)
	long add() {						// 인스턴스 메소드 - static 없음
		int d=0;						// 지역변수 - 값 입력 필요(자동초기화 안됨), 값 입력 없이 출력하려고 하면 에러
		return a+b;
	}
	
	static long add(long a, long b) {	// 클래스메소드 - static 있음
		return a+b;
	}
	
}
