package OOP01.syntax;

public class AverageA {
	String name;
	int kor,eng;
	
	public static void main(String[] args) {
		//tot, avg ���������� �����Ͻð�
		//�Ʒ��� ���� ��µǵ��� �ϼ���.
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA thor = new AverageA();
		
		
		hulk.name = "��ũ";
		hulk.eng = 70;
		hulk.kor = 83;
		
		iron.name = "���̾�";
		iron.eng = 99;
		iron.kor = 88;
		
		thor.name = "�丣";
		thor.eng = 71;
		thor.kor = 65;
		
		int tot = hulk.kor+hulk.eng;
		double avg = tot/2d;
		
		System.out.println("==="+hulk.name+"�� ����ǥ===");
		System.out.println("���� : "+hulk.kor+"��");
		System.out.println("���� : "+hulk.eng+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
		
		
		System.out.println("==="+iron.name+"�� ����ǥ===");
		System.out.println("���� : "+iron.kor+"��");
		System.out.println("���� : "+iron.eng+"��");
		System.out.println("���� : "+(iron.kor+iron.eng)+"��");
		System.out.println("��� : "+(iron.kor+iron.eng)/2+"��");
		
		
		System.out.println("==="+thor.name+"�� ����ǥ===");
		System.out.println("���� : "+thor.kor+"��");
		System.out.println("���� : "+thor.eng+"��");
		System.out.println("���� : "+(thor.kor+thor.eng)+"��");
		System.out.println("��� : "+(thor.kor+thor.eng)/2+"��");
		
		//��ũ ���̾� �丣 ���
	}

}
