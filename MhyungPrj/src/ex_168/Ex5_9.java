package ex_168;

import java.util.Scanner;

public class Ex5_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.print("1~4 �߿� �����ϼ��� : ");
		a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("1�� ����");
			break;
		
		case 2:
			System.out.println("2�� ����");
			break;
		
		case 3:
			System.out.println("3�� ����");
			break;
		
		case 4:
			System.out.println("4�� ����");
			break;
			
			
		default:
			System.out.println("�̻��Ѱ� �����ߴ�.");
		}
	}

}
