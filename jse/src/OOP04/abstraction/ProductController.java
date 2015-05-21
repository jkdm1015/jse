package OOP04.abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo();
		ci.setComputerInfo("삼성", "센스", "a-1234-4567", "dual-core"
				, "8G", "500GM");
		ci.displayProductInfo();
		System.out.println();
		
		TvInfo ti = new TvInfo();
		// 메소드 호출
		// TV 정보는
		// 회사 : LG
		// 제품명 : X캔버스
		// 제품 ID : x-1234
		// 화면 사이즈 : 42인치
		// 화면 비율 : 16:9
		ti.setTvInfo("LG", "X캔버스", "x-1234", "42인치", "16:9");
		ti.displayProductInfo();
	}
}
