package isfdyt5.programacion2.miproyecto.dominio;

public class CentroPreventivo extends CentroAislamiento {
    
    public String nombre;

    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return nombre;
    }

    public int sumarCentroIntensivo(int ce) {
        return ce;
    }

    public int cantidadMedicos() {
        return 0;
    }

    public int sumarCentroPreventivos(int ce) {
        return ce + 1;
    }

}
