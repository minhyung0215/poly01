#include<stdio.h>
int main() {
	int hap = 0;
	int i;
	for (i = 0; i <= 100; i++) {
		hap += i;
		if (hap >= 1000) {
			break;
		}

	}
	printf("1~100�� �տ��� ���ʷ� 1000�� �Ѵ� ��ġ��? : %d\n", i);
}