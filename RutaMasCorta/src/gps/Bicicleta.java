package gps;
/**
 * Bicicleta class
 * 
 * @Java IES Severo Ochoa
 * @2.0
 * 
 */

import java.util.*;

/**
 * 
 * @author Sergio Fernández Pina
 * @version 1.1 :corrección error en el programa
 */
public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
        }
/**
 * El fallo del programa estaba en que evaluava primero el parámetro camino1, por lo tanto cuando
 * terminaba no seguia con el resto de parámetros, para solucionarlo añadimos 2 bucles for más, uno para
 * cada parámetro al evaluarlos por separado obetenemos el total de la suma correcto.
 * @param camino1 :array camino 1
 * @param camino2 :array camino 1
 * @param camino3 :array camino 1
 * @return :Devuelve una cadena con el resultado de evaluar el camino más corto
 */
    
      
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int i=0; i<camino1.length; i++)
        {
            sum1 += camino1[i];
        }
            for(int n=0; n<camino2.length; n++) {
            sum2 += camino2[n];
        }
            for(int x=0; x<camino3.length; x++) {
            sum3 += camino3[x];
        }
        
        if(sum1 < sum2 && sum1 < sum3)
        {
            return "camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "camino 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "camino 1, 2 y 3";
            }else if(sum1 == sum3)
            {
                return "caminos 1 y 3";
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
            }else{
                return "caminos 1 y 2";
            }
        }
        
    }
/**
 * En la case main se crean los arrays a evaluar por los métodos definidos en la clase principal
 * Clase main
 * @param args :String del método main
 */
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25};
        int[] camino2 = {24,1,5,64,10,15,21};
        int[] camino3 = {1,5,6,7,8,0,0,6,4};
        
        
       
        System.out.println("El camino mÃ¡s corto es:"+ Bicicleta.rutaCorta(camino1, camino2, camino3)+".");
    }
}

