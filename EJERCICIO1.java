/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre 
por pantalla en orden descendente.
 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          int vector [] = new int [101];
          int j;
          for ( j = 100; j > 0; j--) {
               vector[j] = j;
             System.out.print("[" + vector[j] + "]");
        }
    }
    
}
