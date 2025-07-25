
public class Tv {
	// 변수
	String color;	// 변수
	boolean power;	// 변수
	int channel;	// 변수
	// 초기값 : 숫자는 0, 문자는 null, boolean은 false
	
	// 함수 - 메소드
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	
	
}
