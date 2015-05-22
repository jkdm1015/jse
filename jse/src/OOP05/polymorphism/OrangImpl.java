package OOP05.polymorphism;

public class OrangImpl implements FruitInterface{

	@Override
	public void disPlay(String s) {
		System.out.println(s + " 오렌지입니다.");
	}
	public int getConut(){
		return 1000;
	}
}
