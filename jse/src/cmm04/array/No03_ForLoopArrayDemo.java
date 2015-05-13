package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[5];

		No03_ForLoopArrayVO arr = new No03_ForLoopArrayVO();
		for (int i = 0; i < input.length; i++) {
			System.out.print((i + 1) + "번째 수를 입력 하세요 : ");
			input[i] = scanner.nextInt();
		}
		arr.sum(input);
		scanner.close();
	}
}
