package OOP09.nestedClass;
/*
 static �� �ּ������� ���
 �ν��Ͻ� ���� ���� �ּ�ȭ
 Ŭ������ �޼ҵ�ȭ 
 */
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
	//	m.getInnerClassInstance();
	//	m.getInnerClassLocal();
	//	m.getInnerClassStatic();
		m.getInnerClassAnonyServiceImpl();
	// alt + shift + m  �޼ҵ� ���� ����Ű
	// �����丵
	}
	public void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.print();
	}
	public void getInnerClassStatic() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();
		inn.printData();
	}
	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();
		inn.printData();
	}
}
