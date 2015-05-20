package OOP03.inheritance;

public class ToyVO {
	public ToyVO(String name2, int price2, ToySpec spec2) {
	}
	private String name ;
	private int price;
	private ToySpec spec;
	public String getName() {
		
		return "";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ToySpec getSpec() {
		return spec;
	}
	public void setSpec(ToySpec spec) {
		this.spec = spec;
	}
	public void setName(String name) {
		this.name = name;
	}
}
