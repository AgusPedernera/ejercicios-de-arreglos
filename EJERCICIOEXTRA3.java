/*
Crear una función rellene un vector con números aleatorios,
pasándole un arreglo por parámetro. Después haremos otra función o 
procedimiento que imprima el vector.

 */
package ejerciciosarreglos;

import java.util.Scanner;



/**
 *
 * @author tinap
 */
public class EJERCICIOEXTRA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n =leer.nextInt();
        int [] vector = new int [n];
        
        rellenarVector(vector);
        imprimirVector(vector);
    }
    
    public static void rellenarVector(int [] vector){
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random()*10);
        }
    }
    
    public static void imprimirVector (int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+ vector[i]+"]");
            
        }
        System.out.println();
        
    }
    
    
    
}
