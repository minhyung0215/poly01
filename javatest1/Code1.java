package javatest1;

public class Code1 {

	public static void main(String[] args) {
		System.out.println(1==2);
		System.out.println(1==1);
		System.out.println("one"=="tow");
		System.out.println("one"=="one");
		
		System.out.println();
		
		
		if(true) {
			System.out.println("result : true"); //조건문 true이기 때문에 result : true가 출력 될 것이다.
			
		}
		
		if(false) {
			System.out.println("result : true"); //조건문 false이기 때문에 출력값이 없다.
		}
		
		System.out.println();
		if(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4); //조건문 true이기 때문에 1,2,3,4가 출력되고 빠져나온다.
		}
		
		System.out.println();
		System.out.println(5); // 5 출력
		
		if(false) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4); //조건문이 false이기 때문에 1,2,3,4는 출력되지 않는다.
		}
		
		System.out.println();
		System.out.println(5); // 5 출력
	}

}
