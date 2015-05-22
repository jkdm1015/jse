package OOP05.polymorphism;

public class KaupServiceImpl implements KaupInterface{
	KaupVO vo = new KaupVO();
	@Override
	public int getKaupIndex(double height, double weight) {
		vo.setHeight(height);
		vo.setWeight(weight);
		return (int) ((weight / (height * height)) * 10000);
	}

	@Override
	public String getResultMsg() {
		int idx = getKaupIndex(vo.getHeight(), vo.getWeight());
		String msg ="";
		if (idx > 30) {
			msg = " ��";
		} else if (idx > 24) {
			msg = " ��ü��";
		} else if (idx > 20) {
			msg = " ����";
		} else if (idx > 15) {
			msg = " ��ü��";
		} else if (idx > 13) {
			msg = " ����";
		} else if (idx > 10) {
			msg = " �������";
		} else {
			msg = " �Ҹ���";
		}
		return "Ű�� "+vo.getHeight()+"cm, ü���� "+vo.getWeight()+
				"kg �̸� ī���������� "+idx+"�̸� "+msg+"�Դϴ�";
	}

}
