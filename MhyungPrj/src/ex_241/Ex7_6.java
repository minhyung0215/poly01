package ex_241;

import java.util.Scanner;

public class Ex7_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("손님 주문하시겠습니까 ?");
			System.out.println("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 : ");
			
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("#카페라떼 주문하셨습니다."); break;
			
			case 2:
				System.out.println("#카푸치노 주문하셨습니다."); break;
				
			case 3:
				System.out.println("#아메리카노 주문하셨습니다."); break;
				
			case 4:
				System.out.println("#주문하신 커피 준비하겠습니다."); break;
				
			default:
				System.out.println("잘못 주문하셨습니다.");
			}
		}while(menu != 4);
	}
}
