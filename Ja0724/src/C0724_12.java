import java.util.Scanner;

public class C0724_12 {
	// 랜덤 번호 출력 //

	public static void main(String[] args) {
		// 1-25까지 숫자를 입력한 후 랜덤으로 번호를 섞어 출력하시오.
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
		

		System.out.println();
		System.out.println("-----------------------------");
		// [5][5] 출력
		System.out.println(" [5][5] 배열");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
