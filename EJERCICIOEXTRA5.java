/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.

 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIOEXTRA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las dimensiones de la matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        
        int [][]matriz = new int [n][m];
        int suma =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]= (int)(Math.random()*10);
                suma+=matriz[i][j];
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println();
        }
        
        System.out.println("La suma de todos los valores es: " +suma);
        
    }
    
}
