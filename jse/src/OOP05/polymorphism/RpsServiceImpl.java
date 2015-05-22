package OOP05.polymorphism;

public class RpsServiceImpl implements RpsService{

	@Override
	public int disPlayComValue() {
		int i = (int)(Math.random()*3)+1;
		return i;
	}

	@Override
	public String showWinner(int playersValue, int comValue) {
		int result = playersValue-comValue;
		String msg = "";
		switch(result){
			case 0:
				msg = "�����ϴ�.";
				break;
			case 1:
			case -2:
				msg = "�¸��ڴ� ����Դϴ�.";
				break;
			default: 
				msg = "�¸��ڴ� ��ǻ���Դϴ�.";
				break;
		}return msg;
	}

	@Override
	public String showStringValue(int playersValue) {
		String str;
		switch(playersValue){
		case 1:
			str = "����";
			break;
		case 2:
			str = "����";
			break;
		case 3:
			str = "��";
			break;
		default:
			str = "1~3������ �Է��ϼ���";
			break;
		}
		return str;
	}

}
