package OOP02.encapsule;

public class NumberMatchService {
	NumberMatchVo vo = new NumberMatchVo();
	
	int result;
	int player=0;
	
	public int game(int player) {
		vo.setCom();
		vo.setPlayer(player);
		if (vo.getPlayer() == vo.getCom()) {
			System.out.println("정답 !!");
			result = 1;
		} else {
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 " + vo.getCom() + " 입니다");
			result = 0;
		}
		return result;
	}
}			

	
