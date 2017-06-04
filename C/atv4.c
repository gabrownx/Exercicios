#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
  setlocale(LC_ALL, "Portuguese");
  
	int num[10], i, par=0, imp=0, positivo=0, negativo=0;

	printf("Insira 10 números:\n");
	
  		for(i=0; i<10; ++i) {
  			
  			scanf("%i", &num[i]);
  			
  				if(num[i]>0){
  					positivo++;
				 			}
				else{
					negativo++;
					}
			  
			  	if(num[i]%2==0){
  					par++;	   }
			
				else{
					imp++;}
						   }
	
	printf("\nNúmeros pares: %i\n", par);
	printf("Números ímpares: %i\n", imp);
	printf("Números positivos: %i\n", positivo);
	printf("Números negativos: %i\n", negativo);
	
			system("pause");
			}
