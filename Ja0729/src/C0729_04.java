
public class C0729_04 {

	public static void main(String[] args) {
		// 생성자 
		Data1 d1 = new Data1();	// 에러없음
		d1.value = 50;
//		Data2 d2 = new Data2(); // 에러발생 - 기본생성자가 없기 때문
		Data2 d2 = new Data2(5, 7); // 에러발생 - 매개변수를 포함해야 에러 발생X
		
		
	}
	
class Data1 {
	Data1(){} // 생성자 - 기본생성자 자동생성
	int value;
}

class Data2 {
	int value;
//	Data2(){} // 기본생성자
	Data2(int x, int y){	// 매개변수가 있는 생성자, 전체생성자
		value = x;
	}
}

}
