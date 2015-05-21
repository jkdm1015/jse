package OOP04.abstraction;

public abstract class ProductInfo {
	protected String productCompany;
	protected String ProductName;
	protected String productSerialID;
	
	public void setProductInfo(String productCompany,String ProductName,String productSerialID){
		this.productCompany = productCompany;
		this.ProductName = ProductName;
		this.productSerialID = productSerialID;
	}
	public abstract void displayProductInfo();
}
