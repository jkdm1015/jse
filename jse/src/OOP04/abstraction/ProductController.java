package OOP04.abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo();
		ci.setComputerInfo("�Ｚ", "����", "a-1234-4567", "dual-core"
				, "8G", "500GM");
		ci.displayProductInfo();
		System.out.println();
		
		TvInfo ti = new TvInfo();
		// �޼ҵ� ȣ��
		// TV ������
		// ȸ�� : LG
		// ��ǰ�� : Xĵ����
		// ��ǰ ID : x-1234
		// ȭ�� ������ : 42��ġ
		// ȭ�� ���� : 16:9
		ti.setTvInfo("LG", "Xĵ����", "x-1234", "42��ġ", "16:9");
		ti.displayProductInfo();
	}
}
