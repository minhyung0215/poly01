#include <stdio.h>
int main() {

	char stack[5];
	int top = 0;
	stack[top] = 'A';
	printf("%c 자동차가 터널을 들어감\n", stack[top]);
	top++;

	stack[top] = 'B';
	printf("%c 자동차가 터널을 들어감\n", stack[top]);
	top++;

	stack[top] = 'C';
	printf("%c 자동차가 터널을 들어감\n\n", stack[top]);
	top++;

	stack[top] = 'D';
	printf("%c 자동차가 터널을 들어감\n\n", stack[top]);
	top++;

	stack[top] = 'E';
	printf("%c 자동차가 터널을 들어감\n\n", stack[top]);
	top++;

	stack[top] = 'F';
	printf("%c 자동차가 터널을 들어감\n\n", stack[top]);
	top++;

	top--;
	printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
	stack[top] = "";

}