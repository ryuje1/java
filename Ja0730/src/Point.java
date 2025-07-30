
public class Point extends Object {
	int x;	// 인스턴스변수 - 객체선언후 사용, 개별로 사용, 참조변수.변수명
	int y;
	
	Point(){
		this(0, 0);		// this() : 다른 생성자
	}
	
	Point(int x, int y){
		super();
		this.x = x;		// this : 인스턴스변수
		this.y = y;
	}
	
	
	void add() {
		System.out.println(x+y);
	}
}
