
public class Product {
	
	int count = 0;
	int serialNo;
	String pName;
	// 생성자마다 공통으로 사용되는 부분을 초기화블럭으로 분리
	{this.serialNo = ++count;}
	
	Product(){}
	Product(int serialNo, String pName){
		this.serialNo = serialNo;
		this.pName = pName;
	}
	
	Product(String pName) {
		this.pName = pName;
	}
	
}
