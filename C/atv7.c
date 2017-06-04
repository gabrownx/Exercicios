#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
main (){
	
	setlocale(LC_ALL, "Portuguese");
	
int numrs[10], max, min;

printf("Digite o número mínimo:\n");
	scanf("%i", &min);
printf("Digite o número máximo:\n");
	scanf("%i", &max);
	
	if(max<min){
		printf("\nERRO! \nO número máximo não pode ser menor que o mínimo.\n\n");
				}
	else{
printf("Digite 10 números entre %i e %i:\n", min, max);
	scanf("%i")
		}

system("pause");}
