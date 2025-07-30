
public class Buyer {
	String id;
	String pw;
	String buyerName;
	String address;
	String tel;
	int money = 10000000;	// 현재보유금액
	int bonusPoint = 0;		// 보너스포인트
	
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
	
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
	
}
