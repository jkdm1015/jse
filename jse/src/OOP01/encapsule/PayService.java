package OOP01.encapsule;

public class PayService {
	/*
 	공식...
 	income = salay - tax;
 */
	PayVO vo = new PayVO();

	public void input(String name, int salary){
		vo.setName(name);
		vo.setSalary(salary);
	}
	public int taxValue(){
		return (int) (vo.TAX*100);
	}
	public int realSalary(){
		return vo.getSalary() - ((int)(vo.getSalary()*vo.TAX));
	}
	
	/*public void disPlay(){ 
	System.out.println("=====급여내역=====");
	System.out.println("성명 : " + vo.getName());
	System.out.println("본봉 : " + vo.getSalary()+"원");
	System.out.println("세금 : "+vo.getTax()*100 +"%");
	System.out.println("실수령액 : "+vo.getIncome()+"원");
	}*/
}
