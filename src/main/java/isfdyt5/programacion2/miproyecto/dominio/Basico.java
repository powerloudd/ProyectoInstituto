package isfdyt5.programacion2.miproyecto.dominio;

public class Basico extends Test {

    /*Representa 24 horas*/ 
    private static final float TIEMPO = 1440f;

    public float getTiempo() {
        return TIEMPO;
    }

    public int sumarBasico(int t) {
        return t + 1;
    }

}