package OOP01.syntax;

public class CardMain {
	public static void main(String[] args) {
		CardVO player = new CardVO("��Ʈ",3);
		CardVO computer = new CardVO("�����̽�",5);
		System.out.println("ī�� ���̴� : "+CardVO.height);
		System.out.println("ī�� �ʺ�� : "+CardVO.width);
		
		// �ν��Ͻ� ���� �ϼż� �Ʒ� ���ó�� ��µǰ� �Ͻÿ�
		//System.out.println("�÷��̾�� ��Ʈ 3�̰� ��ǻ�ʹ� �����̽� 5�Դϴ�.");
		//System.out.println("��ǻ�Ͱ� �����̽� 5�� �̰���ϴ�.");
		
		System.out.println("�÷��̾�� "+player.getKind()+player.getNumber()+"�̰�, ��ǻ�ʹ� "
		+computer.getKind()+computer.getNumber()+"�Դϴ�.");
		System.out.println("��ǻ�Ͱ� "+computer.getKind()+computer.getNumber()+"�� �̰���ϴ�.");
	}
}
