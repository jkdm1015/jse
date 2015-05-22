package OOP05.polymorphism;

public class NumberVO {
	private int player, com;
	
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		if(player <1 || player >2){
			System.out.println("1과 2만 입력하세요");
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
