package OOP01.syntax;

public class Pay {
	
	String name;
	int salary;
	static final double TAX = 0.1;
	
	public static void main(String[] args) {
	Pay pay = new Pay();	
	
		pay.name = "��ũ";
		pay.salary = (int)((1-TAX)*300);
		System.out.println("===="+pay.name+"�� 5���� �Ǳ޿��� "+pay.salary+"���� �Դϴ�.");
		pay.name = "���̾�";
		pay.salary = (int)((1-TAX)*500);
		System.out.println("===="+pay.name+"�� 5���� �Ǳ޿��� "+pay.salary+"���� �Դϴ�.");
		pay.name = "�丣";
		pay.salary = (int)((1-TAX)*100);
		System.out.println("===="+pay.name+"�� 5���� �Ǳ޿��� "+pay.salary+"���� �Դϴ�.");
	}
}
