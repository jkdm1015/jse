package OOP09.nestedClass;
/*
 static 을 최소한으로 사용
 인스턴스 변수 선언 최소화
 클래스를 메소드화 
 */
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
	//	m.getInnerClassInstance();
	//	m.getInnerClassLocal();
	//	m.getInnerClassStatic();
		m.getInnerClassAnonyServiceImpl();
	// alt + shift + m  메소드 독립 단축키
	// 리팩토링
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
