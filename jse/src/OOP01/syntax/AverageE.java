package OOP01.syntax;

public class AverageE {
	

	public static void main(String[] args) {
		AverageEVO vo = new AverageEVO("��ũ", 90, 87);
		System.out.println("==="+vo.getName()+"�� ����ǥ===");
		System.out.println("���� : "+vo.getKor()+"��");
		System.out.println("���� : "+vo.getEng()+"��");
		System.out.println("���� : "+vo.add(vo.getEng(), vo.getKor())+"��");
		System.out.println("��� : "+vo.avg(vo.getEng(), vo.getKor())+"��");
	}
	
}
