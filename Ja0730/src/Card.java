
public class Card {
	int number;
	String kind;
	String[] c_shape = {
			"", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
	};
	
	Card(){}
	Card(int number, String kind){
		this.number = number;
		this.kind = kind;
	}
	
	// 자바의 toString() = 파이썬의 __str
	// 객체 출력 시 위치가 아닌 값이 나오게 하려면 객체에 toString()을 선언하면 됨
	@Override
	public String toString() {
		return "[ "+c_shape[number]+", "+kind+" ]";
	}
	
	
}
