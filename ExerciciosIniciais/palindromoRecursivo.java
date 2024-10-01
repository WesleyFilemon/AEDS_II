public class palindromoRecursivo {

 
   public static boolean isFim(String s){
      return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }

   public static boolean isPalindromo(String entrada,int x,int y){
           boolean resp;     

              if(y>x)
              resp=true;
              else{
              if(entrada.charAt(y) != entrada.charAt(x)){
               resp=false;
              }else{
              resp=isPalindromo(entrada,x-1,y+1);
              }
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
      int y=0;
      //Para cada linha de entrada, gerando uma de saida contendo o numero de letras maiusculas da entrada
      for(int i = 0; i < numEntrada; i++){
         int x = entrada[i].length()-1;
         if(  isPalindromo(entrada[i],x,y) == true){
            MyIO.println("SIM");
         }
         else  {
            MyIO.println("NAO");
         }
        
      
      }
   }
}