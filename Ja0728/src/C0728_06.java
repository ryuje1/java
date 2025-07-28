
public class C0728_06 {

	public static void main(String[] args) {
		// 다른클래스 사용방법 - 객체선언후 사용
		// 인스턴스 변수 사용방법
		// 객체선언후 사용, 객체개별 사용, 참조변수명.변수명
		Card c = new Card();
		c.kind = "spade";
		c.number = 1;
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 2;
		Card c3 = new Card();
		c3.kind = "spade";
		c3.number = 3;
		
//		52개 객체선언후 값입력
		Card[] card = new Card[52];
		
		Card.width = 100; //객체선언없이 값을 입력할수 있음.
		// 객체선언 100개 되어도 공용으로 사용됨.
		Card.height = 250;
		
		String[] shape = {"spade","heart","diamond","clover"};
		// "spade","heart","diamond","clover"
		
		// 객체선언후 값입력
		for(int i=0;i<card.length;i++) {
			card[i] = new Card(); //객체선언 사용이 안됨.
			card[i].kind = shape[i/13]; //spade 13, heart 13, diamond 13, clover 13
			card[i].number = i%13+1;  //1-13,1-13,1-13,1-13
		}
		
		System.out.println("Card0 넓이 : "+card[0].width);
		System.out.println("Card1 넓이 : "+card[1].width);
		System.out.println("Card2 넓이 : "+card[2].width);
		
		
		// 출력
//		for(int i=0;i<card.length;i++) {
//			System.out.println(card[i].kind+","+card[i].number);
//		}
		
		
		
		
		
		
		
		

	}

}
