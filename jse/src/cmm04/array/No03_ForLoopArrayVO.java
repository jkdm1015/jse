package cmm04.array;

public class No03_ForLoopArrayVO {

	
	void sum(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		System.out.println("입력 받은 5개의 합은 : " + sum);
	}
}
