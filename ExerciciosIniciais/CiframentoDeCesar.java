class CiframentoDeCesar {

 
   public static boolean isFim(String s){
      return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }
 
   public static String ciframento (String palavras){
         int temp;
         String temp2="";
          
       for(int i=0;i<palavras.length();i++){
                      
                 temp=(int)palavras.charAt(i)+3;//passando para ascii e andando 3 carcters
                 temp2+=(char)temp; //voltando para letra   
       
       }
       palavras=temp2;
    return palavras;   
   }
 
   public static void main (String[] args){
      String[] entrada = new String[1000];
      int numEntrada = 0;
 
      //Leitura da entrada padrao
      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (isFim(entrada[numEntrada++]) == false);
      numEntrada--;   //Desconsiderar ultima linha contendo a palavra FIM
 
      for(int i = 0; i < numEntrada; i++){
      MyIO.println(ciframento(entrada[i]));
      }
   }
}