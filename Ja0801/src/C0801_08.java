import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class C0801_08 {

	public static void main(String[] args) {
		// list -> 순서O, 중복O
		// Set -> 순서X, 중복X		: 2개 테이블을 합쳤을때 동일한 것은 1개만 입력되도록 할때 사용
		
		HashSet set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(5);

		// Iterator 사용 - 1회성
		Iterator it = set.iterator();  // list, set iterator 사용해야함
		while(it.hasNext()) {	// hasNext() : 다음 것이 있는지 확인
			System.out.println(it.next()); // next() : 1개 가져옴
		}
		Iterator it2 = set.iterator();  // list, set iterator 사용해야함
		while(it2.hasNext()) {	// hasNext() : 다음 것이 있는지 확인
			System.out.println(it2.next()); // next() : 1개 가져옴
		}
		
		System.out.println("-------------------");
		ArrayList list = new ArrayList();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(1);
		Iterator it3 = list.iterator();
		System.out.println("------------------");
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		
		
		// 순서가 없어서 for문을 사용할 수 없음
//		for(int i=0; i<set.size(); i++) {
//			
//		}
	}

}
