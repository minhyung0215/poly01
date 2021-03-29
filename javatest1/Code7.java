package javatest1;

public class Code7 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 5)
				break;
			System.out.println("Coding Everybody" + i);
		}
		
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println("Coding Everybody" + i);
			
		}
	}

}
