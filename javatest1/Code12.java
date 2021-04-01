package javatest1;

public class Code12 {
	
	static int i = 5;

	public static void a() {
		int i = 10;
		
		b();
		
	}
	
	static void b() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		a();
	}

}
