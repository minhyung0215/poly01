#include<stdio.h>
int main() {
	int hap = 0;
	int i;
	for (i = 1; i <= 100; i++) {
		if (i % 3 == 0) {
			continue;
		}
		hap += i;
	}
}