import java.io.*;
import java.util.Random;
public class arquivoJava {


   public static void lerArquivo(int x){
   
      RandomAccessFile arq= new RandomAccessFile ("arquivo.txt","rw");
      double y,numeros;
      
      for(int i=0;i<x;i++){
         y=MyIO.readDouble();
         arq.writeDouble(y);
      
      }
      
      int tamanho=(int)arq.getFilePointer()-8;
      while(tamanho>=0){
      
         arq.seek(tamanho);
         numeros=arq.readDouble();
         if(numeros%1==0){
            MyIO.println((int)numeros);
         }else{
            MyIO.println(numeros);   
         }
         tamanho-=8;
      }
      arq.close();
       
   
   }

 
   public static void main(String[] args)throws IOException  {
   
      int x=MyIO.readInt();
      try{
         lerArquivo(x);
      }
      catch(IOException IO) {
      }        
   }
    
}
 
