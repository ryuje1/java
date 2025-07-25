
public class C0724_14 {
	// 랜덤 번호 출력 - 연습 //

	public static void main(String[] args) {
		// 1차원배열 -> 1-25까지 순차번호 입력
		// 랜덤으로 번호섞기
		// 2차원 배열 -> [5][5] 랜덤번호를 입력해서 출력하시오.
		
		int[] num = new int[25];
		int[][] arr = new int[5][5];
		
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		int rnum = 0;
		int temp = 0;
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
