package OOP01.encapsule;

public class PayVO {
	private String name;
	private int salary;
	static final float TAX = 0.1f;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
