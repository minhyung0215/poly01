#include<stdio.h>
int main() {
	int hap = 0;
	int i;
	for (i = 1; i <= 100; i++) {
		hap += i;
	}
	printf("1~100까지의 합 : %d", hap);
	return 0;

	printf("END");
}