
public class C0725_07 {
	// 2차원 배열 //
	
	public static void main(String[] args) {
		// 중요! 외우기
		
		// 1차원배열 25개를 1-25까지 입력하여
		// 랜덤으로 섞어서 출력하시오.
		// 순차출력 : 1 2 3 4 5 6 7 8 ... 25까지 먼저 출력 후
		// 랜덤출력 : 21 1 5 9 30 .... 25개 출력되도록 하시오.
		
		int[] num = new int[25];
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		System.out.print("순차출력 : ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}

		int temp = 0;
		int rnum = 0;
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		System.out.println();
		System.out.print("랜덤출력 : ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		
		// 2차원 배열에 랜덤번호를 입력해서
		// 2차원 배열을 출력하시오.
		// 21 1 5 9 30
		// 7 6 33 44 45
		
		int[][] arr = new int[5][5];
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
		
		// 중요부분 여기까지 --------
		
		
		
		
		
//		// 1차원 배열 []
//		// 2차원 배열 [][]
//		int[][] score = new int[5][3];	//5*3 = 15
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				score[i][j] = 3*i+j+1;
//			}
//		}
//		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
	}

}
