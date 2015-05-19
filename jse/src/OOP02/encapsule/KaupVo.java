package OOP02.encapsule;

public class KaupVo {

	private double height = 0.0;
	private double weight = 0.0;
	private int idx = 0;
	private String msg = "";

	public void setMsg(String msg) {
		if (idx > 30) {
			this.msg = " ��";
		} else if (idx > 24) {
			this.msg = " ��ü��";
		} else if (idx > 20) {
			this.msg = " ����";
		} else if (idx > 15) {
			this.msg = " ��ü��";
		} else if (idx > 13) {
			this.msg = " ����";
		} else if (idx > 10) {
			this.msg = " �������";
		} else {
			this.msg = " �Ҹ���";
		}
	}
	@Override
	public String toString() {
		return "ī�������� [ Ű = " + height + "cm, ü�� = " + weight + "kg, ī�������� = "
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
