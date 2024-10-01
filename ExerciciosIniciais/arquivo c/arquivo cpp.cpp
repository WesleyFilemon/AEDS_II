#include <stdio.h>
#include <stdlib.h>

void inverso(int n,int cont,FILE *arq2){

    double numeros;
        fscanf(arq2,"%lf",&numeros);
        cont++;
        if(cont != n)
            inverso(n,cont,arq2);
            printf("%lf\n",numeros);


}


int main()
{
    FILE *arq;
    arq = fopen("arquivo.txt", "w");
    int n;
    scanf("%d",&n);
    double numeros;
     for(int i=0;i<n;i++){
        scanf("%lf",&numeros);
        if((n-i)!=1)
       fprintf(arq,"%lf\n",numeros);
       else
        fprintf(arq,"%lf",numeros);
     }
   fclose(arq);
    FILE *arq2;
    arq2 = fopen("arquivo.txt", "r");
       int cont=0;
   inverso(n,cont,arq2);

    return 0;
}
