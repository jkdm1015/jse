package OOP05.polymorphism;

public class AppleImpl implements FruitInterface{

	@Override
	public void disPlay(String s) {
		System.out.println(s + " 사과입니다.");
	}

}
