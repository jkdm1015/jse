package OOP05.polymorphism;

public class NumberServiceImpl implements NumberMatchService{
	NumberVO vo = new NumberVO();
	boolean  bool = false;
	@Override
	public int makeComeVal() {
		return (int) ((Math.random()*2));
	}

	@Override
	public boolean match(int playVal, int comVal) {
		if(playVal == comVal){
			bool = true;
		}
		return bool;
	}

	@Override
	public String disPlay() {
		String str = "";
		if(bool==true){
			str = "������ϴ�.";
		}else{
			str = "Ʋ�Ƚ��ϴ�";
		}
				return str;
		}
}
