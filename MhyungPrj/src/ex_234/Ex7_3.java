package ex_234;

import java.util.Scanner;

public class Ex7_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		
		while (true) {
			System.out.print("ù��° �� �Է� : ");
			
			a = s.nextInt();
			
			System.out.print("�ι�° �� �Է� : ");
			
			b = s.nextInt();
			
			System.out.println("�հ� : " + (a+b));
			
			if ((a+b)>10) {
				break;
			}
		}
	}

}
