/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class ejercicioextra2equipo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int num = leer.nextInt();
        int[] vector = new int [num];
        int[] vector2 = new int [num];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el numero para la posicion " + i + " para el primer vector");
            vector[i] = leer.nextInt();           
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese el numero para la posicion " + i + " para el segundo vector");
            vector2[i] = leer.nextInt();              
            if (vector[i]!=vector2[i]) {
                System.out.println("Su numero no es igual al del primer vector");
                break;
            }else{
                
            }
        
        }

    }
    }
    

