#include<stdio.h>
int main() {
	int menu;

	do {
		printf("\n �մ� �ֹ��Ͻðڽ��ϱ�? \n");
		printf("<1>ī��� <2>īǪġ�� <3>���̽��Ƹ޸�ī�� <4>�׸���ų����. ==>");
		scanf("%d", &menu);

		switch (menu) {
		case 1:
			printf("ī��� �ֹ��ϼ̽��ϴ�.");
		case 2:
			printf("īǪġ�� �ֹ��ϼ̽��ϴ�.");
		case 3:
			printf("���̽��Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
		case 4:
			printf("�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�.");
		default:
			printf("�߸� �ֹ��ϼ̽��ϴ�.");
		}
		while (menu != 4);
	}
}