package OOP02.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		RpsUtil util = new RpsUtil();
		System.out.println("가위 바위 보 게임을 시작합니다.");
		RpsService service = new RpsService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 : 1  바위 : 2  보 : 3 을 입력하세요.");
		int playersValue = scanner.nextInt();
		if (playersValue >=1  && playersValue <= 3) {
			service.showStringValue(playersValue);
			System.out.println("당신은 " + service.showStringValue(playersValue)
					+ "을 냈습니다.");
			int comValue = service.disPlayComValue();
			System.out.println("컴퓨터는 " + service.showStringValue(comValue)
					+ "을 냈습니다.");
			String winner = service.showWinner(playersValue, comValue);
			System.out.println("결과는 " + winner);
		} else{
			System.out.println(util.showRange(1, 3));
		}
		scanner.close();
	}
}
