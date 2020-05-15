/*
 * proyecto de registro de autos utilizando hash-table
 *importante usar las librerias necesarias
 */
package registro;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;
/**
 *
 * @author alex,oscar,marina,ruben
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
      static class Auto{
            // Declaro variables de tipo private
        private String marca, modelo, anio;
            // Este es mi contructor de la clase 
        // aqui voy a pasar unos parametros los cuales van a llenar nuestro 
        // hastable lo are de partes de un auto. el contructor tiene 
        // el mismo nombre que la clase principal en este caso es Hashtable_Ejemplo
        public Auto(String m, String mod, String an) {
            marca = m;
            modelo = mod;
            anio = an;
        }  
           // HAY UNA FORMA PARA SABER QUE LOS VALORES NO SE REPITAN 
        
        // Aqui agrrego las variables al hashtable
        @Override
        public String toString() {
            return  "Marca: "+marca + " Modelo: " + modelo + " Año: "+ anio; 
        }
        //Creo el Hashtable
        static Hashtable<Integer,String>autos = new Hashtable<>();
        static Scanner escribir = new Scanner (System.in); //Declaracion de manera global
        
          public static void main(String[] args) {
              addAuto();
              Mostrar();
          }
          private static void addAuto(){
        int contador = 1;// servira para guardar los 3 registros
                System.out.println("Autos a registrar");
        do{
            System.out.println("Escriba el marca del auto #" + contador);
            String nombre = escribir.nextLine();
            System.out.println("Escriba el modelo del auto #"+ contador);
            String modelo = escribir.nextLine();
            System.out.println("Escriba el Año del auto #"+ contador);
            String anio = escribir.nextLine();            
            // Añadimos el auto 
            Auto autosAdd = new Auto(nombre, modelo, anio);
            autos.put(contador, autosAdd.toString());
            contador++;
             //aqui se recogen los datos de los vehiculos 
        }
        while(contador <= 3); //se puede cambiar el valor del contador para modificar la cantidad de registros
    }
        
    }
    
}
