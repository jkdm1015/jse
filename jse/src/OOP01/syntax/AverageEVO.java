package OOP01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	
	public AverageEVO() {
		//叼弃飘 积己磊 流立 积己
	}
	
	int add(int kor, int eng){
		int sum = kor+eng;
		return sum;
	}
	double avg(int kor, int eng){
		double avg = (kor+eng)/2d;
		return avg;
	}
	
	AverageEVO(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
}
