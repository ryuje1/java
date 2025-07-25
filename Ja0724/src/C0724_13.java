import java.util.Scanner;

public class C0724_13 {
	// 랜덤 숫자 X표시 //

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[25];
		String[][] arr = new String[5][5];
		
		// 1-25까지 숫자 입력, 랜덤으로 번호 섞어서 arr 배열에 입력해서 출력하시오.
		// num - int, arr배열 - String
		
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
				arr[i][j] = num[5*i+j]+"";
			}
		}
		
		System.out.println("-----------------------------");

		while(true) {
			System.out.println();
			System.out.println(" [ 2차원 배열 ] ");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요.   ");
			String input = scan.next();
			
			
			// 입력된 번호에 해당하는 숫자에 X 표시
			loop:for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length; j++) {					
					if(arr[i][j].equals(input)) {
						arr[i][j] = "X";
						break loop;
					}
				}
				
			}
			
			
			
		}
		
		
	}

}
