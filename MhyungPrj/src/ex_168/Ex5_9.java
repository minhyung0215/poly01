package ex_168;

import java.util.Scanner;

public class Ex5_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.print("1~4 중에 선택하세요 : ");
		a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("1을 선택");
			break;
		
		case 2:
			System.out.println("2를 선택");
			break;
		
		case 3:
			System.out.println("3를 선택");
			break;
		
		case 4:
			System.out.println("4를 선택");
			break;
			
			
		default:
			System.out.println("이상한걸 선택했다.");
		}
	}

}
