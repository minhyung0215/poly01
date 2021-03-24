package ex_132;

public class Ex4_3 {

	public static void main(String[] args) {
		int a = 10;
		
		System.out.println("a ==> " + a);
		System.out.println("a++ ==> " + a++);
		
		System.out.println("a ==> " + a);
		System.out.println("++a ==> " + ++a);
		
		System.out.println("a ==> " + a);
		System.out.println("--a ==> " + --a);
		
		System.out.println("a ==> " + a);
		System.out.println("a-- ==> " + a--);
		
		a += 5;
		System.out.println("a += 5 ==> " + a);
		
		a -= 5;
		System.out.println("a -= 5 ==> " + a);
		
		a *= 5;
		System.out.println("a *= 5 ==> " + a);
		
		a /= 5;
		System.out.println("a /= 5 ==> " + a);
		
		a %= 5;
		System.out.println("a %= 5 ==> " + a);
	}

}
