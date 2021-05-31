#include <stdio.h>
int a = 100;
void func1() {
	int a = 200;
	printf("func1에서 a의 값 : %d\n", a);
}

int main() {
	func1();
	printf("main에서 a의 값 : %d\n", a);
}