package OOP04.abstraction;

public class TvInfo extends ProductInfo{

	protected String inchInfo;
	protected String screenRatioInfo;
	
	//�Ʒ� ������ �ϼ��Ͻÿ�.
	public void setTvInfo(String productCompany, String ProductName, String ProductSerialID,
			String inchInfo, String screenRatioInfo){
		super.setProductInfo(productCompany, ProductName, ProductSerialID);
		this.inchInfo = inchInfo;
		this.screenRatioInfo = screenRatioInfo;
	}
	
	
	@Override
	public void displayProductInfo() {
		System.out.println("����ȸ�� : "+this.productCompany);
		System.out.println("��ǰ�� : "+ this.ProductName);
		System.out.println("������ȣ : "+this.productSerialID);
		System.out.println("��ġ ���� : "+this.inchInfo);
		System.out.println("ȭ�� ���� : "+this.screenRatioInfo);
	}
	
}
