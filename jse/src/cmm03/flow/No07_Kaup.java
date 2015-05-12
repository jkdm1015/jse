package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {
		double height;
		double weight;
		int idx;
		Scanner scanner = new Scanner(System.in);
		No07_Kaup() {
			this(0,0);
			this.idx = (int)((weight/(height*height))*10000);

		}
		No07_Kaup(double i, double j) {
			setHeight(i);
			setWeight(j);
		}
		public void setHeight(double height) {
			System.out.println("키를 입력하세요 : ");
			this.height = scanner.nextDouble();

		}
		public void setWeight(double weight) {
			System.out.println("체중을 입력하세요 : ");
			this.weight = scanner.nextDouble();
		}
		String getMsg(){
			String msg = "";
			if(idx>30){	msg = "비만";}
			else if(idx>24){msg = "과체중";}
			else if(idx>20){msg = "정상";}
			else if(idx>15){msg = "저체중";}
			else if(idx>13){msg = "마름";}
			else if(idx>10){msg = "영양실조";}
			else{msg = "소모증";}
			return msg;
		}
		@Override
		public String toString() {
			return "카우프지수 [ 키 =" + height + "cm, 체중 =" + weight
					+ "kg, 카우프지수=" + idx + getMsg() + "]";
		}
		public static void main(String[] args) {
			
			No07_Kaup kaup = new No07_Kaup();
			System.out.println(kaup.toString());
		}
}
