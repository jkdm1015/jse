package OOP01.game;

public class KaupVo {

	private double height = 0.0;
	private double weight = 0.0;
	private int idx = 0;
	private String msg = "";

	public void setMsg(String msg) {
		if (idx > 30) {
			this.msg = " 비만";
		} else if (idx > 24) {
			this.msg = " 과체중";
		} else if (idx > 20) {
			this.msg = " 정상";
		} else if (idx > 15) {
			this.msg = " 저체중";
		} else if (idx > 13) {
			this.msg = " 마름";
		} else if (idx > 10) {
			this.msg = " 영양실조";
		} else {
			this.msg = " 소모증";
		}
	}
	@Override
	public String toString() {
		return "카우프지수 [ 키 = " + height + "cm, 체중 = " + weight + "kg, 카우프지수 = "
				+ idx + getMsg() + "]";
	}
	public void setIdx(double weight, double height) {
		this.idx = (int) ((weight / (height * height)) * 10000);
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getMsg() {
		return msg;
	}
}
