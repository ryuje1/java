
public class C03 {

	public static void main(String[] args) {
		Car car = null;		// 주소값만 있고 실제로 저장공간X
		// 객체선언 - 저장공간 생김
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null; // 주소값만 있고 실제로 저장공간X
		
		Ambulance ab = new Ambulance();
		Ambulance ab2 = null;
		Car car2 = new Car();
		
		fe.water();
		car = fe;		// car = (Car)fe;	// 형변환생략
//		car.water();	// 에러 - Car객체에는 water기능 없음
		fe2 = (FireEngine)car;
		fe2.water();		// water 기능 출력됨 - fe는 FireEngine을 받아와서 출력됨
		
//		fe2 = (FireEngine)car2;
//		fe2.water();		// fe2는 원래 car를 받아온거라 형변환은 되지만 사용하려고하면 에러
		
		car = ab;
		
		if(car instanceof Ambulance) {
			System.out.println("Ambulance 변경가능");
		}
		if(car instanceof FireEngine) {
			fe2 = (FireEngine)car;	// 에러
			System.out.println("FireEngine 변경가능");
		}else {
			System.out.println("FireEngine 변경불가");
			System.out.println("형변환 하면 안됨");
		}
		
//		if(ab instanceof Ambulance) {
//			System.out.println("Ambulance");
//		}
//		if(ab instanceof Car) {
//			System.out.println("Car Ambulance");
//		}
//		if(ab instanceof Object) {
//			System.out.println("Object Ambulance");
//		}
		
//		fe2 = (FireEngine)car;	// 형변환은 되는데 사용하려고하면 에러
		
		
		
	}

}
