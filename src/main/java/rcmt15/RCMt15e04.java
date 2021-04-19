/*
Repite el ejercicio anterior con un LinkedHashSet ¿Qué ha cambiado? 

Mostrará´los elementos por orden de inserción.

fecha: 19/04/2021
alumno: Rafael Chamorro Maceiras
 */
package rcmt15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashSet;


public class RCMt15e04 {


    static LinkedHashSet<Persona> fiesta;
    
    public static void main(String[] args) {
        long max = 0;
        long edad = 0;
        String mayor = "";
      
        fiesta = new LinkedHashSet<>();
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
