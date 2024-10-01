#include <iostream>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <stdlib.h>




    bool isFim(char s[]){
        int tamanho=strlen(s);
      bool resp=false;
      if( tamanho>= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M'){
        resp=true;
      }
      return resp;
   }

   char* aleatorio(char entrada[],char a,char b,int cont)
   {
       if(entrada[cont]==a){
        entrada[cont]=b;
       }

      if(cont<strlen(entrada)){
        aleatorio(entrada,a,b,cont+1);
      }
      return entrada;
   }



     int main (){
         int i=0,cont=0;
         char entrada[1000];
         char a,b;
         bool fim=false;
         srand(4);

         do{
          fgets(entrada,1000,stdin);
           fim=isFim(entrada);
           if(fim == false){
                a=((char)('a'+(rand()%26)));
                b=((char)('a'+(rand()%26)));
            printf("%s",aleatorio(entrada,a,b,cont));
           }
          i++;
         }while(fim==false);

       return 0;
     }

