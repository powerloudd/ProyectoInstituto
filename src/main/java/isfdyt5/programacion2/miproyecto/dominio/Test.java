package isfdyt5.programacion2.miproyecto.dominio;

import java.util.Date;

public abstract class Test {

    private Paciente paciente;

    private Date fechaDeCreacion;

    public abstract float getTiempo();

    public abstract int sumarBasico(int t);

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fc) {
        fechaDeCreacion=fc;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente p) {
        paciente = p;
    }
    
}