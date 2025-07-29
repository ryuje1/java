
public class Car {
	
	String color;
	String gearType;
	int door;
	int door_size;
	
	Car(){}	// 기본생성자 - 자동생성
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		this(c.color, c.gearType, c.door);
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
	}
	
	
}
