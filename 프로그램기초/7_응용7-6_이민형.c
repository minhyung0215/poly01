#include<stdio.h>
int main() {
	int menu;
	do {
		printf("\n손님 주문하시겠습니까 ? \n");
		printf("<1> 카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 ==> ");
		scanf("%d", &menu);

		while (1) {
			if (menu == 1) {
				printf("#카페라떼를 주문하셨습니다. \n");
				break;
			}
			else if (menu == 2) {
				printf("#카푸치노를 주문하셨습니다. \n");
				break;
			}
			else if (menu == 3) {
				printf("#아메리카노를 주문하셨습니다. \n");
				break;
			}
			else if (menu == 4) {
				printf("#주문하신 커피를 준비하겠습니다. \n");
				break;
			}
			else {
				printf("잘못 주문하셨습니다. \n");
			}
		}
	}
	while (menu != 4);
}