package OOP05.polymorphism;

import java.util.Scanner;

public class NumberMatchMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.println("숫자맞추기 게임을 시작합니다");
		System.out.print("1이나 0을 입력하세요 : ");
		int playVal = scanner.nextInt();
		NumberMatchService service = new NumberServiceImpl();
		int comVal = service.makeComeVal();
		service.match(playVal, comVal);
		System.out.println("컴퓨터는 선택한 값은 " + comVal + "입니다");
		System.out.println(service.disPlay());

		scanner.close();
	}
}
