package ex_267;

public class Ex8_7 {

	public static void main(String[] args) {
		int [][] aa = new int[3][4];
		
		aa[0][0] = 1;
		aa[0][1] = 2;
		aa[0][2] = 3;
		aa[0][3] = 4;
		
		aa[1][0] = 5;
		aa[1][1] = 6;
		aa[1][2] = 7;
		aa[1][3] = 8;
		
		aa[2][0] = 9;
		aa[2][1] = 10;
		aa[2][2] = 11;
		aa[2][3] = 12;
		
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력");
		
		System.out.println("aa배열의 크기 : " + aa.length);
		System.out.println("------------------------------");
		
		for (int i=0; i < aa.length; i++) {
			System.out.println("aa[" + i + "][0] : " + aa[i][0]);
			System.out.println("aa[" + i + "][1] : " + aa[i][1]);
			System.out.println("aa[" + i + "][2] : " + aa[i][2]);
			System.out.println("aa[" + i + "][3] : " + aa[i][3]);
			System.out.println("------------------------------");
		}
		
	}

}
