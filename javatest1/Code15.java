package javatest1;

public class Code15 {

	public static void main(String[] args) {
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b);
		System.out.println(a.contentEquals(b));
	}

}
