package ex_test1;

public class Extest1_6 {

	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
				if (i + j == 10) {
					break;
				}
			}
			System.out.println();
		}
	}
}