package ex_test1;

public class Extest1_5 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1; i<11; i++) {
			if (i % 4 != 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
