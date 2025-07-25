import java.util.Arrays;

public class C0724_02 {
	// 배열 복사 //

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int num = 5;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);  // 주소값 출력
		
		// num - 기본변수 : 정수형 값변경
		int num2 = 0;
		num2 = num;
		System.out.println(num2);  // 5
		num = 10;
		System.out.println(num2);  // 5
		
		// 배열 값변경
		// 얕은복사 : 복사하면 주소값을 복사해서 같은 곳을 바라봄. 값이 동일하게 변경됨.
		int[] arr2 = {0,0,0,0,0};
		System.out.println(Arrays.toString(arr2)); // 0,0,0,0,0
		arr2 = arr;
		System.out.println(Arrays.toString(arr2)); // 1,2,3,4,5
		arr[0] = 100;
		arr[1] = 200;
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr);
		System.out.println(arr2);
	}

}
