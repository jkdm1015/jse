package OOP01.syntax;

public class AverageB {

	String name;
	int kor,eng;
	//�޼ҵ带 ���⿡ �����ϼż� �޼ҵ带 ��üȭ ���ּ���
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
		hulk.name = "��ũ";
		hulk.eng = 70;
		hulk.kor = 83;
		
		AverageB iron = new AverageB();
		iron.name = "���̾�";
		iron.eng = 99;
		iron.kor = 88;
		AverageB thor = new AverageB();
		thor.name = "�丣";
		thor.eng = 30;
		thor.kor = 65;
	
		

		System.out.println("==="+hulk.name+"�� ����ǥ===");
		System.out.println("���� : "+hulk.kor+"��");
		System.out.println("���� : "+hulk.eng+"��");
		System.out.println("���� : "+hulk.add()+"��");
		System.out.println("��� : "+hulk.avg()+"��");
		
		
		System.out.println("==="+iron.name+"�� ����ǥ===");
		System.out.println("���� : "+iron.kor+"��");
		System.out.println("���� : "+iron.eng+"��");
		System.out.println("���� : "+iron.add()+"��");
		System.out.println("��� : "+iron.avg()+"��");
		
		
		System.out.println("==="+thor.name+"�� ����ǥ===");
		System.out.println("���� : "+thor.kor+"��");
		System.out.println("���� : "+thor.eng+"��");
		System.out.println("���� : "+thor.add()+"��");
		System.out.println("��� : "+thor.avg()+"��");
		
		
	}
}
