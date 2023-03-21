/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int dimension = leer.nextInt();
        int [] vector = new int [dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i]=(int)( Math.random()*11111);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println();
        
        int cont;
        int v1 = 0, v2 = 0, v3 = 0, v4 = 0, v5 = 0;
        for (int i = 0; i < dimension; i++) {
            cont = 0;
            while (vector[i] != 0) {
                vector[i] = vector[i] / 10;
                cont++;
            }
            switch (cont) {
                case 1:
                    v1++;
                    break;
                case 2:
                    v2++;
                    break;
                case 3:
                    v3++;
                    break;
                case 4:
                    v4++;
                    break;
                case 5:
                    v5++;
                    break;
            }
        }
        
        System.out.println("la cantidad de numeros de 1 digitos : " + v1);
        System.out.println("la cantidad de numeros de 2 digitos : " + v2);
        System.out.println("la cantidad de numeros de 3 digitos : " + v3);
        System.out.println("la cantidad de numeros de 4 digitos : " + v4);
        System.out.println("la cantidad de numeros de 5 digitos : " + v5);
    }  
               
}
            
        
    
            
        
        
    
    

