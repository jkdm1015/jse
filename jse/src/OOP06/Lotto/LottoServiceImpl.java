package OOP06.Lotto;

public class LottoServiceImpl implements LottoService {
	private int money;
	int[][] lottos;
	int[] ball = new int[45];

	@Override
	public void extractLottos(int money) {
		inputMoney(money);
		int count; // = this.getCount(money); <= 의미 없음
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		for (int i = 0; i < 100; i++) {
			int j = getRandomNum();
			int temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		for(int i = 0 ; i<lottos.length ; i++){
			for(int j = 0; j<lottos[i].length; j++){
				lottos[i][j] = ball[j];
			}
		}
		// 내부 구현
		// isDuplication() 메소드 사용해야 합니다.
		// 중복되지 않은 숫자이면
		// lottos[count][i] = num 의 형태로 들어가게 됩니다.

	}

	@Override
	public void printLotto() {
		
		for (int i = 0; i < lottos.length; i++) {
			extractLottos(money);
			sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j] + " ");
			}
			System.out.println();
		}
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int[money / 1000][6];

	}

	@Override
	public int getRandomNum() {
		return (int) (Math.random() * 45);
	}

	@Override
	public boolean isDuplicateion() {
		/*
		 * for(int i = 0 ; i<6 ; i++){ if(lottos[bool][i]==0){ return false; }
		 * if(lottos[bool][i] == radomNum){ return true; }
		 * 
		 * }
		 */

		return false;
	}

	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// 완성해주세요
					// 포털에 스왑 알고리즘 검색하면 나옴
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}

	@Override
	public int getCount(int money) {
		if (money < 1000) {
			return 0;
		}
		return (int) Math.ceil(money / 1000);
	}

}
