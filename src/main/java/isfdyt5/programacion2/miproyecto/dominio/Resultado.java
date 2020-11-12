package isfdyt5.programacion2.miproyecto.dominio;

import java.util.Date;

public class Resultado {

    private Test test;
    private boolean positivo;
    private Date fechaRealizacion;

    public void setFechaRealizacion(Date fecha) {
        fechaRealizacion = fecha;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }

    public boolean isPositivo(){
        return positivo;
    }
    
}

    