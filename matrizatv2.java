package matriz2;
import java.util.Scanner;
public class matriz2 {
	 public static void main(String[] args) {
	        
	        Scanner entrada =new Scanner(System.in);
	        
	        int[][] matrizA = new int[4][4];int matrizB[][] = new int[4][4];int matrizC[][] = new int [4][4];
	        
	        System.out.println("--MATRIZ 1--");
	        for(int l=0;l<4;l++) {
	            for(int c=0;c<4;c++) {
	                System.out.println("Digite o Número da Linha " +(c+1)+" Da Coluna "+(l+1));
	                matrizA[l][c] = entrada.nextInt();
	            }
	            System.out.println("#####################################################################");
	        }
	        System.out.println("--MATRIZ 2--");
	        for(int l=0;l<4;l++) {
	            for(int c=0;c<4;c++) {
	                System.out.println("Digite o Número da Linha " +(c+1)+" Da Coluna "+(l+1));
	                matrizB[l][c] = entrada.nextInt();
	            }
	            System.out.println("######################################################################");
	        }
	        
	        for(int l=0;l<4;l++) {
	            for(int c=0;c<4;c++) {
	                
	                if(matrizA[l][c]>matrizB[l][c]) {
	                    matrizC[l][c] = matrizA[l][c];
	                }
	                else if(matrizB[l][c]>matrizA[l][c]) {
	                    matrizC[l][c] = matrizB[l][c];
	                }
	                
	                System.out.println("O Maior numero na Linha "+(c+1)+" Da Coluna "+(l+1)+ " é " + matrizC[l][c]);
	            }    
	        }
	        
	        
	    }

}
