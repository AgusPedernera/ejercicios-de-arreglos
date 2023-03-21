/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos 
y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIOEXTRA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float [] [] notas = new float[10][4];
        float [] promedio = new float [10];
        float promNota;
        int aprobados =0;
        int desaprobados=0;
       
        for (int i = 0; i < 10; i++) {
            promNota=0;
            System.out.println("Ingrese la nota del alumno " + (i+1));
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Ingrese la nota del primer trabajo practico");
                        notas [i][j]= leer.nextFloat();
                        promNota += notas [i][j]*0.10f;
                        break;
                    case 1:
                        System.out.println("Ingrese la nota del segundo trabajo practico");
                        notas [i][j]= leer.nextFloat();
                        promNota += notas [i][j]*0.15f;
                        break;
                    case 2:
                        System.out.println("Ingrese la nota del primer integrador");
                        notas [i][j]= leer.nextFloat();
                        promNota += notas [i][j]*0.25f;
                        break;
                    case 3:
                        System.out.println("Ingrese la nota del segundo integrador");
                        notas [i][j]= leer.nextFloat();
                        promNota += notas [i][j]*0.50f;
                        break;
 
                }
                
            }
            promedio [i] = promNota;
             if (promedio[i]>=7){
                 aprobados++;
             }else{
                 desaprobados++;
             }
        }
         imprimirVector(promedio);
         System.out.println("-----------------");
         imprimirMatriz(notas);
        System.out.println("La cantidad de aprobados son: " +aprobados);
        System.out.println("La cantidad de desaprobados son: "+desaprobados);
        

        
    }
     public static void imprimirVector (float [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+ vector[i]+"]");
            
        }
        System.out.println();
        
        
    }
     
     public static void imprimirMatriz (float [][] notas){
         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 4; j++) {
                 
                System.out.print("[" + notas[i][j]+ "]"); 
             }
               System.out.println(); 
         }
         
         
     
         
     }
    
}
