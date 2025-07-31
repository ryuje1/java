import java.util.ArrayList;
import java.util.Vector;

public class Buyer {
	String id;
	String pw;
	String name;
	String address;
	int money;		// 보유금액
	int bonusPoint;	// 보너스포인트
//	Product[] cart = new Product[10];	// 배열선언
//	int i;
//	Vector list2 = new Vector();		// 객체배열 - 컬렉션 (예전버전)
	ArrayList list = new ArrayList();	// 객체배열 - 컬렉션
	
	Buyer(){}
	Buyer(String id, String name, int money, int bonusPoint){
		this.id = id;
		this.name = name;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);	// 컬렉션 추가
//		cart[i++] = p;
	}
	
	
	
}
