#include <stdio.h>
int calc(int v1, int v2, int op) {
	int result;

	switch (op) {
	case 1: result = v1 + v2; break;
	case 2: result = v1 - v2; break;
	case 3: result = v1 * v2; break;
	case 4: result = v1 / v2; break;
	}
	return result;
}
int main() {
	int res;
	int oper, a, b;
	printf("계산 입력(1:+, 2:-, 3:*, 4:/) : ");
	scanf("%d", &oper);

	printf("계산할 두 숫자 입력 : ");
	scanf("%d %d", &a, &b);

	res = calc(a, b, oper);

	printf("결과값 : %d\n", res);
}