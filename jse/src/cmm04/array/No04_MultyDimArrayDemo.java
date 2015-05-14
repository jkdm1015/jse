package cmm04.array;

public class No04_MultyDimArrayDemo {
	public static void main(String[] args) {
		String[][] names = {
				{"Mr.","Mrs.","Ms."},
				{"Smith","John"}
		};
		System.out.println(names[0][0] + names[1][0]); //Mr.Smith 출력
		System.out.println(names[0][2] + names[1][1] ); //Ms.John 출력
	}
}
