#include <stdio.h>
int main() {

	int aa[3] = { 10, 20 ,30 };

	printf("aa[0]�� ���� %d, �ּҴ� %d, %d \n", aa[0], &aa[0], aa+0);
	printf("aa[1]�� ���� %d, �ּҴ� %d, %d \n", aa[1], &aa[1], aa+1);
	printf("aa[2]�� ���� %d, �ּҴ� %d, %d \n", aa[2], &aa[2], aa+2);
	printf("�迭 �̸� aa�� ���� %d, �ּҴ� %d \n", aa, &aa);
} 