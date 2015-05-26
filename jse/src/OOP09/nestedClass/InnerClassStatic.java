package OOP09.nestedClass;

public class InnerClassStatic {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public static class Inner{
		static int d = 1000;
		public void printData(){
		//	System.out.println("멤버 변수 a : "+a);
		//	System.out.println("프라이빗 변수 b : "+b);
			/*
			  a 와 b 값이 에러가 나는 이유는...
			  static 는 가장 먼저 로딩되기 때문에 그뒤에 불러오는 변수들은 불러올 수 없다.
			  static 내부 클래스는 사실 더 이상의 내부 클래스가 아니다.
			  또한 외부클래스를 거치지 않고도 접근할 수 있다.
			  따라서 top level class 라고 하여 최상위 클래스라 한다.
			  어쩔 수 없이 내부클래스를 static 으로 선언해야 하는 경우가 있다.
			  그건 바로 내부 클래스의 멤버들 중 하나라도 
			  static 멤버가 있을 경우이다.
			 */
			System.out.println("스태틱 변수 c : "+c);
			System.out.println("스태틱 변수 d : "+d);
		}
	}
}
