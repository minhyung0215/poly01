#include <stdio.h>
int main() {

	char stack[5];
	int top = 0;
	stack[top] = 'A';
	printf("%c �ڵ����� �ͳ��� ��\n", stack[top]);
	top++;

	stack[top] = 'B';
	printf("%c �ڵ����� �ͳ��� ��\n", stack[top]);
	top++;

	stack[top] = 'C';
	printf("%c �ڵ����� �ͳ��� ��\n\n", stack[top]);
	top++;

	stack[top] = 'D';
	printf("%c �ڵ����� �ͳ��� ��\n\n", stack[top]);
	top++;

	stack[top] = 'E';
	printf("%c �ڵ����� �ͳ��� ��\n\n", stack[top]);
	top++;

	stack[top] = 'F';
	printf("%c �ڵ����� �ͳ��� ��\n\n", stack[top]);
	top++;

	top--;
	printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
	stack[top] = "";

	top--;
	printf("%c �ڵ����� �ͳ��� ��������\n", stack[top]);
	stack[top] = "";

}