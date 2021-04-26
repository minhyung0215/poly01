#include <stdio.h>
int main() {
	char str[7];

	//strcpy(str, "Basic");
	str[0] = 'B';
	str[1] = 'a';
	str[2] = 's';
	str[3] = 'i';
	str[4] = 'c';
	str[5] = '\0';

	printf("%s", str);
}