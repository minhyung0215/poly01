package ex_267;

public class Ex8_4 {

	public static void main(String[] args) {
		int aa[] = {100, 200, 300 ,400};
		int bb[] = new int[] {100, 200, 300, 400};
		
		int cc[];
		cc = new int[] {100, 200};
		int[] dd = new int[1];
		dd[0] = 100;
		int i;
		
		for(i=0; i<4; i++) {
			System.out.print("aa[" + i + "]:" + aa[i] + " ");
		}
		System.out.println();
		
		for(i=0; i<3; i++) {
			System.out.print("bb[" + i + "]:" + bb[i] + " ");
		}
		System.out.println();
		
		for(i=0; i<2; i++) {
			System.out.print("cc[" + i + "]:" + cc[i] + " ");
		}
		System.out.println();
		
		for(i=0; i<1; i++) {
			System.out.print("dd[" + i + "]:" + dd[i] + " ");
		}
		System.out.println();
	}

}
