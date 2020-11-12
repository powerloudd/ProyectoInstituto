package isfdyt5.programacion2.miproyecto.fachada;

import java.util.GregorianCalendar;
import java.util.Vector;
import isfdyt5.programacion2.miproyecto.dominio.Test;
import isfdyt5.programacion2.miproyecto.dominio.Basico;
import isfdyt5.programacion2.miproyecto.dominio.Rapido;
import isfdyt5.programacion2.miproyecto.dominio.Resultado;
import isfdyt5.programacion2.miproyecto.dominio.Sala;
import isfdyt5.programacion2.miproyecto.dominio.Paciente;
import isfdyt5.programacion2.miproyecto.dominio.CentroAislamiento;
import isfdyt5.programacion2.miproyecto.dominio.Institucion;

public class MinisterioSalud {
    
    private Vector<Test> tests = new Vector<Test>();
    private Vector<CentroAislamiento> centros = new Vector<CentroAislamiento>();
    private Vector<Institucion> instituciones = new Vector<Institucion>();
    private Vector<Paciente> pacientes = new Vector<Paciente>();
    private Vector<Sala> salas = new Vector<Sala>();

    /*Retorna la cantidad total de Test Basicos*/
    public int cantidadTotalDeTestBasicos() {
        int total = 0;

        for(Test t: tests)
            total = t.sumarBasico(total);
        
        return total;
    }

    public void agregarCentroAislamiento(CentroAislamiento centro) {
        centros.add(centro);
    }

    public void removerCentroAislamiento(CentroAislamiento centro) {
        centros.remove(centro);
    }

     /* Retorna la suma de los médicos de todos los centros*/
    public int cantidadDeMedicos(){
        int total = 0;

        for(CentroAislamiento centro:centros) {
            total+=centro.cantidadMedicos();
        }
        
        return total;
    }

    /*Retorna la cantidad total de centros prevenitvos*/
    public int cantidadTotalDeCentrosPreventivos() {
        int total = 0;

        for(CentroAislamiento centro:centros) {
            total=centro.sumarCentroPreventivos(total);
        }
        
        return total;
    } 

    /* Retorna el total de los Centros de Aislamiento*/
    public int totalCentroAislamiento(){
        return centros.size();
    } 

    public void borrarTest(Test t) {
        tests.remove(t);
    }

    public void agregarTestBasico(Paciente p) {
        Basico b = new Basico();
        b.setPaciente(p);
        agregarTest(b);       
    }

    /* Agregar una institución */
    public void agregarInstitucion(Institucion institucion) {
        if(!instituciones.contains(institucion))
            instituciones.add(institucion);     
    }

    /* Borrar una institución */
     public void borrarInstitucion(Institucion institucion){
        instituciones.remove(institucion);
    } 

    public void agregarTestRapido(Paciente p) {
        Rapido r = new Rapido();
        r.setPaciente(p);
        agregarTest(r);       
    }

    private void agregarTest(Test t) {
        /** Si el paciente no existe como paciente agregarlo. En caso contrario, no realizar la carga*/
        argregarPaciente(t.getPaciente());

        //Asigno la fecha de sistema como creación.
        t.setFechaDeCreacion(GregorianCalendar.getInstance().getTime());
        tests.add(t);
    }

    public void argregarPaciente(Paciente p) {
        if(!pacientes.contains(p))
            pacientes.add(p); 
    }

    /*Agrega un resultado positivo*/
    public void agregarResultadoPositivo(Test test, Institucion institucion)  {
        Resultado r = new Resultado();

        r.setTest(test);
        r.setPositivo(true);
        r.setFechaRealizacion(GregorianCalendar.getInstance().getTime());

        institucion.addResultado(r);
    }

    /*Retorna la cantidad de total de minutos dedicados a los Tests*/
    public float tiempoTotalMinutos() {
        float total = 0;

        for(Test test:tests) {
            total+=test.getTiempo();
        }
        
        return total;
    }

    /*Retorna la cantidad total de Tests*/
    public int cantidadTotalDeTest() {
        return tests.size();
    }

    /*Agrega el 
    hay espacio en alguna de las salas del centro.paciente al centro que se pasa como parámetro. Suponemos que siempre Pero no necesariamente en
    todas*/
    public void agregarPaciente(CentroAislamiento centro, Paciente paciente) {
        centro.agregarPaciente(paciente);
        argregarPaciente(paciente);
    }

    /*Agrega una sala al centro que se pasa como parámetro)*/
    public void agregarNuevaSala (CentroAislamiento centro, int capacidad){
        Sala NuevaSala = new Sala();       // Se crea el objeto // 

        NuevaSala.setCapacidadMaxima(capacidad);      // Se establece capacidad máxima //
        NuevaSala.setCentro(centro);                  // Se le asigna un centro //

        agregarSala(NuevaSala);                       // Se agrega la sala a la colección // 
    }

    public void agregarSala(Sala s){
        salas.add(s);
    }

    public void borrarSala(Sala s){
        salas.remove(s);
    }

}