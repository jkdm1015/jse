package OOP03.inheritance;
/*
 Date : 2015-05-20
 Author : 정민규
 Desc : 메소드 상속 
 */

/*
 Car 
 △
 |
 Hcar <= new(instantiate)
 */
class Car2{
	String name = "자동차";
	public String gear(){
		return "수동기어";
	}
}
class Hcar2 extends Car2{
	String brand = "현대";
	public String autoGear(){
		return "오토기어";
	}
}
public class MethodExtendsDemo {
	public static void main(String[] args) {
		Hcar2 h = new Hcar2();
		System.out.println(h.gear());
		System.out.println(h.autoGear());
		
		Car2 car2 = new Car2();
		System.out.println(car2.gear());
	//	System.out.println(car2.autoGear());
	//	상속하여 받을 수 있는 로직은 자식만 가능하다
		
	}
}
