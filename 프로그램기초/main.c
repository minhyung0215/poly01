#include<stdio.h>
int main() {

	char a[100];
	char b, c;
	int i;

	printf("���� ���ڸ� �Է� : ");
	getc(a);

	printf("���� ���ڿ� ���ο� ���� : ");
	scanf("%c %c", &b, &c);
	
	for (i = 0; i < strlen(a); i++) {
		if (a[i] == b)
			a[i] = c;
	}
	printf("���");

}