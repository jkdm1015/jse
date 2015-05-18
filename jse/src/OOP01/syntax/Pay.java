package OOP01.syntax;

public class Pay {
	
	String name;
	int salary;
	static final double TAX = 0.1;
	
	public static void main(String[] args) {
	Pay pay = new Pay();	
	
		pay.name = "헐크";
		pay.salary = (int)((1-TAX)*300);
		System.out.println("===="+pay.name+"의 5월달 실급여는 "+pay.salary+"만원 입니다.");
		pay.name = "아이언";
		pay.salary = (int)((1-TAX)*500);
		System.out.println("===="+pay.name+"의 5월달 실급여는 "+pay.salary+"만원 입니다.");
		pay.name = "토르";
		pay.salary = (int)((1-TAX)*100);
		System.out.println("===="+pay.name+"의 5월달 실급여는 "+pay.salary+"만원 입니다.");
	}
}
