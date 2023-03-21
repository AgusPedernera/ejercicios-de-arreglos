/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde se 
encuentra el numero y si se encuentra repetido
 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int num = leer.nextInt();
       int [] vector= new int [num];
        for (int i = 0; i < num; i++) {
            vector[i]=(int)(Math.random()*10);
            System.out.print("[" +vector[i]+"]"); 
        }
        System.out.println();
        System.out.println("Ingrese que numero desea buscar en el vector");
        int encontrar= leer.nextInt();
        int cont=0;
        int rep=0;
     
        for (int i = 0; i <num; i++) {
            if (vector[i]==encontrar) {
                rep=i;
                System.out.println("Se encuentra en la posicion " +rep);
                
            }
            
        }
        for (int elemento : vector) {
            if (elemento==encontrar) {
                cont++;
            
            }   
        }
        System.out.println("Se encuentra " + cont + " veces");
    }
}
    

