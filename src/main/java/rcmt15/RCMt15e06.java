/*
Realizar un programa que tenga un HashMap que almacene una plantilla de jugadores de un
equipo (Nombre, salario). El programa dispondrá de un menú que permita: añadir jugador, eliminar
jugador, consultar el salario de un jugador e incrementar el salario un 10% a un empleado

fecha: 19/04/2021
alumno: Rafael Chamorro Maceiras

 */
package rcmt15;

import java.util.HashMap;
import java.util.Scanner;


public class RCMt15e06 {

static HashMap<String,Double> plantilla;
static Scanner teclado;
static String nombre;
static Double salario;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        plantilla = new HashMap<>();
        
        
         boolean salir=false;
        do{
        int opcion = menu();
        switch (opcion){
            case 0: salir = true;break;
            
            case 1: añadir();break;
            case 2: eliminar(); break;
            case 3: salario(); break;
            case 4: incrementar();break;
            case 5: mostrar();break;
            
            
                
             }
        }while (!salir);
        
        
    }
    
     static int menu(){
        int opcion;
        do{
        System.out.println("");
        System.out.println("////////////////////////");
        System.out.println("Menú equipo:");
        System.out.println("////////////////////////");
        System.out.println("1. Añadir jugador.");
        System.out.println("2. Eliminar jugador.");
        System.out.println("3. Consultar salario jugador.");
        System.out.println("4. Incrementar salario.");
        System.out.println("5. Mostrar plantilla");
        System.out.println("0. Cerrar Programa");
        System.out.println("------------------------");
        System.out.println("Introduce opcion:");
        opcion = Integer.parseInt(teclado.nextLine());
        }while(opcion < 0 || opcion > 5);
        return opcion;
    }
    
    static void añadir(){
        
        System.out.println("Introduce nombre del jugador:");
        nombre = teclado.nextLine();
        System.out.println("Introduce salario:");
        salario = Double.parseDouble(teclado.nextLine());
        
        plantilla.put(nombre,salario);
    }
    
    static void eliminar(){
        System.out.println("Jugador a eliminar:");
        nombre = teclado.nextLine();
        if (plantilla.containsKey(nombre))plantilla.remove(nombre);
        else System.out.println("El nombre no se encuentra en la plantilla");
    }
    
    static void salario(){
        System.out.println("Introduce nombre del jugador:");
        nombre = teclado.nextLine();
        if (plantilla.containsKey(nombre))System.out.println("Salario = " + plantilla.get(nombre));
        else System.out.println("El nombre no se encuentra en la plantilla");

    }
    
    static void incrementar(){
        
       System.out.println("Introduce nombre del jugador:");
       
        nombre = teclado.nextLine();
        if (plantilla.containsKey(nombre)){
            plantilla.put(nombre,plantilla.get(nombre)+ plantilla.get(nombre)*0.1);
        }
        
        
    }
    
    static void mostrar(){
        for (String x : plantilla.keySet())
            System.out.println(x + "--->" + plantilla.get(x));
    }
    
    
    
}


