package OOP02.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("���� ���� �� ������ �����մϴ�.");
		GameRpsService service = new GameRpsService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� : 1  ���� : 2  �� : 3 �� �Է��ϼ���");
		int playersValue = scanner.nextInt();
		service.showStringValue(playersValue);
		System.out.println("����� "+service.showStringValue(playersValue)+"�� �½��ϴ�.");
		int comValue = service.disPlayComValue();
		System.out.println("��ǻ�ʹ� "+service.showStringValue(comValue)+"�� �½��ϴ�.");
		String winner = service.showWinner(playersValue, comValue);
		System.out.println("����� "+ winner);
		scanner.close();
	}

}
