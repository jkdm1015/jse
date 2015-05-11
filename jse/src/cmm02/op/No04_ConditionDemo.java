package cmm02.op;

public class No04_ConditionDemo {
	public static void main(String[] args) {
		int val01 = 1;
		int val02 = 2;
		
		if((val01 == 1) && (val02 == 2)){
			System.out.println("1번 값과 2번 값은 맞습니다.");
		}
		if((val01 != 1) || (val02 != 2)){
			System.out.println("1번 값과 2번 값은 틀립니다.");
		}
	}
}
