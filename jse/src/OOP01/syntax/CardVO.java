package OOP01.syntax;
/*
Date : 2015-05-19 
Author : ���α�
Dese : static ����
*/
public class CardVO {
	private String kind; //ī�幫��
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
