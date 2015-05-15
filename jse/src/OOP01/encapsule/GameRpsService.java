package OOP01.encapsule;
/*
  Date : 2015.05.15 
  Author : 정민규
  Description : 가위 바위 보 게임
  1은 가위 2는 바위 3은 보
  
 */
public class GameRpsService {

	GameRpsVO vo = new GameRpsVO();
	
	// 숫자 값에 따른 가위 바위 보 결정 로직
	  
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
	public int disPlayComValue() {
		int i = (int)(Math.random()*3)+1;
		return i;
	}

	public String showWinner(int comValue, int playersValue) {
		String str;
		if(comValue<playersValue){
			str = "컴퓨터 승리";
		}if(comValue>playersValue){
			str = "사용자 승리";
		}else{
			str = "비겼습니다.";
		}
		return str;
	}

	/*
	 * if(1<2<3<1)
	 * 두수의 차가 절대값이 1인경우는 큰수가 승
	 * 두수의 차가 절대값이 2인경우는 작수가 승
	 * 
	 * 
	 * */   

}
