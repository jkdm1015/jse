package OOP02.encapsule;

public class NumberMatchVo {
	int player, com;
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		if(player <1 || player >5){
			System.out.println("1���� 2������ ������ �Է��ؾ� �մϴ�.");
		}else{
			this.player = player;
		}
	}
	public int getCom() {
		return com;
	}
	public void setCom() {
		this.com = (int) ((Math.random()*2)+1);
	}
	public void setCom(int com){
		this.com = com;
	}

}
