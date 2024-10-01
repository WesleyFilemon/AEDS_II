class IS {

 
   public static boolean isFim(String s){
      return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }
   
     //X1
   public static boolean vogais(String palavras){
      boolean resp=true;
      int cont=0;
      for(int i=0;i<palavras.length();i++){
         
         if(palavras.charAt(cont)!='a' && palavras.charAt(cont)!='e' && palavras.charAt(cont)!='i' && palavras.charAt(cont)!='o' && palavras.charAt(cont)!='u' &&
         palavras.charAt(cont)!='A' && palavras.charAt(cont)!='E' && palavras.charAt(cont)!='I' && palavras.charAt(cont)!='O' && palavras.charAt(cont)!='U' ||
         palavras.charAt(cont)=='.' || palavras.charAt(cont)==',' ){
            resp=false;
         }
         cont++;
      }
      return resp;
   }
   
       //X2
   
   
   public static boolean consoantes(String palavras){
      boolean resp=false;
      int cont=0;
      for(int i=0;i<palavras.length();i++){
       
         if(palavras.charAt(cont)!='a' && palavras.charAt(cont)!='e' && palavras.charAt(cont)!='i' && palavras.charAt(cont)!='o' && palavras.charAt(cont)!='u' &&
         palavras.charAt(cont)!='A' && palavras.charAt(cont)!='E' && palavras.charAt(cont)!='I' && palavras.charAt(cont)!='O' && palavras.charAt(cont)!='U' ){
            resp=true;
            if(palavras.charAt(cont)=='.' || palavras.charAt(cont)==','){
               resp=false;
               i=palavras.length();
            }
            if(palavras.charAt(cont)>='0' || palavras.charAt(cont)<='9'){
               resp=false;
               i=palavras.length();
            }
         }
         else{
            resp=false;
            i=palavras.length();
         }
         cont++;
      }
      return resp;
   }
   
         //X3
         
   public static boolean inteiros(String palavras){
      boolean resp=false;
      int cont=0;
      for(int i=0;i<palavras.length();i++){
         if(palavras.charAt(cont)=='.' || palavras.charAt(cont)==','){
            resp=false;
            i=palavras.length();
         }
         else{
            if(palavras.charAt(cont)>='0' && palavras.charAt(cont)<='9'){
               resp=true;
            
            }
         }
            
         cont++;
      }
      return resp;
   }
   
      //X4
      
      
   public static boolean reais(String palavras){
      boolean resp=false;
      int cont=0,cont2=0;
      for(int i=0;i<palavras.length();i++){
         if(palavras.charAt(cont)>='a' && palavras.charAt(cont)<='z'){
            resp=false;
            i=palavras.length();
         }
         if(palavras.charAt(cont)>='0' && palavras.charAt(cont)<='9' || palavras.charAt(cont)=='.' || palavras.charAt(cont)==',' ) {
           if(palavras.charAt(cont)>='0' && palavras.charAt(cont)<='9'){
           resp=true;
           }
            if(palavras.charAt(cont)=='.' || palavras.charAt(cont)==','){
               resp=true;
               cont2++;
            }
         }
         cont++;
      }
      if(cont2>1){
         resp=false;
      }
      return resp;
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
      for(int i = 0; i < numEntrada; i++){
         if(vogais(entrada[i])==true)
            MyIO.print("SIM");
         else
            MyIO.print("NAO");
         
         if(consoantes(entrada[i])==true)
            MyIO.print(" SIM");
         else
            MyIO.print(" NAO");
         
         if(inteiros(entrada[i])==true)
            MyIO.print(" SIM");
         else
            MyIO.print(" NAO");
         
         if(reais(entrada[i])==true)
            MyIO.print(" SIM");
         else
            MyIO.print(" NAO");
         
         MyIO.println("");
      
      }
   }
}