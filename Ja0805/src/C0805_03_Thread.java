
public class C0805_03_Thread {

	public static void main(String[] args) {
		
		// 싱글쓰레드 - 우리가 현재 작업하는 모든 것은 싱글쓰레드 방식
//		for(int i=0; i<300; i++) {
//			System.out.println("----");
//		}
//		
//		for(int i=0; i<300; i++) {
//			System.out.println("||||");
//		}
		
		
		
		// 멀티쓰레드
		MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
		m1.start();	// 300
		m2.start(); 	// 300
		
		
		
		
//		MyThread1 m1 = new MyThread1();
//		m1.run();
		
		
	}

}
