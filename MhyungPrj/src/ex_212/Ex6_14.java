package ex_212;

public class Ex6_14 {

	public static void main(String[] args) {
		int i;
		int k;
		
		for(i=1; i<=9; i++) {
			for(k=2; k<=9; k++) {
				System.out.print(k + " X " + i + " = " + (k*i) + " ");
			}
			System.out.println(" ");
		}
	}

}