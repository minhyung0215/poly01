package ex_234;

import java.util.Scanner;

public class Ex7_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		
		while (true) {
			System.out.print("첫번째 값 입력 : ");
			
			a = s.nextInt();
			
			System.out.print("두번째 값 입력 : ");
			
			b = s.nextInt();
			
			System.out.println("합계 : " + (a+b));
			
			if ((a+b)>10) {
				break;
			}
		}
	}

}
