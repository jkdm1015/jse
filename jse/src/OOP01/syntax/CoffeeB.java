package OOP01.syntax;
/*
 �����ڴ� �ν��Ͻ��� ������ ��
 ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���' �̴�
*/

class MilkCoffee{
	public MilkCoffee(){
		System.out.println("���� �ִ�.");
	}
	public MilkCoffee(int money){
		this();
		System.out.println(money + "��");
	}
	public MilkCoffee(int money, boolean exist){
		this(money);
		System.out.println("���Ű��ɿ��� : "+(exist == true ? "Ŀ������ ����" : "Ŀ�� ����"));
	}
}
public class CoffeeB {
	/*
	  ���� �ִ�
	  500��
	  ���Ű��� ���� : Ŀ�� ���� ����
	  ....��ó�� ��µǰ� �����ڸ� �ѹ��� ������
	 */
	public static void main(String[] args) {
		MilkCoffee co = new MilkCoffee(500,true);
		//�ν��Ͻ��� ������ �ʴ� �ּҰ��� ���� ����(���۷���) �����̴�.
	}
}
