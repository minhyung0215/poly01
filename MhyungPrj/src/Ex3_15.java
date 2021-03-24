package ex_119;

public class Ex3_15 {

	public static void main(String[] args) {
		String str1 = "IT CookBook 입니다.";
		String str2 = "10";
		String str3 = "20";
		
		str1 = "Java 입니다.";
		
		System.out.println(""+ str1);
		System.out.println(""+ str2 + str3);
		
		System.out.println("더하기 결과 : " + (str2 + str3)); // 문자이기 때문에 더한 결과는 1020이다.
		
		int num1 = Integer.parseInt(str2); // num1이라는 변수를 만들고 그 안에 str1을 정수값으로 바꿔준다.
		int num2 = Integer.parseInt(str3); // num2이라는 변수를 만들고 그 안에 str2을 정수값으로 바꿔준다.
		System.out.println("더하기 결과 : " + (num1 + num2)); // 정수형태가 되었기 때문에 num1 + num2의 결과는 30이다.
	}

}
