
public class MServiceImpl2 implements MService {

	@Override
	public void selectAll() {
		System.out.println("게시판 전체출력입니다.");
	}

	@Override
	public void selectOne() {
		System.out.println("게시글 1개 출력입니다.");
	}

	@Override
	public void update() {
		System.out.println("게시글 1개 수정입니다.");
	}

	@Override
	public void delete() {
		System.out.println("게시글 1개 삭제입니다.");
	}

}
