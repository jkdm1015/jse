package OOP03.inheritance;

class Car{
	String name = "�ڵ���";
}
class Hcar extends Car{
	String brand = "����";
}
public class MemberVarExtendsDemo{
	public static void main(String[] args) {
		Hcar h = new Hcar();
		System.out.print(h.brand+"\t");
		System.out.print(h.name+"\t");
	}
}
