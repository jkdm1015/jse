package OOP09.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService{
		public void greet(String name);
	}
	public void sayHello(){
		/*
		 내부클래스 인터페이스 구현방법 1
		 */
		class EnglishTreetingServiceImpl implements GreetingService{

			@Override
			public void greet(String name) {
				System.out.println("Hello "+name);
			}
		}
		GreetingService eng = new EnglishTreetingServiceImpl();
		/*
		 내부클래스 인터페이스 구현방법 2
		 */
		GreetingService kor = new GreetingService() {
			
			@Override
			public void greet(String name) {
				System.out.println("안녕하세요 "+name);
			}
		};
		eng.greet("Tom");
		kor.greet("톰");
	}
	public static void main(String[] args) {
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.sayHello();
	}
}
