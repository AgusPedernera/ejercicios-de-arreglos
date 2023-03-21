/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.

 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matrizM = new int [3][3];
        int sumaF =0, sumaC =0, sumaD=0;
        int num=0 ;
        int cont=0;
      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              
               System.out.println("Rellene la matriz con numeros del 1 al 9");
               num = leer.nextInt();
                matrizM[i][j]= num;  
                 
            }    
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              System.out.print("["+ matrizM[i][j]+ "]");  
            }
            System.out.println();
            
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0) {
                    sumaF+=matrizM[i][j];
                    sumaC+= matrizM[j][i];
                    
                }
                if (i==j) {
                    sumaD+=matrizM[i][j];
                   

                }
                if (sumaF==sumaC && sumaF==sumaD ) {
                    cont++; 
                }
    
                }
            }
 
        
  
            if (cont==2) {
             System.out.println("Es magica");
        }else   
                
            System.out.println("No es magica");
        }
    }
    

