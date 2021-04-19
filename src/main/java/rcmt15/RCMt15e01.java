/*
Realizar un programa que contenga una LinkedList para almacenar las matrículas de los
coches aparcados en un parking. El parking es un poco raro, mide solo 3 metros de ancho y
caben 10 coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en
salir (esta estructura se llama pila LIFO – Last Input, First Output). El programa tendrá un menú
para:
a. Aparcar: se le pasará el número de matrícula y lo almacenará a no ser que esté lleno.
b. Desaparcar: Muestra la matrícula del coche a desaparcar o bien un mensaje informando
cadena vacía si el parking está vacío.
c. Mostrar la lista de las matrículas de los coches que hay en el parking, por orden inverso al
de llegada, es decir primero el último en llegar
Nota: Usa los métodos que meten y sacan por el principio de la lista: addFirst, removeFirst

fecha: 19/04/2021
Alumno: Rafael Chamorro Maceiras
 */
package rcmt15;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author rchamac
 */
public class RCMt15e01 {
    static Scanner teclado;
    static LinkedList<Coche> parking;
    static String matricula;
    static final int CAPACIDAD = 10;    
  
    public static void main(String[] args) {
        parking = new LinkedList<>();
        teclado = new Scanner(System.in);
        boolean salir=false;
        do{
        int opcion = menu();
        switch (opcion){
            case 0: salir = true;break;
            
            /// Aparcar///
            case 1: aparcar();break;
            
            
            /// Salir ///
            case 2: salir(); break;
            
            /// Comprobar parking ////
            case 3: mostrar(); break;
            
            
                
             }
        }while (!salir);
        
    }//fin main
    
    
     static int menu(){
        int opcion;
        do{
        System.out.println("");
        System.out.println("////////////////////////");
        System.out.println("Menú Parking");
        System.out.println("////////////////////////");
        System.out.println("1. Entrada vehículo.");
        System.out.println("2. Salida vehículo.");
        System.out.println("3. Mostrar parking.");
        System.out.println("0. Cerrar Programa");
        System.out.println("------------------------");
        System.out.println("Introduce opcion:");
        opcion = Integer.parseInt(teclado.nextLine());
        }while(opcion < 0 || opcion > 3);
        return opcion;
    }
     
     static void aparcar(){
        System.out.println("Matricula:");
        matricula = teclado.nextLine();
        if (parking.size()>=CAPACIDAD)System.out.println("Parking lleno");
        else parking.addFirst(new Coche(matricula));            
      }//fin aparcar
     
     
     static void salir(){
         if(parking.size()>0){
         matricula = parking.removeFirst().matricula;
         System.out.printf("Vehiculo con matricula %s ha salido.",matricula);
         }
         else System.out.println("El parking está vacío.");
     }//fin desaparcar
     
     static void mostrar(){
         for (Coche x : parking)
             System.out.println(x.matricula);
         
     }
     
     
    
}