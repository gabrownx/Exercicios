#include <stdio.h>
#include <stdlib.h>

int main() {

  int num[5], i;

	printf("Insira cinco numeros:\n");
	
  		for(i=0; i<5; ++i) {
  			scanf("%i", &num[i]);
  					 }

	printf("\nNumeros negativos:\n");
		
		for(i=0; i<5; ++i) {
			if (num[i] < 0) {
				printf("%i ", num[i]);
				            }
		           	       }
  
  system("pause");
            }
