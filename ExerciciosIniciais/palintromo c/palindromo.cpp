#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include<stdbool.h>



    bool isFim(char s[] ){
      bool resp=false;

      if( strlen(s) >= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M'){
           resp=true;
      } //teste de parada

       return resp;

   }  //fim do isFim

    bool isPalindromo(char palavras[1000],int tamanho){
      bool resp = true;
        int i=0,j=tamanho;
           do{
              if(palavras[i] != palavras[j]){
                 resp=false;

              }

              i++;
              j--;

           }while(i<=j);

      return resp;
   }//fim do isPalindromo


int main()
{

    char palavras[1000];
    bool parada,resp=false;
    int tamanho,cont=0;


    do{

             fgets(palavras,1000,stdin);
            parada=isFim(palavras);
            if(parada != true){
                    tamanho=strlen(palavras)-2;
                 resp=isPalindromo(palavras,tamanho);
                 if(resp == true){
                    printf("SIM\n");
                 }
                 else{
                    printf("NAO\n");
                 }
            }
            cont++;





    }while(parada==false);


    return 0;
}
 //fim do programa
