/*
Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba 
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: 
https://quantdare.com/numeros-de-fibonacci/


 */
package ejerciciosarreglos;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class fibonaccitesigoodiando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese que cantidad de numeros desea conocer de la sucesión de Fibonacci");
        int n = leer.nextInt();
        int [] vector = new int [n];
         fibonacci(vector,n);
        
    }
    
    public static void fibonacci (int []vector, int n){
        for (int i = 0; i < vector.length; i++) {
            if (i==0 || i==1) {
                vector[i]=1;
            }else{
                //formula google: n=n-1+n-2
                vector[i]= vector[i-1]+vector[i-2];
            }
            
        }
        System.out.println("La serie hasta "+n+" seria asi: ");
        for (int i = 0; i < 10; i++) {
              System.out.print("["+ vector[i]+"]");
        }
        System.out.println(); 
    }
}
