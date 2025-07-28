
public class Cal {
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void minus(int a, int b) {
		System.out.println(a-b);
	}
	
	void multi(int a, int b) {
		System.out.println(a*b);
	}
	
	void divide (int a, int b){
		System.out.println((double)a/b);
	}
	
	void powProcess(double input, int input2, double[] number) {
		// 반올림
		number[0] = Math.round(input*Math.pow(10, input2-1))/Math.pow(10, input2-1);
		// 올림
		number[1] = Math.ceil(input*Math.pow(10, input2-1))/Math.pow(10, input2-1);
		// 버림
		number[2] = Math.floor(input*Math.pow(10, input2-1))/Math.pow(10, input2-1);
	}
	
}
