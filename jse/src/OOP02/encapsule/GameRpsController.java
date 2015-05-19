package OOP02.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("가위 바위 보 게임을 시작합니다.");
		GameRpsService service = new GameRpsService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 : 1  바위 : 2  보 : 3 을 입력하세요");
		int playersValue = scanner.nextInt();
		service.showStringValue(playersValue);
		System.out.println("당신은 "+service.showStringValue(playersValue)+"을 냈습니다.");
		int comValue = service.disPlayComValue();
		System.out.println("컴퓨터는 "+service.showStringValue(comValue)+"을 냈습니다.");
		String winner = service.showWinner(playersValue, comValue);
		System.out.println("결과는 "+ winner);
		scanner.close();
	}

}
