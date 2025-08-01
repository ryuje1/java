
public class Stuscore {
	
	static int count;
	private int no;		 // private : 같은 클래스 내에서만 접근 가능
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	Stuscore(){}
	Stuscore(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	{no = ++count;}	// 초기화블럭 - 객체생성시 우선실행
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
