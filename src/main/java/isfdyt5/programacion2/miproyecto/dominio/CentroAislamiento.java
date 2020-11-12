package isfdyt5.programacion2.miproyecto.dominio;

import java.util.Vector;

public abstract class CentroAislamiento {
    private Vector<Sala> salas = new Vector<Sala>();
    
    private String nombre;
    
    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract int sumarCentroIntensivo(int ce);
    
    public abstract int sumarCentroPreventivos(int ce);

    public abstract int cantidadMedicos();
    
    public void agregarPaciente(Paciente paciente) {
        for(Sala s: salas) {
            if(s.agregarPaciente(paciente))
                break;
        }
    }

    public void agregarSala(Sala s){
        salas.add(s);
    }

    public void borrarSala(Sala s){
        salas.remove(s);
    }

}