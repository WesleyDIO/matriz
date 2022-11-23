"# matriz" 

  package matriz;
import java.util.Random;
  public class matriz {
    public static void main(String[] args) {
        
        Random ran = new Random();
        
        int[][] matriz = new int[20][10];int soma[] = new int[10],multiplicacao[][] =new int[20][10];
        
        for(int l=0;l<20;l++) {
            for(int c=0;c<10;c++) {
                matriz[l][c] = ran.nextInt(10);
            }
        }
        for(int i=0;i<soma.length;) {
            for(int c=0;c<10;c++) {
                for(int l =0;l<20;l++) {
                    soma[i]+=matriz[l][c];
                }
                i++;
            }
        }
        
        for(int i=0;i<10;) {
            System.out.println("MULTIPLICAÇÃO DA COLUNA  ["+(i+1)+"]");
            for(int l =0;l<20;l++) {
                
                    multiplicacao[l][i]=matriz[l][i]*soma[i];
                    System.out.println("MULTIPLICAÇÃO DA LINHA "+(l+1)+":"+(i+1)+" é: "+soma[i]+"x"+matriz[l][i]+"="+multiplicacao[l][i]);
            }
            i++;
            System.out.println("#################################################################");
        }
    }
}
