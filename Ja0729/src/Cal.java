
public class Cal {
	// 더하기, 빼기, 곱하기, 나누기
	int result;	// 인스턴스 변수
	double result2;
	
//	int add(int a, int b) {
//		result = a + b;
//		return result;
//	}
	
	void add(int a, int b) {
		result = a+b;
		System.out.println("결과 : "+result);
	}
	
//	int minus(int a, int b) {
//		result = a - b;
//		return result;
//	}

	void minus(int a, int b) {
		result = a-b;
		System.out.println("결과 : "+result);
	}	
	
//	int multi(int a, int b) {
//		result = a * b;
//		return result;
//	}
	
	void multi(int a, int b) {
		result = a*b;
		System.out.println("결과 : "+result);
	}
	
//	double devide(int a, int b) {
//		result2 = (double)a / b;
//		return result2;
//	}
	
	void devide(int a, int b) {
		result2 = (double)a / b;
		System.out.println("결과 : "+result2);
	}
	
	
	void calProcess(int a, int b, double[] number) {
		number[0] = a+b;
		number[1] = a-b;
		number[2] = a*b;
		number[3] = a/b;
	}
	

}
