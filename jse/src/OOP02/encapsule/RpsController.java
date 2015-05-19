package OOP02.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		RpsUtil util = new RpsUtil();
		System.out.println("���� ���� �� ������ �����մϴ�.");
		RpsService service = new RpsService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� : 1  ���� : 2  �� : 3 �� �Է��ϼ���.");
		int playersValue = scanner.nextInt();
		if (playersValue >=1  && playersValue <= 3) {
			service.showStringValue(playersValue);
			System.out.println("����� " + service.showStringValue(playersValue)
					+ "�� �½��ϴ�.");
			int comValue = service.disPlayComValue();
			System.out.println("��ǻ�ʹ� " + service.showStringValue(comValue)
					+ "�� �½��ϴ�.");
			String winner = service.showWinner(playersValue, comValue);
			System.out.println("����� " + winner);
		} else{
			System.out.println(util.showRange(1, 3));
		}
		scanner.close();
	}
}
