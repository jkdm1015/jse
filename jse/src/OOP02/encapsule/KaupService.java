package OOP02.encapsule;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		KaupVo kaup = new KaupVo();
	
			System.out.println("Ű�� �Է��ϼ��� : ");
			double height = scanner.nextDouble();
			kaup.setHeight(height);

			System.out.println("ü���� �Է��ϼ��� : ");
			double weight = scanner.nextDouble();
			kaup.setWeight(weight);

			kaup.setIdx(weight, height);
			kaup.setMsg("");
			
			System.out.println(kaup.toString());
			scanner.close();
	}
}
