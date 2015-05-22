package OOP05.polymorphism;

public class BananaImpl implements FruitInterface{

	@Override
	public void disPlay(String s) {
		System.out.println(s + " 바나나입니다.");
	}
}
