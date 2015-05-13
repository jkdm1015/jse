package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];

		No03_ForLoopArrayVO1 vo = new No03_ForLoopArrayVO1();
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 수를 입력 하세요 : ");
			arr[i] = scanner.nextInt();
		}
		vo.setArr(arr);
		vo.sum();
		scanner.close();
	}
}
