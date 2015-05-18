package OOP01.syntax;

public class AverageC {
	
	AverageVO vo = new AverageVO();
	
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
	
	
	public static void main(String[] args) {
		
		
		AverageC hulk = new AverageC();
		hulk.user("헐크", 88, 71);
		AverageC iron = new AverageC();
		iron.user("아이언", 92, 61);
		AverageC thor = new AverageC();
		thor.user("토르", 56, 81);
		
	/*	AverageC iron = new AverageC();
		vo.setName("아이언");
		iron.eng = 99;
		iron.kor = 88;
		AverageC thor = new AverageC();
		vo.setName("토르");
		thor.eng = 30;
		thor.kor = 65;
		*/
		System.out.println("==="+1+"의 성적표===");
		System.out.println("국어 : "+1+"점");
		System.out.println("영어 : "+1+"점");
		System.out.println("총점 : "+1+"점");
		System.out.println("평균 : "+1+"점");
		
		
/*		System.out.println("==="+iron.name+"의 성적표===");
		System.out.println("국어 : "+iron.kor+"점");
		System.out.println("영어 : "+iron.eng+"점");
		System.out.println("총점 : "+iron.add()+"점");
		System.out.println("평균 : "+iron.avg()+"점");
		
		
		System.out.println("==="+thor.name+"의 성적표===");
		System.out.println("국어 : "+thor.kor+"점");
		System.out.println("영어 : "+thor.eng+"점");
		System.out.println("총점 : "+thor.add()+"점");
		System.out.println("평균 : "+thor.avg()+"점");
		*/
	}

}
