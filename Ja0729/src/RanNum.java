
public class RanNum {
	
	static int[] arr = new int[10];		// 클래스 변수 - 객체선언없이 공용사용
	int a;		// 인스턴스 변수
	
	// 클래스 초기화 블럭 - 객체선언 전에 바로 실행
	static {
		for(int i=0; i<RanNum.arr.length; i++) {
			RanNum.arr[i] = (int)(Math.random()*10)+1;
		}
	}
	
	
}
