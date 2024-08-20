
package Pro;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class Cantones {

    public static void main(String[] args) {
        ejercicioVectorString();
    }
    
   public static void ejercicioVectorString(){
       String [] cantones={ "Escazú", "San Ramón", "Barva", "Paraíso", "Esparza", "Nicoya", "Pococí", "Desamparados", "Grecia",

            "Santo Domingo", "La Unión", "Buenos Aires", "Santa Cruz", "Siquirres", "Puriscal", "San Mateo", "Santa Bárbara", "Jiménez", "Montes de Oro",

            "Talamanca", "Tarrazú", "Atenas", "San Rafael", "Turrialba", "Osa", "Carrillo", "Matina", "Aserrí", "Naranjo", "San Isidro", "Alvarado", "Aguirre", "Guácimo",

            "Mora", "Palmares", "Belén", "Oreamuno", "Golfito", "Abangares", "Goicoechea", "Poás", "Flores", "El Guarco", "Coto Brus", "Santa Ana", "Orotina",

            "San Pablo", "Parrita", "Nandayure", "Alajuelita", "San Carlos", "Sarapiquí", "Corredores", "La Cruz", "Vásquez de Coronado", "Alfaro Ruiz", "Garabito",

            "Hojancha", "Acosta", "Valverde", "Tibás", "Moravia", "Los Chiles", "Montes de Oca", "Guatuso", "Turrubares", "Dota", "Curridabat", "Pérez Zeledón",

            "León Cortés", null,null,null,null};
       
       System.out.println("El vector original es : ");
       System.out.println(Arrays.toString(cantones));
       
       System.out.println("El tamaño del vector es: ");
       System.out.println(cantones.length);
       
        int cantidad = 0;
        for (String palabra:cantones) {
            if (palabra!=null) {
                cantidad++;
            }
        }
        System.out.println("La cantidad de cantones presente en el vector es: ");
        System.out.println(cantidad);
        
    String[] agregar = {"Cañas", "Tilarán", "Upala", "Bagaces"};
    int[] posicion = {32, 45, 63, 19};
    for (int i = 0; i < agregar.length; i++) {
        String nuevoCanton = agregar[i];
        int indice = posicion[i];
        String[] nuevoVector = new String[cantones.length+1];
        System.arraycopy(cantones, 0, nuevoVector, 0, indice);
        nuevoVector[indice] = nuevoCanton;
        System.arraycopy(cantones, indice, nuevoVector,indice+1,cantones.length-indice);
        cantones = nuevoVector;
    }
       System.out.println("Vector actualizado:");
       System.out.println(Arrays.toString(cantones));
    
    
    buscarPosicion(cantones,"Talamanca");
    buscarPosicion(cantones,"Santa Cruz");
    buscarPosicion(cantones,"Orotina");
    
    List<String> list = new ArrayList<>(Arrays.asList(cantones));
    list.removeAll(Arrays.asList(null,""));
    cantones = list.toArray(new String[0]);
    
    Arrays.sort(cantones);
    
    System.out.println("Vector ordenado:");
    System.out.println(Arrays.toString(cantones));
   
   
    }
   
   
   public static void buscarPosicion(String cantones[],String nombre){
       int ubicacion =-1;
        for (int i = 0; i < cantones.length; i++) {
            if (cantones[i].equals(nombre)) {
                ubicacion = i;
                break;
            }
        }
        System.out.println("La posicion de " +  nombre + " es: "+ ubicacion);
    }
   
   
}
