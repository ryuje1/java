import java.util.Arrays;

public class C02 {

	public static void main(String[] args) {
		Deck d = new Deck();
		
		// 모양과 번호가 포함되어 있는 카드 52장을 생성
		
		
		// 전체 출력
		d.c_print();
		
		// 카드 섞기
		d.shuffle();
		
		// 전체 출력
		System.out.println("----------------------");
		d.c_print();
		
		
		// 카드 5장 출력하시오.
		System.out.println("----------------------");
//		d.c_print5();
		Card[] c = d.pick_5();
//		System.out.println(Arrays.toString(c));
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		
		// 31번째 카드를 출력하시오.
		System.out.println("----------------------");
//		d.pick(31);
		Card c2 = d.pick(31);
		System.out.println(c2);
		
		// 랜덤으로 카드 1장을 출력하시오.
		System.out.println("----------------------");
//		d.rpick();
		c2 = d.rpick();
		System.out.println(c2);
		
	}

}
