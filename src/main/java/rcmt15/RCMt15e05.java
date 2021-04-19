/*
Modifica la clase Persona (llámale Persona_v2) para que dos personas sean iguales si tienen
el mismo nombre sin tener en cuenta mayúsculas y minúsculas. Repite el ejercicio anterior
intentando incluir en el conjunto valores que no sean permitidos por esta nueva condición (por
ejemplo: Ana y ANA generarían un duplicado). 

fecha: 19/04/2021
alumno: Rafael Chamorro Maceiras
 */
package rcmt15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashSet;


public class RCMt15e05 {


    static LinkedHashSet<Persona_v2> fiesta;
    
    public static void main(String[] args) {
        long max = 0;
        long edad = 0;
        String mayor = "";
      
        fiesta = new LinkedHashSet<>();
        fiesta.add(new Persona_v2 ("Rafael","111111111","rafa@gmail.com",LocalDate.parse("1974-01-08")));
        fiesta.add(new Persona_v2 ("Jose","111111111","Jose@gmail.com",LocalDate.parse("1984-01-08")));
        fiesta.add(new Persona_v2 ("Rafael","222222222","rafa@gmail.com",LocalDate.parse("1979-09-08")));
        fiesta.add(new Persona_v2 ("Marcos","111111111","Marcos@gmail.com",LocalDate.parse("1994-01-08")));
        fiesta.add(new Persona_v2 ("MARCOS","111111111","Pedro@gmail.com",LocalDate.parse("2004-01-08")));

        for (Persona_v2 x : fiesta){
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
