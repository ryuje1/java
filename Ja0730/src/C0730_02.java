
public class C0730_02 {

	public static void main(String[] args) {
		// 원형 그림
		Circle c1 = new Circle();
		c1.draw(c1.sname, c1.center);
		Circle c2 = new Circle(new Point(150, 150), 0);
		c2.draw(c2.sname, c2.center);
		
		// 삼각형 그림
		Point[] p = {
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
		};	// => 객체타입이라 이렇게 받음. 아래의 StusScore와 같은 형태
		
//		StuScore[] stu = {
//				new Stuscore("홍길동", 100, 100, 100),
//				new Stuscore("유관순", 100, 990, 90)
//		};
		
//		int[] a = {
//				1, 2, 3
//		};	// => 기본타입은 이렇게 받음
//		
//		int[] b = {1,2,3};
		
		Triangle t1 = new Triangle(p);	// 객체선언
		t1.draw(t1.sname, p);
		
	}

}
