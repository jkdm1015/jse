package OOP02.encapsule;

import java.util.Scanner;

public class PayController {

	public static void main(String[] args) {
		PayService Service = new PayService();

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = scanner.nextLine();
		System.out.println("�޿��� �Է��ϼ���");
		int salary = scanner.nextInt();
		Service.input(name, salary);
		
		System.out.println("=====�޿�����=====");
		System.out.println("���� : " + name);
		System.out.println("���� : " + salary +"��");
		System.out.println("���� : "+ Service.taxValue() +"%");
		System.out.println("�Ǽ��ɾ� : "+Service.realSalary()+"��");
		
		scanner.close();
	}
}
