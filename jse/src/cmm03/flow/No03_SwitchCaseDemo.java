package cmm03.flow;

import java.util.Scanner;


public class No03_SwitchCaseDemo {
	public static void main(String[] args) {
		System.out.println("��� ������ �Է��ϼ���");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int avg = scanner.nextInt();
		String result;
		if(avg >= 70){
			result = "�հ�";
		}else{
			result = "�����";
		}
		
		char grade = 'F';
		/*if(avg>=90){grade = 'A';}
		else if(avg>=80){grade = 'B';}
		else if(avg>=70){grade = 'C';}
		else if(avg>=60){grade = 'D';}
		else{grade = 'F';}*/
		//switch������ �ٲٽÿ�
		while(true){
			
		if(avg <= 100){
			switch(avg/10){
			case 10:	case 9:
				grade = 'A';		break;
			case 8:		grade = 'B';	break;
			case 7:		grade = 'C';	break;
			case 6:		grade = 'D';	break;
			default:	break;
			}
			System.out.println("���ϴ� " + result + " �̸�, ������ "+grade+" �Դϴ�.");
			break;
		}else{
			System.out.println("���� 100 ���Ϸ� �Է��ϼ���");
			System.out.println("��� ������ �Է��ϼ���");
			avg = scanner.nextInt();
		}
		
		}
	}
}
