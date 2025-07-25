import java.util.Arrays;
import java.util.Scanner;

public class C0725_09 {

	public static void main(String[] args) {
		String[] num = new String[45];
		String[][] arr = new String[9][5];
		String[][] arr2 = new String[9][5];
		
		for(int i=0; i<num.length; i++) {
			num[i] = ""+(i+1);
		}		
		
		// 순차번호 - arr
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		
		String temp = "";
		int rnum = 0;
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 랜덤번호 arr2
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr2[i][j] = num[5*i+j];
			}
		}
		
		// 출력
//		System.out.println("[ 순차번호 ]");
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println("-----------------------");
//		System.out.println();
//		
//		System.out.println("[ 랜덤번호 ]");
//		for(int i=0; i<arr2.length; i++) {
//			for(int j=0; j<arr2[i].length; j++) {
//				System.out.print(arr2[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {			
			System.out.println("[ 랜덤번호 ]");
			System.out.println("-----------------------------------");
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					System.out.print(arr2[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하세요.  ");
			String choice = scan.next();
			
			// 번호를 입력받아 해당 번호 위치에 X를 표시하시오.
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					if(arr2[i][j].equals(choice)) {
						arr2[i][j] = "X";
					}
				}
			}
			
			
		}
		
		
		
		
	}

}
