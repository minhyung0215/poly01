#include<stdio.h>
int main() {
	int a;
	int b;
	int result;
	char k;

	printf("첫번 째 숫자 : ");
	scanf("%d", &a);
	printf("+, -, *, / : ");
	scanf(" %c", &k);
	printf("두번 째 숫자 : ");
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
			printf("두번 째 숫자가 0인경우 계산할 수 없습니다.");
		}
		result = a / b;
		printf("%d / %d = %d", a, b, a / b);
	}
}