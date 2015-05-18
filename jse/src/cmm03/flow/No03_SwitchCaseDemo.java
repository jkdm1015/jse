package cmm03.flow;

import java.util.Scanner;


public class No03_SwitchCaseDemo {
	public static void main(String[] args) {
		System.out.println("평균 점수를 입력하세요");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int avg = scanner.nextInt();
		String result;
		if(avg >= 70){
			result = "합격";
		}else{
			result = "재시험";
		}
		
		char grade = 'F';
		/*if(avg>=90){grade = 'A';}
		else if(avg>=80){grade = 'B';}
		else if(avg>=70){grade = 'C';}
		else if(avg>=60){grade = 'D';}
		else{grade = 'F';}*/
		//switch문으로 바꾸시오
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
			System.out.println("귀하는 " + result + " 이며, 학접은 "+grade+" 입니다.");
			break;
		}else{
			System.out.println("값을 100 이하로 입력하세요");
			System.out.println("평균 점수를 입력하세요");
			avg = scanner.nextInt();
		}
		
		}
	}
}
