package ex_168;

public class Ex5_4 {

	public static void main(String[] args) {
		int a = 200;
		
		if (a<100) {
			System.out.println("100보다 작군요..");
			System.out.println("참이면 이 문장도 보이겠죠 ?");
		}
		else {
			System.out.println("100보다 크군요..");
			System.out.println("거짓이면 이 문장도 보이겠죠 ?");		
		}
		System.out.println("난 조건문에 상관없이 무조건 보인다.");
	}
}