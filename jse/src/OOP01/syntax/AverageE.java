package OOP01.syntax;

public class AverageE {
	

	public static void main(String[] args) {
		AverageEVO vo = new AverageEVO("ÇæÅ©", 90, 87);
		System.out.println("==="+vo.getName()+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î : "+vo.getKor()+"Á¡");
		System.out.println("¿µ¾î : "+vo.getEng()+"Á¡");
		System.out.println("ÃÑÁ¡ : "+vo.add(vo.getEng(), vo.getKor())+"Á¡");
		System.out.println("Æò±Õ : "+vo.avg(vo.getEng(), vo.getKor())+"Á¡");
	}
	
}
