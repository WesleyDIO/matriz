package matriz3;
import java.util.Scanner;
public class matriz {
	  public static void main(String[] args) {
	        
	        Scanner entrada = new Scanner(System.in);
	        
	        String resultado = "";
	        int achou = 0;
	        double buscar, matriz[][] = new double [5][5];
	       
	        for(int l = 0; l < 5; l++) {
	            
	            for(int c = 0; c < 5; c++) {
	                System.out.print("Digite um valor (" + l + ":" + c + "):");
	                matriz[l][c] = entrada.nextDouble();
	            }
	        }
	        
	        System.out.println("Digite valor você quer buscar: ");
	        buscar = entrada.nextDouble();
	       
	        for(int l = 0; l < 5; l++) {
	            
	            for(int c = 0; c < 5; c++) {
	                if(matriz[l][c]==buscar) {
	                    resultado += ", "+"(" + l + ":" + c + ")";
	                    achou= 1;
	                }
	            }
	        }
	        
	      
	        if(achou == 0) {
	            System.out.println("Valor não encontrado! ");
	        }else {
	            System.out.println("O valor foi encontrado na(s) casa(s) a seguir" + resultado);
	        }
	    }

	}
