package OOP01.game;

import java.util.Scanner;

public class NumberMatchController {
	public static void main(String[] args) {
		int player;
		Scanner scanner = new Scanner(System.in);
		NumberMatchService service = new NumberMatchService();
		System.out.println("1~5������ ���� �Է����ּ���");
		player = scanner.nextInt();
		service.game(player);
		scanner.close();
	}
}