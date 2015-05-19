package OOP02.encapsule;

import java.util.Scanner;

public class PayController {

	public static void main(String[] args) {
		PayService Service = new PayService();

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("급여를 입력하세요");
		int salary = scanner.nextInt();
		Service.input(name, salary);
		
		System.out.println("=====급여내역=====");
		System.out.println("성명 : " + name);
		System.out.println("본봉 : " + salary +"원");
		System.out.println("세금 : "+ Service.taxValue() +"%");
		System.out.println("실수령액 : "+Service.realSalary()+"원");
		
		scanner.close();
	}
}
