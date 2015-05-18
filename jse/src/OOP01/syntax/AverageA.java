package OOP01.syntax;

public class AverageA {
	String name;
	int kor,eng;
	
	public static void main(String[] args) {
		//tot, avg 지역변수를 선언하시고
		//아래와 같이 출력되도록 하세요.
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA thor = new AverageA();
		
		
		hulk.name = "헐크";
		hulk.eng = 70;
		hulk.kor = 83;
		
		iron.name = "아이언";
		iron.eng = 99;
		iron.kor = 88;
		
		thor.name = "토르";
		thor.eng = 71;
		thor.kor = 65;
		
		int tot = hulk.kor+hulk.eng;
		double avg = tot/2d;
		
		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 : "+hulk.kor+"점");
		System.out.println("영어 : "+hulk.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		
		
		System.out.println("==="+iron.name+"의 성적표===");
		System.out.println("국어 : "+iron.kor+"점");
		System.out.println("영어 : "+iron.eng+"점");
		System.out.println("총점 : "+(iron.kor+iron.eng)+"점");
		System.out.println("평균 : "+(iron.kor+iron.eng)/2+"점");
		
		
		System.out.println("==="+thor.name+"의 성적표===");
		System.out.println("국어 : "+thor.kor+"점");
		System.out.println("영어 : "+thor.eng+"점");
		System.out.println("총점 : "+(thor.kor+thor.eng)+"점");
		System.out.println("평균 : "+(thor.kor+thor.eng)/2+"점");
		
		//헐크 아이언 토르 출력
	}

}
