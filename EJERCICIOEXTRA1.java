/*
Realizar un algoritmo que calcule la suma de todos los elementos de un 
vector de tamaño N, con los valores ingresados por el usuario.

 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIOEXTRA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector [] = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor de la posicion " +(i+1));
           vector [i] = leer.nextInt();
            suma+=vector[i];
       
        
         }  
        for (int i = 0; i < n; i++) {
            System.out.println("[" +vector[i]+"]");
        }
        System.out.println("La suma de los vectores es="+ suma);
        
    }
    
}
