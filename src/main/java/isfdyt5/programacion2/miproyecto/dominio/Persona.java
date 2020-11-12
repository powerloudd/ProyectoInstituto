package isfdyt5.programacion2.miproyecto.dominio;

import java.util.Date;

public class Persona {

    private String nombre;
    private String apellido;
    private int tipoDocumento;
    private String nroDocumento; 
    private float altura;
    private float peso;
    private Date fechaNacimiento;

    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellido(String a){
        apellido = a;
    }

    public String getApellido(){
        return apellido;
    }

    public void setTipoDocumento(int dni){
        tipoDocumento = dni;
    }

    public int getTipoDocumento(){
        return tipoDocumento;
    }

    public void setNroDocumento(String nro){
        nroDocumento = nro;
    }

    public String getNrooDocumento(){
        return nroDocumento;
    }

    public void setAltura(float a){
        altura = a;
    }

    public float getAltura(){
        return altura;
    }

    public void setPeso(float p){
        peso = p;
    }

    public float getPeso(){
        return peso;
    }

    public void setFechaNacimiento(Date f){
        fechaNacimiento = f;
    }

    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
}