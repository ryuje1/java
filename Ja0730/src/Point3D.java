
public class Point3D extends Point {
	
	int z;
	
	Point3D(int x, int y, int z){
		super();		// super(); -> 기본생성자 Point();를 찾음
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return String.format("x: %d, y: %d, z: %d \n", x,y,z);
//		return "x: "+x", y: "+y", z: "+z;
	}
	
	
}
