/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
de equipo y define su tipo de dato de tal manera que te permita 
alojar sus nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo

 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIOSTEORICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros del equipo");
        int compas = leer.nextInt();
        String [] equipo = new String [compas];
        
        for (int i = 0; i < compas; i++) {
            System.out.println("Ingrese el nombre del compañerx "+(i+1));
            equipo[i]=leer.next();
        }
        
        for (int j = 0; j < compas; j++) {
            System.out.println("El " +(j+1) +"° miembro del equipo se llama "+equipo[j]);  
        }
    } 
}
