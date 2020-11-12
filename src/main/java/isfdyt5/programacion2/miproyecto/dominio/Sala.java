package isfdyt5.programacion2.miproyecto.dominio;

import java.util.Vector;

public class Sala {

    private Vector<Paciente> pacientes = new Vector<Paciente>();

    private int capacidadMaxima;
    private int nro;
    private CentroAislamiento centro;

    public CentroAislamiento getCentro() {
        return centro;
    }
    
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }

    public void setNro(int n){
        nro=n;
    }

    public int getNro(){
        return nro;
    }

    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCentro(CentroAislamiento c) {
        centro = c;
    }

    public boolean agregarPaciente(Paciente paciente) {
        if(!estaLlena()) {
            pacientes.add(paciente);
            return true;
        }

        return false;
    }

    public boolean estaLlena() {
        return pacientes.size() == capacidadMaxima;
    }
    
}