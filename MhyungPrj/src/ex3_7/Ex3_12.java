package ex3_7;

public class Ex3_12 {

	public static void main(String[] args) {
		char a;
		char b;
		char c;
		char d;
		char e;

		a = 'A';
		System.out.printf("%c \t", a);
		System.out.printf("%d \n", (int) a);

		b = 'a';
		c = (char) (b + 1);
		System.out.printf("%c \t", b);
		System.out.printf("%c \n", c);

		d = 90;
		System.out.printf("%c \n", d);

		d = '��';
		e = (char) (d + 1);
		System.out.printf("%d \t", (int) d);
		System.out.printf("%c \n", e);
		
		System.out.println("");

		a = 'A';
		System.out.println("a : " + a + " | a�� ���ڰ� : " + (int) +a);

		b = 'a';
		c = (char) (b + 1);
		System.out.println("b : " + b + " | c : " + c);

		d = 90;
		System.out.println("d : " + (char) d);
		
		d = '��';
		e = (char) (d + 1);
		System.out.println("d : " + (int) d + " | e : " + e);
	}

}
