package OOP05.polymorphism;

public interface NumberMatchService {
	//��ǻ�Ͱ� �������� �����ϴ� ����
	public int makeComeVal();
	//�ΰ��� �Ķ���͸� ���ؼ� ��ġ�ϸ� true �ٸ��� false ����
	public boolean match(int player, int com);
	//makeComVal() �� ���ϰ��� true �� �÷��̾� �¸�
	//�ٸ��� ��ǻ�� �¸���� �޽��� ���
	public String disPlay();
}
