class CiframentoDeCesarRecursivo {

 
   public static boolean isFim(String s){
      return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }
 
   public static void ciframento (String palavras,int j,String temp2){
      int temp;
         
      temp=(int)palavras.charAt(j)+3;//passando para ascii e andando 3 carcters
      temp2+=(char)temp; //voltando para letra 
   
      if(j==palavras.length()-1){
         MyIO.println(temp2);
      }
      if(j<palavras.length()-1){
         ciframento (palavras,j+1,temp2);
       
      }
        
   }
 
   public static void main (String[] args){
      String[] entrada = new String[1000];
      int numEntrada = 0;
   
      //Leitura da entrada padrao
      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (isFim(entrada[numEntrada++]) == false);
      numEntrada--;   //Desconsiderar ultima linha contendo a palavra FIM
      int j=0;
      String temp2="";
      for(int i = 0; i < numEntrada; i++){
         ciframento(entrada[i],j,temp2);
      }
   }
}