#include<stdio.h>
int main() {
	int menu;
	do {
		printf("\n�մ� �ֹ��Ͻðڽ��ϱ� ? \n");
		printf("<1> ī��� <2>īǪġ�� <3>�Ƹ޸�ī�� <4>�׸���ų���� ==> ");
		scanf("%d", &menu);

		while (1) {
			if (menu == 1) {
				printf("#ī��󶼸� �ֹ��ϼ̽��ϴ�. \n");
				break;
			}
			else if (menu == 2) {
				printf("#īǪġ�븦 �ֹ��ϼ̽��ϴ�. \n");
				break;
			}
			else if (menu == 3) {
				printf("#�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�. \n");
				break;
			}
			else if (menu == 4) {
				printf("#�ֹ��Ͻ� Ŀ�Ǹ� �غ��ϰڽ��ϴ�. \n");
				break;
			}
			else {
				printf("�߸� �ֹ��ϼ̽��ϴ�. \n");
			}
		}
	}
	while (menu != 4);
}