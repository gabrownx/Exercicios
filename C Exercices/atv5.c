#include <stdio.h>
#include <stdlib.h>

int main()

{

int a[5], b[8], i, j, p=0;

printf("Digite 5 numeros:\n");
for (i=0; i<5; i++){
	scanf("%i",&a);}

printf("\nDigite 8 numeros:\n");

for (j=0; j<8; j++){
	scanf("%i",&b);}

for (j=0; j<8; j++){
	
	if (a==b[j]){
		printf("%i",b[j]);
		 		}
				   }
system("PAUSE");
}
