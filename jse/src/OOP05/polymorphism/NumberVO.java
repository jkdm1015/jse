package OOP05.polymorphism;

public class NumberVO {
	private int player, com;
	
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		if(player <1 || player >2){
			System.out.println("1�� 2�� �Է��ϼ���");
		}else{
			this.player = player;
		}
	}
	public int getCom() {
		return com;
	}

	public void setCom(int com){
		this.com = com;
	}

}
