package OOP03.inheritance;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		//일반적인 객체생성
		//ParentC p = new ParentC();
		//ChildC c = new ChildC();
		
		//부모타임 = new 자식타입
		ParentC p2 = new ChildC();
		//오버라이딩시 자식클래스 메소드 우선 출력
		//overriding == 최우선시되는...
		p2.over(1);
		//오버라이딩 하지 않으면 부모클래스 우선 호출
		p2.noOver(1);
		//부모클래스 타입을 자식클래스로 강제 형변환
		ChildC c2 = (ChildC)p2;
		c2.onlyChild();
		c2.noOver("AAA");
	}
}
class ParentC{
	void over(int i){
		System.out.println("ParentC - over() : "+(i*10));
	}
	void noOver(int i){
		System.out.println("ParentC - noOver() : "+ i );
	}
}
class ChildC extends ParentC{
	/*public ChildC() {
		super.noOver(2);
	}*/
	void over(int i){
		System.out.println("ChildC - over() : "+(i*10000));
	}
	void noOver(String s){
		System.out.println("ChildC - noOver() : "+s);
	}
	void onlyChild(){
		System.out.println("onlyB()");
	}
}