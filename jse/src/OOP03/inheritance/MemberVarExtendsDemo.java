package OOP03.inheritance;

class Car{
	String name = "자동차";
}
class Hcar extends Car{
	String brand = "현대";
}
public class MemberVarExtendsDemo{
	public static void main(String[] args) {
		Hcar h = new Hcar();
		System.out.print(h.brand+"\t");
		System.out.print(h.name+"\t");
	}
}
