import java.io.File;
import java.io.IOException;

public class C08 {

	public static void main(String[] args) throws Exception {
		File f = new File("c:/down/abc.txt"); //파일없음
		if(!f.exists()) {
			try {
				f.createNewFile();  //용량꽉차거나 하드가 에러일때
			} catch (Exception e) {
				e.printStackTrace();
			} //파일생성이 됨.
			System.out.println("파일이 생성되었습니다.");
		}else {
			System.out.println("파일이 존재합니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
