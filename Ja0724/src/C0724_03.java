
public class C0724_03 {
	// 로또 번호 맞추기 - 번호 입력, 섞기, 출력 //

	public static void main(String[] args) {
		// 로또번호 맞추기
//		int lotto = (int)(Math.random()*3)+1;
		
		// 1-45까지 배열생성
		int[] num = new int[45];
		// 번호 입력
		for(int i=0; i<45; i++) {
			num[i]=i+1;
		}
		// 번호 섞기
		int rnum = 0;
		int temp = 0;	// 임시저장
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);	 // 0-44
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		// 번호 출력
		System.out.print("로또 번호 : ");
		for(int i=0; i<45; i++) {
			System.out.print(num[i]+" ");
		}
	}

}
