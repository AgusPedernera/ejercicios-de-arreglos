/*
Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene 
cambiando sus filas por columnas (o viceversa).
 */
package ejerciciosarreglos;

/**
 *
 * @author tinap
 */
public class ejercicioantisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]matriz ={{6,-6,8},{4,-4,3},{6,4,-5}};
        int [][]matriz2 = new int [3][3];
        boolean magico = false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              
             
               System.out.print("[" + matriz[i][j]+"]");
                
            }
             System.out.println();
             
        }
         System.out.println("===============");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                
                  matriz2 [j][i] =  matriz [i][j];
                System.out.print( "[" + matriz2 [j] [i] + "]" );
            }
            System.out.println("");
    }
        System.out.println("===============");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
                System.out.print("[" +matriz2[i][j]*-1+"]");
              if (matriz[i][j]== -matriz2[i][j]) {
                   magico=true;
    
                }else{
                   magico=false;
                }   
 
            }
             System.out.println();

         }   
         
          if (magico=true) {
                 System.out.println("Es antisimetrica");
                 
             }else{
                 System.out.println("No es antisimetrica");
             }
    
    
}
}
