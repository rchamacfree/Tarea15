/*
Haz un programa que cree un conjunto HashSet que almacene la lista de personas que van a
una fiesta (de una persona sabemos su nombre, teléfono, email y fecha de nacimiento). Crea en un
archivo aparte la clase Persona con los atributos y métodos que necesites. En el programa introduce
“a mano” unas cuantas personas, y luego muestre la edad media y el nombre del mayor.
• Intenta hacer una inserción de una persona repetida ¿Qué ocurre? (Dos personas son
iguales si tienen exactamente el mismo nombre.
    Al intentar añadir un repetido no lo añade

• Muestra todos los valores almacenados en el HashSet ¿Tienen algún orden?
    No tienen un orden establecido

fecha: 19/04/2021
alumno: Rafael Chamorro Maceiras
 */
package rcmt15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;


public class RCMt15e03 {


    static HashSet<Persona> fiesta;
    
    public static void main(String[] args) {
        long max = 0;
        long edad = 0;
        String mayor = "";
      
        fiesta = new HashSet<>();
        fiesta.add(new Persona ("Rafael","111111111","rafa@gmail.com",LocalDate.parse("1974-01-08")));
        fiesta.add(new Persona ("Jose","111111111","Jose@gmail.com",LocalDate.parse("1984-01-08")));
        fiesta.add(new Persona ("Rafael","222222222","rafa@gmail.com",LocalDate.parse("1979-09-08")));
        fiesta.add(new Persona ("Marcos","111111111","Marcos@gmail.com",LocalDate.parse("1994-01-08")));
        fiesta.add(new Persona ("Pedro","111111111","Pedro@gmail.com",LocalDate.parse("2004-01-08")));

        for (Persona x : fiesta){
            if(ChronoUnit.YEARS.between(x.fecha_nacimiento,LocalDate.now()) >  max){
                max = ChronoUnit.YEARS.between(x.fecha_nacimiento,LocalDate.now());
                mayor = x.nombre;
               
            }
            System.out.println(x.toString());
            edad += ChronoUnit.YEARS.between(x.fecha_nacimiento,LocalDate.now());
        }
        
        System.out.printf("La edad media de las personas añadidas al HashSet es %.2f y el mayor es %s",((float)edad/fiesta.size()),mayor);
        
        
        
        
    }//fin main
    
}
