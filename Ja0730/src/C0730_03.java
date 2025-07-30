import java.util.Scanner;

public class C0730_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();	// 포함관계 - 객체선언. 52장 카드 생성
		d.deck_print();
		d.shuffle();
		System.out.println("-----------------------------------");
		d.deck_print();
		System.out.println("-----------------------------------");
		Card c_one = d.pick(-34);
		System.out.printf("1장 : %s, %s\n", d.c_shape[c_one.number], c_one.kind);
		System.out.println("-----------------------------------");
		c_one = d.pick();
		System.out.printf("1장 : %s, %s\n", d.c_shape[c_one.number], c_one.kind);
		System.out.println("-----------------------------------");
		System.out.println(c_one);
		
	}

}
