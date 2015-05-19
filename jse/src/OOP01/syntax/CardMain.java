package OOP01.syntax;

public class CardMain {
	public static void main(String[] args) {
		CardVO player = new CardVO("하트",3);
		CardVO computer = new CardVO("스페이스",5);
		System.out.println("카드 높이는 : "+CardVO.height);
		System.out.println("카드 너비는 : "+CardVO.width);
		
		// 인스턴스 생성 하셔서 아래 결과처럼 출력되게 하시오
		//System.out.println("플레이어는 하트 3이고 컴퓨터는 스페이스 5입니다.");
		//System.out.println("컴퓨터가 스페이스 5로 이겼습니다.");
		
		System.out.println("플레이어는 "+player.getKind()+player.getNumber()+"이고, 컴퓨터는 "
		+computer.getKind()+computer.getNumber()+"입니다.");
		System.out.println("컴퓨터가 "+computer.getKind()+computer.getNumber()+"로 이겼습니다.");
	}
}
