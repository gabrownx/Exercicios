#include <stdio.h>
#include <stdlib.h>

int main() {

  int num[10], i;

	printf("Insira 10 numeros:\n");
	
  		for(i=0; i<10; ++i) {
  			scanf("%i", &num[i]);
  							}

	printf("\nNumeros pares:\n");
		
		for(i=0; i<10; ++i) {
			if (num[i]%2==0) {
				printf("%i ", num[i]);
				            }
		           	       }
  
  system("pause");
            }
