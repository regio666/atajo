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
 * @version 1.2 :corrección error en el programa y refactorización para obtener método.
 */
public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
        }
/**
 * El fallo del programa consistia: evaluaba primero el parámetro camino1, por lo tanto cuando
 * terminaba no seguia con el resto de parámetros, para solucionarlo añadimos 2 bucles "for" más, uno para
 * cada parámetro al evaluarlos por separado obetenemos el total de la suma correcta de cada array.
 * @param camino1 :array camino 1
 * @param camino2 :array camino 1
 * @param camino3 :array camino 1
 * @return : devuelve el resultado de la suma de los Arrays camino1,camino2, y camino3 como sum1,sum2,sum3
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
        
        return evaluar(sum1, sum2, sum3);
        
    }
/**
 * Método "evaluar" obtenido mediante refactorización, extraer método. Evalua cual de las 3 sumas del método rutaCorta es
 * la más pequeña y devuelve el resultado.    
 * @param sum1 :atributo sum1 obtenido por el método rutacorta
 * @param sum2 :atributo sum2 obtenido por el método rutacorta
 * @param sum3 :atributo sum3 obtenido por el método rutacorta
 * @return : Devuelve una cadena "String" con el resultado de evaluar los parámetros sum1,sum2,sum3.
 */
public static String evaluar(int sum1, int sum2, int sum3) {
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
 * En la clase main se crean los arrays a evaluar por los métodos definidos en la clase Bicicleta
 * 
 * @param args :String del método main.
 */
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25};
        int[] camino2 = {24,1,5,64,10,15,21};
        int[] camino3 = {1,5,6,7,8,0,0,6,4};
        
        
       
        System.out.println("El camino mÃ¡s corto es:"+ Bicicleta.rutaCorta(camino1, camino2, camino3)+".");
    }
}

