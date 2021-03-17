package ex3_7;

public class Ex3_9 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;

		a = 100 + 100;
		b = a + 100;
		c = a + b - 100;
		d = a + b + c;

		System.out.println("a 의 값 ==> " + a);
		System.out.println("b 의 값 ==> " + b);
		System.out.println("c 의 값 ==> " + c);
		System.out.println("d 의 값 ==> " + d);

		a = b = c = d = 100;
		
		System.out.println("a 의 값 ==> " + a);
		System.out.println("b 의 값 ==> " + b);
		System.out.println("c 의 값 ==> " + c);
		System.out.println("d 의 값 ==> " + d);
		
		a = 100;
		a = a + 200;
		System.out.println("a 의 값 ==> " + a);

	}

}