
public class C04 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.id = "aaa";
		b.buyerName = "홍길동";
		
		
		//
		// [ 쇼핑몰 사이트 ]
		// 1. TV
		// 2. AUDIO
		// 3. COMPUTER
		// 구매를 원하는 번호를 입력하세요.
		// 1. TV를 구매
		
		Tv t = new Tv();
		b.buy(t);
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 보너스 : "+b.bonusPoint);
		
		// 오디오 구매
		Audio a = new Audio();
		b.buy(a);
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 보너스 : "+b.bonusPoint);
		
		// 컴퓨터 구매
		b.buy(new Computer());
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 보너스 : "+b.bonusPoint);
		
		
	}

}
