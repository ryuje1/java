
public class C0721_02 {
	// 명명규칙 // 

	// 함수, 메소드 - main함수 : 모든 프로그램은 main() 함수를 찾아서 실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그램을 구현한다.
		
		// boolean, char, byte, short, int, long, float, double, string
		int a = 10;
		int b = 20;
//		int double = 30; // 에러 - 예약어 사용불가
		int A = 30; // 대소문자 구분 => a, A 다른 변수
//		int 1a = 10; // 에러 - 숫자로 시작 불가
		int a1 = 40; // 숫자가 뒤에 오는건 가능
		
		int a_1 = 50; // 특수문자는 _, $ 가능
		int $_a = 60; // 가능
		int a_$ = 70; // 가능
//		int a_* = 80; // 에러 - 다른 특수문자 불가
	}

}
