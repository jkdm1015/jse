package OOP05.polymorphism;

import java.util.Scanner;

public class NumberMatchMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.println("���ڸ��߱� ������ �����մϴ�");
		System.out.print("1�̳� 0�� �Է��ϼ��� : ");
		int playVal = scanner.nextInt();
		NumberMatchService service = new NumberServiceImpl();
		int comVal = service.makeComeVal();
		service.match(playVal, comVal);
		System.out.println("��ǻ�ʹ� ������ ���� " + comVal + "�Դϴ�");
		System.out.println(service.disPlay());

		scanner.close();
	}
}
