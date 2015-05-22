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
				msg = "비겼습니다.";
				break;
			case 1:
			case -2:
				msg = "승리자는 당신입니다.";
				break;
			default: 
				msg = "승리자는 컴퓨터입니다.";
				break;
		}return msg;
	}

	@Override
	public String showStringValue(int playersValue) {
		String str;
		switch(playersValue){
		case 1:
			str = "가위";
			break;
		case 2:
			str = "바위";
			break;
		case 3:
			str = "보";
			break;
		default:
			str = "1~3까지만 입력하세요";
			break;
		}
		return str;
	}

}
