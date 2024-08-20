
package practica;

import java.util.Arrays;

public class Pequeños {
   

    public static void main(String[] args) {
        int entero[]={1,2,3,4,5,6,7,8};
        String cadena[]={"a","b","c","d","e"};
        System.out.println("El tamano del vector tipo entero es:");
        System.out.println(tamanoInt(entero));
        System.out.println("El tamano del vector tipo cadena es:");
        System.out.println(tamanoString(cadena));
        mostrarInt(entero);
        mostrarCadena(cadena);
        limpiarInt(entero);
        limpiarString(cadena);
        System.out.println("Cantidad de enteros no vacios");
        System.out.println(contarInt(entero));
        System.out.println("Cantidad de cadenas no vacias");
        System.out.println(contarString(cadena));
      
    }
    
    public static int tamanoInt(int entero[]){
        int tamano;
        tamano=entero.length;
        return tamano;
    }
    
    public static int tamanoString(String cadena[]){
        int tamano;
        tamano=cadena.length;
        return tamano;
    }
    
    public static void mostrarInt(int entero[]){
        System.out.println(Arrays.toString(entero));
    }
    
        public static void mostrarCadena(String cadena[]){
        System.out.println(Arrays.toString(cadena));
    }
        
    public static void limpiarInt(int entero[]){
        for(int i=0;i<entero.length;i++){
            entero[i]=0;
        }
            
    }
    
    public static void limpiarString(String cadena[]){
        for(int i=0;i<cadena.length;i++){
            cadena[i]=null;
        }
            
    }
    
    public static int contarInt(int entero[]){
        int cantidad=0;
        for(int validacion:entero){
            if (validacion!=0){
                cantidad++;
                
            }
        }
        return cantidad;
    }
    
    public static int contarString(String cadena[]){
        int cantidad=0;
        for(String validacion:cadena){
            if (validacion!=null){
                cantidad++;
                
            }
        }
        return cantidad;
    }
    
    
}
