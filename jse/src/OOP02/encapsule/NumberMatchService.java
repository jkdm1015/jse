package OOP02.encapsule;

public class NumberMatchService {
	NumberMatchVo vo = new NumberMatchVo();
	
	int result;
	int player=0;
	
	public int game(int player) {
		vo.setCom();
		vo.setPlayer(player);
		if (vo.getPlayer() == vo.getCom()) {
			System.out.println("���� !!");
			result = 1;
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ���� " + vo.getCom() + " �Դϴ�");
			result = 0;
		}
		return result;
	}
}			

	
