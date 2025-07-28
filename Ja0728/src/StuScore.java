
public class StuScore {
	
	String name;// 인스턴스 변수
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void stuTotal() {
		total = kor+eng+math;
	}
	void stuAvg() {
		avg = (kor+eng+math)/3.0;
	}

}
