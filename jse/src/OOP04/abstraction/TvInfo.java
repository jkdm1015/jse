package OOP04.abstraction;

public class TvInfo extends ProductInfo{

	protected String inchInfo;
	protected String screenRatioInfo;
	
	//아래 정보는 완성하시오.
	public void setTvInfo(String productCompany, String ProductName, String ProductSerialID,
			String inchInfo, String screenRatioInfo){
		super.setProductInfo(productCompany, ProductName, ProductSerialID);
		this.inchInfo = inchInfo;
		this.screenRatioInfo = screenRatioInfo;
	}
	
	
	@Override
	public void displayProductInfo() {
		System.out.println("제조회사 : "+this.productCompany);
		System.out.println("제품명 : "+ this.ProductName);
		System.out.println("고유번호 : "+this.productSerialID);
		System.out.println("인치 정보 : "+this.inchInfo);
		System.out.println("화면 비율 : "+this.screenRatioInfo);
	}
	
}
