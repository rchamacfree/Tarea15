
package rcmt15;

import java.time.LocalDate;
import java.util.Objects;


public class Persona_v2 {
    
    public String nombre;
    public String tfno;
    public String email;
    public LocalDate fecha_nacimiento;
    
    public Persona_v2(String n, String t, String e, LocalDate f){
        this.nombre = n;
        this.tfno = t;
        this.email = e;
        this.fecha_nacimiento = f;
    }

   @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre.toUpperCase());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona_v2 other = (Persona_v2) obj;
        if (!Objects.equals(this.nombre.toUpperCase(), other.nombre.toUpperCase())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", tfno=" + tfno + ", email=" + email + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    
   
    
}
