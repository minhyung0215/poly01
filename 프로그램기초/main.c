#include<stdio.h>
int main() {

	char a[100];
	char b, c;
	int i;

	printf("여러 글자를 입력 : ");
	getc(a);

	printf("기존 문자와 새로운 문자 : ");
	scanf("%c %c", &b, &c);
	
	for (i = 0; i < strlen(a); i++) {
		if (a[i] == b)
			a[i] = c;
	}
	printf("출력");

}