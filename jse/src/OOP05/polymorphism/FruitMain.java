package OOP05.polymorphism;

public class FruitMain {
	public static void main(String[] args) {
		// �������̽��� ��ü�� ���� �� ����.
		// ��, FruitInterface fi = new FruitInterface();
		// ������ �߻���Ų��.
		FruitInterface apple = new AppleImpl();
		FruitInterface banana;
		// FruitInterface Ÿ���� ���������� ����..
		banana = new BananaImpl();
		// Ŭ���� BananaImpl �� ��ü�� �����Ͽ� banana �� �Ҵ��Ѵ�.
		FruitInterface orange = new OrangImpl();
		
		apple.disPlay("���ִ�");
		banana.disPlay("������");
		orange.disPlay("���");
		//orange.getCount(); == ����
		//�������̽����� ����� �޼ҵ常 ȣ���� �����ϴ�.
	}
}
