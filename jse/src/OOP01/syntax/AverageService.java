package OOP01.syntax;

public class AverageService {
	AverageDVO vo = new AverageDVO();
	
	int add(){
		int sum = vo.getKor()+vo.getEng();
		return sum;
	}
	double avg(){
		double avg = add()/2d;
		return avg;
	}
	void user(String name, int kor, int eng){
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
	}

}
