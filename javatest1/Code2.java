package javatest1;

public class Code2 {

	public static void main(String[] args) {
		
		System.out.println(1!=2); //true
		System.out.println(1!=1); //false
		System.out.println("one"!="two"); //true
		System.out.println("one"!="one"); //false
		System.out.println();
		
		System.out.println(10>20); //false
		System.out.println(10>2); //true
		System.out.println(10>10); //false
		System.out.println();
		
		System.out.println(10 >= 20); //false
		System.out.println(10 >= 2); //true
		System.out.println(10 >= 10); // true
		System.out.println();
		
		if (true && true) {
			System.out.println(1); //�� �� ���̹Ƿ� ���
		}
		
		if (true && false) {
			System.out.println(2); // ���߿� �ϳ��� ���̹Ƿ� ��µ��� ����
		}
		
		if (false && true) {
			System.out.println(3); // ���߿� �ϳ��� ���̹Ƿ� ��µ��� ����
		}
		
		if (false && false) {
			System.out.println(4); // �Ѵ� �����̹Ƿ� ��µ��� ����
		}
		
		System.out.println();
		
		
	}

}
