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
		hulk.user("��ũ", 88, 71);
		AverageC iron = new AverageC();
		iron.user("���̾�", 92, 61);
		AverageC thor = new AverageC();
		thor.user("�丣", 56, 81);
		
	/*	AverageC iron = new AverageC();
		vo.setName("���̾�");
		iron.eng = 99;
		iron.kor = 88;
		AverageC thor = new AverageC();
		vo.setName("�丣");
		thor.eng = 30;
		thor.kor = 65;
		*/
		System.out.println("==="+1+"�� ����ǥ===");
		System.out.println("���� : "+1+"��");
		System.out.println("���� : "+1+"��");
		System.out.println("���� : "+1+"��");
		System.out.println("��� : "+1+"��");
		
		
/*		System.out.println("==="+iron.name+"�� ����ǥ===");
		System.out.println("���� : "+iron.kor+"��");
		System.out.println("���� : "+iron.eng+"��");
		System.out.println("���� : "+iron.add()+"��");
		System.out.println("��� : "+iron.avg()+"��");
		
		
		System.out.println("==="+thor.name+"�� ����ǥ===");
		System.out.println("���� : "+thor.kor+"��");
		System.out.println("���� : "+thor.eng+"��");
		System.out.println("���� : "+thor.add()+"��");
		System.out.println("��� : "+thor.avg()+"��");
		*/
	}

}
