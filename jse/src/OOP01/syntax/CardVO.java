package OOP01.syntax;
/*
Date : 2015-05-19 
Author : Á¤¹Î±Ô
Dese : static ¿¹Á¦
*/
public class CardVO {
	private String kind; //Ä«µå¹«´Ì
	private int number;
	static int width = 100;
	static int height = 250;
	
	public String getKind() {
		return kind;
	}
	public int getNumber() {
		return number;
	}
	public CardVO(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}
