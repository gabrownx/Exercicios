#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
  setlocale(LC_ALL, "Portuguese");
  
	int num[10], i, par=0, imp=0, positivo=0, negativo=0;

	printf("Insira 10 n�meros:\n");
	
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
	
	printf("\nN�meros pares: %i\n", par);
	printf("N�meros �mpares: %i\n", imp);
	printf("N�meros positivos: %i\n", positivo);
	printf("N�meros negativos: %i\n", negativo);
	
			system("pause");
			}
