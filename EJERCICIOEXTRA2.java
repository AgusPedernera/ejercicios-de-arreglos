/*
Escriba un programa que averigüe si dos vectores de N enteros son 
iguales (la comparación deberá detenerse en cuanto se detecte alguna 
diferencia entre los elementos).

 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIOEXTRA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int vector1[] = new int [N];
        int vector2[] = new int [N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la posicion del vector1 " + (i+1) +": ");
            int num = leer.nextInt();
            vector1[i]=num;   
        }
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vector1[i] + "]" );
        }
        System.out.println("");
        for (int j = 0; j < N; j++) {
            System.out.print("Ingrese la posicion del vector2 " + (j+1) +": ");
            int num1 = leer.nextInt();
            vector2[j]=num1;  
        }
       
        for (int i = 0; i < N; i++) {
            if(vector1[i]==vector2[i]){
                System.out.print("[" + vector2[i] + "]");
            }else{
                break;
            }
        }
        

    }
        
    }
    

