#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
main (){
	
	setlocale(LC_ALL, "Portuguese");
	
int numrs[10], max, min;

printf("Digite o n�mero m�nimo:\n");
	scanf("%i", &min);
printf("Digite o n�mero m�ximo:\n");
	scanf("%i", &max);
	
	if(max<min){
		printf("\nERRO! \nO n�mero m�ximo n�o pode ser menor que o m�nimo.\n\n");
				}
	else{
printf("Digite 10 n�meros entre %i e %i:\n", min, max);
	scanf("%i")
		}

system("pause");}
