package OOP03.inheritance;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		//�Ϲ����� ��ü����
		//ParentC p = new ParentC();
		//ChildC c = new ChildC();
		
		//�θ�Ÿ�� = new �ڽ�Ÿ��
		ParentC p2 = new ChildC();
		//�������̵��� �ڽ�Ŭ���� �޼ҵ� �켱 ���
		//overriding == �ֿ켱�õǴ�...
		p2.over(1);
		//�������̵� ���� ������ �θ�Ŭ���� �켱 ȣ��
		p2.noOver(1);
		//�θ�Ŭ���� Ÿ���� �ڽ�Ŭ������ ���� ����ȯ
		ChildC c2 = (ChildC)p2;
		c2.onlyChild();
		c2.noOver("AAA");
	}
}
class ParentC{
	void over(int i){
		System.out.println("ParentC - over() : "+(i*10));
	}
	void noOver(int i){
		System.out.println("ParentC - noOver() : "+ i );
	}
}
class ChildC extends ParentC{
	/*public ChildC() {
		super.noOver(2);
	}*/
	void over(int i){
		System.out.println("ChildC - over() : "+(i*10000));
	}
	void noOver(String s){
		System.out.println("ChildC - noOver() : "+s);
	}
	void onlyChild(){
		System.out.println("onlyB()");
	}
}