#include <stdio.h>
void func1(int a) {
	a = a + 1;
	printf("전달받은 a : %d\n", a);
}

void main() {
	int a = 10;

	func1(a);
	printf("func1() 실행후 a : %d\n", a);
}