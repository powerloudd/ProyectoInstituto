package isfdyt5.programacion2.miproyecto.dominio;

import java.util.Vector;

public class Institucion {

    private String nombre;
    
    private Vector<Resultado> resultados = new Vector<Resultado>();

    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return nombre;
    }  

    public void addResultado(Resultado r) {
        resultados.add(r);
    }

}
