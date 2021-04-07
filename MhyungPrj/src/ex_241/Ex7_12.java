package ex_241;

public class Ex7_12 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		
		myLabel: for(;;) {
			for (i=1; i<=100; i++) {
				hap +=i;
				if (hap>2000) {
					System.out.println(hap);
					hap=0;
					break myLabel;
				}
			}
			System.out.println("아직도 반복중...");
		}
	}

}
