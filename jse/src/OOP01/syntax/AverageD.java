package OOP01.syntax;

public class AverageD {

	public static void main(String[] args) {
		String name;
		int kor,eng;
		AverageService hulk = new AverageService();
		name = "��ũ";
		kor = 88;
		eng= 71;
		hulk.user(name, kor, eng);
		
		System.out.println("==="+name+"�� ����ǥ===");
		System.out.println("���� : "+kor+"��");
		System.out.println("���� : "+eng+"��");
		System.out.println("���� : "+hulk.add()+"��");
		System.out.println("��� : "+hulk.avg()+"��");
		
		AverageService iron = new AverageService();
		name = "���̾�";
		kor = 36;
		eng = 71;
		iron.user(name, kor, eng);
		System.out.println("==="+name+"�� ����ǥ===");
		System.out.println("���� : "+kor+"��");
		System.out.println("���� : "+eng+"��");
		System.out.println("���� : "+iron.add()+"��");
		System.out.println("��� : "+iron.avg()+"��");
		
		AverageService thor = new AverageService();
		name = "�丣";
		kor = 56;
		eng = 81;
		thor.user(name, kor, eng);
		System.out.println("==="+name+"�� ����ǥ===");
		System.out.println("���� : "+kor+"��");
		System.out.println("���� : "+eng+"��");
		System.out.println("���� : "+thor.add()+"��");
		System.out.println("��� : "+thor.avg()+"��");
	}
}
