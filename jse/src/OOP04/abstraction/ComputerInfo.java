package OOP04.abstraction;

public class ComputerInfo extends ProductInfo {
	
	protected String cpuInfo;
	protected String ramInfo;
	protected String hddInfo;
	
	public void setComputerInfo(String produCompany,
			String productName, String productSerialID,
			String cpuInfo, String ramInfo,
			String hddInfo){
		super.setProductInfo(productName, productName, productSerialID);
		this.cpuInfo = cpuInfo;
		this.ramInfo = ramInfo;
		this.hddInfo = hddInfo;
		
	}
	@Override
	public void displayProductInfo() {
		System.out.println("����ȸ�� : "+this.productCompany);
		System.out.println("��ǰ�� : "+ this.ProductName);
		System.out.println("������ȣ : "+this.productSerialID);
		System.out.println("cpu ���� : "+this.cpuInfo);
		System.out.println("���θ޸� ���� : "+this.ramInfo);
		System.out.println("�ϵ��ũ ���� : "+this.hddInfo);
	}
	
	

}
