package isfdyt5.programacion2.miproyecto.dominio;

import java.util.Vector;

public class CentroIntensivo extends CentroAislamiento {
    
    private Vector<Medico> medicos = new Vector<Medico>();

    public String nombre;

    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return nombre;
    }

    public int sumarCentroIntensivo(int ce) {
        return ce + 1;
    }

    public int sumarCentroPreventivos(int ce) {
        return ce;
    }

    public int cantidadMedicos() {
        return medicos.size();
    }

    public void agregarMedico(Medico m) {
        medicos.add(m);
    }
    
    public void removerMedico(Medico m) {
        medicos.remove(m);

    }
    
}
