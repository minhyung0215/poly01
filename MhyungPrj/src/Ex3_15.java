package ex_119;

public class Ex3_15 {

	public static void main(String[] args) {
		String str1 = "IT CookBook �Դϴ�.";
		String str2 = "10";
		String str3 = "20";
		
		str1 = "Java �Դϴ�.";
		
		System.out.println(""+ str1);
		System.out.println(""+ str2 + str3);
		
		System.out.println("���ϱ� ��� : " + (str2 + str3)); // �����̱� ������ ���� ����� 1020�̴�.
		
		int num1 = Integer.parseInt(str2); // num1�̶�� ������ ����� �� �ȿ� str1�� ���������� �ٲ��ش�.
		int num2 = Integer.parseInt(str3); // num2�̶�� ������ ����� �� �ȿ� str2�� ���������� �ٲ��ش�.
		System.out.println("���ϱ� ��� : " + (num1 + num2)); // �������°� �Ǿ��� ������ num1 + num2�� ����� 30�̴�.
	}

}
