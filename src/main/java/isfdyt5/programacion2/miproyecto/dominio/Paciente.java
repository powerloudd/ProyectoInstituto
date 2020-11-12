package isfdyt5.programacion2.miproyecto.dominio;

import java.util.Date;

public class Paciente extends Persona {

    private Date fechaIngreso;

    public void setFechaIngreso(Date fecha){
        fechaIngreso=fecha;
    }

    public Date getFechaIngreso(){
        return fechaIngreso;
    }
}