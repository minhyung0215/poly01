#include<stdio.h>
int main() {
	int a;
	int b;
	int result;
	char k;

	printf("ù�� ° ���� : ");
	scanf("%d", &a);
	printf("+, -, *, / : ");
	scanf(" %c", &k);
	printf("�ι� ° ���� : ");
	scanf("%d", &b);

	if (k == '+') {
		result = a + b;
		printf("%d + %d = %d", a, b, a + b);
	}
	if (k == '-') {
		result = a - b;
		printf("%d - %d = %d", a, b, a - b);
	}
	if (k == '*') {
		result = a * b;
		printf("%d * %d = %d", a, b, a * b);
	}
	if (k == '/') {
		if (b == 0) {
			printf("�ι� ° ���ڰ� 0�ΰ�� ����� �� �����ϴ�.");
		}
		result = a / b;
		printf("%d / %d = %d", a, b, a / b);
	}
}