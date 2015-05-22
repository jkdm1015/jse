package OOP05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		KaupInterface kaup = new KaupServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 : ");
		double height = scanner.nextDouble();

		System.out.println("체중을 입력하세요 : ");
		double weight = scanner.nextDouble();
		
		kaup.getKaupIndex(height, weight);
		System.out.println(kaup.getResultMsg());
		scanner.close();
	}
}
