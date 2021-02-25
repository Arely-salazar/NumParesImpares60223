/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares60223;

/**
 *
 * @author Jairo
 */
public class NumParesImpares60223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        int Sumapar = 0;
        int SumaImpar = 0;
        
        while( num < 101 ){
            if (num % 2 == 0){
                Sumapar = (Sumapar + num);
            }
            else if (num % 2 != 0){
                SumaImpar = ( num + SumaImpar);
            }
            num++;
        }    
        System.out.println("La suma de los números pares es: " + Sumapar);
        System.out.println("La suma de los números impares es: " + SumaImpar);
             
         }
         
        
    }
    


