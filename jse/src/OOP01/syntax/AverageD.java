package OOP01.syntax;

public class AverageD {

	public static void main(String[] args) {
		String name;
		int kor,eng;
		AverageService hulk = new AverageService();
		name = "헐크";
		kor = 88;
		eng= 71;
		hulk.user(name, kor, eng);
		
		System.out.println("==="+name+"의 성적표===");
		System.out.println("국어 : "+kor+"점");
		System.out.println("영어 : "+eng+"점");
		System.out.println("총점 : "+hulk.add()+"점");
		System.out.println("평균 : "+hulk.avg()+"점");
		
		AverageService iron = new AverageService();
		name = "아이언";
		kor = 36;
		eng = 71;
		iron.user(name, kor, eng);
		System.out.println("==="+name+"의 성적표===");
		System.out.println("국어 : "+kor+"점");
		System.out.println("영어 : "+eng+"점");
		System.out.println("총점 : "+iron.add()+"점");
		System.out.println("평균 : "+iron.avg()+"점");
		
		AverageService thor = new AverageService();
		name = "토르";
		kor = 56;
		eng = 81;
		thor.user(name, kor, eng);
		System.out.println("==="+name+"의 성적표===");
		System.out.println("국어 : "+kor+"점");
		System.out.println("영어 : "+eng+"점");
		System.out.println("총점 : "+thor.add()+"점");
		System.out.println("평균 : "+thor.avg()+"점");
	}
}
