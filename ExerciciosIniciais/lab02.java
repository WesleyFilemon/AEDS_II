class lab02 {

 
   public static boolean isFim(String s){
      return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }
 
 
   public static void fusao(String entrada){
      String[] separadas = new String [2];    
      separadas=entrada.split(" ");      
      char[] nova=new char[1000];
      int maior=0;
      int i,cont1=0,cont2=0,temp;
      int tam1=separadas[0].length();
      int tam2=separadas[1].length();      
      int tamanho=tam1+tam2;

      if(tam1>tam2){
         temp=0;
         }
      else{if(tam2>tam1){
         temp=1;
         }
         else
         temp=2;
         }
         
      for(i=0;i<tamanho;i++){
      
         if(temp==0){
         
            if(i%2==0 ||cont2==tam2 ){
               nova[i]=separadas[0].charAt(cont1);
               cont1++;
            }
            else{
               if(cont2<tam2){
                  nova[i]=separadas[1].charAt(cont2);
                  cont2++;
               }
            }
         
         }
         else{ if(temp==1){
            if(i%2!=0 ||cont2==tam1 ){
               nova[i]=separadas[1].charAt(cont1);
               cont1++;
            }
            else{
               if(cont2<tam1){
                  nova[i]=separadas[0].charAt(cont2);
                  cont2++;
               }
            }
         
         }
         else{
                if(i%2==0){
                    nova[i]=separadas[0].charAt(cont1);
                      cont1++;
                 }
                 else{
                 nova[i]=separadas[1].charAt(cont2);
                  cont2++;
                 }
         }
         }
       
      }
      for(i=0;i<tamanho;i++){
        MyIO.print(nova[i]);       
     }
     MyIO.println("");
       
      
   } 

 
   public static void main (String[] args){
      String[] entrada = new String[1000];
      int numEntrada = 0;
   
      //Leitura da entrada padrao
      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (isFim(entrada[numEntrada++]) == false);
      numEntrada--;   //Desconsiderar ultima linha contendo a palavra FIM
   
      //Para cada linha de entrada, gerando uma de saida contendo o numero de letras maiusculas da entrada
      for(int i=0; i<numEntrada; i++){
         fusao(entrada[i]);
      }
   
   }
}