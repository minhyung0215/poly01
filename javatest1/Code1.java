package javatest1;

public class Code1 {

	public static void main(String[] args) {
		System.out.println(1==2);
		System.out.println(1==1);
		System.out.println("one"=="tow");
		System.out.println("one"=="one");
		
		System.out.println();
		
		
		if(true) {
			System.out.println("result : true"); //���ǹ� true�̱� ������ result : true�� ��� �� ���̴�.
			
		}
		
		if(false) {
			System.out.println("result : true"); //���ǹ� false�̱� ������ ��°��� ����.
		}
		
		System.out.println();
		if(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4); //���ǹ� true�̱� ������ 1,2,3,4�� ��µǰ� �������´�.
		}
		
		System.out.println();
		System.out.println(5); // 5 ���
		
		if(false) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4); //���ǹ��� false�̱� ������ 1,2,3,4�� ��µ��� �ʴ´�.
		}
		
		System.out.println();
		System.out.println(5); // 5 ���
	}

}
