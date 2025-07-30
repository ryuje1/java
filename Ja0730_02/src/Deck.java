
public class Deck {
	Card[] c = new Card[52];
	String[] shape = {"CLOVER", "DIAMOND", "SPADE", "HEART"}; 
	
	Deck() {
		// 모양, 번호 부여
		for(int i=0; i<c.length; i++) {
			c[i] = new Card(i%13+1, shape[i/13]);
		}
	}
	
	// 카드 섞기 메소드
	void shuffle() {		
		Card temp = null;
		int rnum = 0;
		
		for(int i=0; i<300; i++) {			
			rnum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
			
		}
	}
	
	
	// 카드 전체 출력 메소드
	void c_print() {
		for(int i=0; i<c.length; i++) {			
			System.out.println(c[i]);
		}
//		for(int i=0; i<c.length; i++) {
////			c[i].getN_num(); // "", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q"
////			c[i].getN_num()[1];
//			c[i].getN_num()[c[i].getNumber()]+","+c[i].getKind();
//		}
	}
	
	// 카드 5장 출력 메소드
//	void c_print5() {
//		for(int i=0; i<5; i++) {
//			System.out.println(c[i]);
//		}
//	}
	
	public Card[] pick_5() {
		Card[] c_5 = new Card[5];
		for(int i=0;i<c_5.length;i++) {
			c_5[i] = c[i];
		}
		return c_5;
	}
	
	
	
	
	// 카드 1장 뽑기 메소드
//	void pick(int index) {
//		if(index<52 || index>0) {			
//			System.out.println(c[index]);
//		}else {
//			System.out.println(c[0]);
//		}
//	}
	
	Card pick(int index) {
		if(index<52 || index>0) {
			return c[index];
		}else {
			return c[0];
		}
	}
	
	
	// 랜덤카드 1장 뽑기 메소드
//	void rpick() {
//		int index = (int)(Math.random()*52);
//		System.out.println(c[index]);
//	}
	
	Card rpick() {
		int index = (int)(Math.random()*52);
		return c[index];
	}
	
}
