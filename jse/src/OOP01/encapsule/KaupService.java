package OOP01.encapsule;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		KaupVo kaup = new KaupVo();
	
			System.out.println("키를 입력하세요 : ");
			double height = scanner.nextDouble();
			kaup.setHeight(height);

			System.out.println("체중을 입력하세요 : ");
			double weight = scanner.nextDouble();
			kaup.setWeight(weight);

			kaup.setIdx(weight, height);
			kaup.setMsg("");
			
			System.out.println(kaup.toString());
			scanner.close();
	}
}
