import java.util.Random;
class AlteracaoAleatoria {

 
   public static boolean isFim(String s){
      return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }
  
   public static String aleatoria(String palavras,char a,char b){
      int cont=0;
      String nova="";
    
    
            

      do{
         if(palavras.charAt(cont)== a ){
           nova+=b;
         }
         else{
         nova+=palavras.charAt(cont);
         }
              
         cont++;
      }while(cont<palavras.length());         
   
      return nova;
   }

 
   public static void main (String[] args){
      String[] entrada = new String[1000];
      int numEntrada = 0;
   
      //Leitura da entrada padrao
      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (isFim(entrada[numEntrada++]) == false);
      numEntrada--;   //Desconsiderar ultima linha contendo a palavra FIM
       
        Random gerador = new Random();
      gerador.setSeed(4);
   
      for(int i = 0; i < numEntrada; i++){
       char a=((char)('a' + (Math.abs(gerador.nextInt())%26)));
      char b=((char)('a' + (Math.abs(gerador.nextInt())%26)));//gerando lentras aleatorias
        MyIO.println(aleatoria(entrada[i],a,b));
      }
   }
}