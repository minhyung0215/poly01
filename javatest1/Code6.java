package javatest1;

public class Code6 {

	public static void main(String[] args) {
		String [] members = { "최진혁", "최유빈", "한이람" };
		for ( int i = 0; i< members.length; i++) {
			String member = members [i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
		System.out.println("");
		String [] members2 = {"901", "902", "903" };
		for (int i = 0; i< members2.length; i++) {
			String member2 = members2 [i];
			System.out.println(member2 + "번 고객님 어서오십시오.");
		}
	}
}

