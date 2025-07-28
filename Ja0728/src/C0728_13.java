import java.util.Arrays;
import java.util.Scanner;

public class C0728_13 {

	public static void main(String[] args) {
		// 소수점을 입력한 후 2자리에서 반올림. 2자리에서 반올림된 값 출력 구현
		// 1.256 -> 2, 1.3
		Scanner scan = new Scanner(System.in);
		double[] number = new double[3];
		
		System.out.println("소수점을 입력하세요.  ");
		double input = scan.nextDouble();
		System.out.println("자리수를 입력하세요.  ");
		int input2 = scan.nextInt();
		// 1.334578 -> 5   1.3346
		// pow() -> 제곱메소드 Math.pow(10, 4) -> 10000
		
		Cal c = new Cal();
		c.powProcess(input, input2, number);
		
		// 출력
		System.out.println("결과 : "+Arrays.toString(number));
	}

}
