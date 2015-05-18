package OOP01.syntax;

public class AverageB {

	String name;
	int kor,eng;
	//메소드를 여기에 정의하셔서 메소드를 객체화 해주세요
	public int add(){
		int sum = kor+eng;
		return sum;
	}
	public double avg(){
		double avg = add()/2d;
		return avg;
	}
	
	public static void main(String[] args) {
		AverageB hulk = new AverageB();
		hulk.name = "헐크";
		hulk.eng = 70;
		hulk.kor = 83;
		
		AverageB iron = new AverageB();
		iron.name = "아이언";
		iron.eng = 99;
		iron.kor = 88;
		AverageB thor = new AverageB();
		thor.name = "토르";
		thor.eng = 30;
		thor.kor = 65;
	
		

		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 : "+hulk.kor+"점");
		System.out.println("영어 : "+hulk.eng+"점");
		System.out.println("총점 : "+hulk.add()+"점");
		System.out.println("평균 : "+hulk.avg()+"점");
		
		
		System.out.println("==="+iron.name+"의 성적표===");
		System.out.println("국어 : "+iron.kor+"점");
		System.out.println("영어 : "+iron.eng+"점");
		System.out.println("총점 : "+iron.add()+"점");
		System.out.println("평균 : "+iron.avg()+"점");
		
		
		System.out.println("==="+thor.name+"의 성적표===");
		System.out.println("국어 : "+thor.kor+"점");
		System.out.println("영어 : "+thor.eng+"점");
		System.out.println("총점 : "+thor.add()+"점");
		System.out.println("평균 : "+thor.avg()+"점");
		
		
	}
}
