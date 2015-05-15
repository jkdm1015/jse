package OOP01.encapsule;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
		int player;
		Scanner scanner = new Scanner(System.in);
		NumberMatchService service = new NumberMatchService();
		System.out.println("1~2까지의 수를 입력해주세요");
		player = scanner.nextInt();
		service.game(player);
		scanner.close();
	}
}
