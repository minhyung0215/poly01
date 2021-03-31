package javatest1;

import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner (System.in);
		
		while(sc.hasNextInt()) {
			System.out.print("1000을 곱한 숫자 : ");
			System.out.println(sc.nextInt () *1000);
		}
		
		sc.close();
	}

}
