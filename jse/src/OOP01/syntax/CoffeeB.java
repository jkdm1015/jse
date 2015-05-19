package OOP01.syntax;
/*
 생성자는 인스턴스가 생성될 때
 호출되는 '인스턴스 초기화 메서드' 이다
*/

class MilkCoffee{
	public MilkCoffee(){
		System.out.println("돈을 넣다.");
	}
	public MilkCoffee(int money){
		this();
		System.out.println(money + "원");
	}
	public MilkCoffee(int money, boolean exist){
		this(money);
		System.out.println("구매가능여부 : "+(exist == true ? "커피종류 선택" : "커피 없음"));
	}
}
public class CoffeeB {
	/*
	  돈을 넣다
	  500원
	  구매가능 여부 : 커피 종류 선택
	  ....위처럼 출력되게 생성자를 한번만 쓰세요
	 */
	public static void main(String[] args) {
		MilkCoffee co = new MilkCoffee(500,true);
		//인스턴스는 변하지 않는 주소값을 가진 참조(레퍼런스) 변수이다.
	}
}
