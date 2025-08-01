import java.util.ArrayList;
import java.util.List;

public class C0801_07 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		// 숫자 3 삭제
//		list.remove(2);
		
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);		// 모두삭제
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
//		Student s = new Student(1, "홍길동", 100, 100, 100);
//		ArrayList<Student> list2 = new ArrayList<Student>();
//		
//		// 제너릭 - 특정객체만 입력가능하도록 제어
//		ArrayList<Person> list = new ArrayList<Person>();
//		Person p1 = new Person(10000, "홍길자");
//		
//		list.add(p1);
//		list.add(new Person(10001, "홍길동"));
//		list.add(new Person(10007, "유관순"));
//		list.add(new Person(10005, "강감찬"));
//		list.add(new Person(10006, "김구"));
////		list.add(s);
//		list.add(new Person(10008, "홍길동"));
//		list.add(new Person(10002, "유관순"));
//		list.add(new Person(10003, "이순신"));
//		
//		// id 전체출력 하시오.
//		for(int i=0; i<list.size(); i++) {
//			System.out.printf("%d, %s \n", ((Person)list.get(i)).id, ((Person)list.get(i)).name);
//		}
//		
//		System.out.println("-------------------------");
//		
//		// id : 10006번을 삭제 후 전체출력하시오.
//		for(int i=0; i<list.size(); i++) {
//			if( ((Person)list.get(i)).id == 10006 ) {
//				list.remove(i);
//				break;
//			}
//		}
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.printf("%d, %s \n", ((Person)list.get(i)).id, ((Person)list.get(i)).name);
//		}
		
		
		
//		// list - 순서O, 중복O
//		ArrayList list = new ArrayList();
//		list.add(1);  // 추가 - Integer객체
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(3);
//		list.add(5);
//		
//		for(int i=0; i<list.size(); i++) {
//			// 읽기 - get()
//			System.out.println(list.get(i));
//		}
//		System.out.println("--------------------------");
//		
//		// 삭제 - remove()
//		list.remove(3);
//		
//		// 모두 삭제 - clear()
//		list.clear();
//		for(int i=0; i<list.size(); i++) {
//			// 읽기 - get()
//			System.out.println(list.get(i));
//		}

		
//		ArrayList list = new ArrayList();
//		List list2 = new ArrayList();
	}

}
