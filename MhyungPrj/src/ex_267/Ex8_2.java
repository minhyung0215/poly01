package ex_267;

import java.util.Scanner;

public class Ex8_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap;
		int i=0;
		
		System.out.print("1번째 숫자 입력 : ");
		aa[i++] = s.nextInt();
		System.out.print("2번째 숫자 입력 : ");
		aa[i++] = s.nextInt();
		System.out.print("3번째 숫자 입력 : ");
		aa[i++] = s.nextInt();
		System.out.print("4번째 숫자 입력 : ");
		aa[i++] = s.nextInt();
		
		hap = aa[0] + aa[1] + aa[2] + aa[3];
		
		System.out.println(" 합계 : " + hap);
		
		for (int j = 0; j < aa.length; j++) {
			System.out.println("aa[" + j + "] : " + aa[j]);
		}
	}

}
