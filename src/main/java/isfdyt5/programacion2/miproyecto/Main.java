package isfdyt5.programacion2.miproyecto;

import isfdyt5.programacion2.miproyecto.fachada.MinisterioSalud;
import isfdyt5.programacion2.miproyecto.dominio.Paciente;

public class Main {

    public static void main( String[] args )
    {
        MinisterioSalud ms = new MinisterioSalud();

        //Agregar Test Basico
        System.out.println("=======================> Agregar Test Basico");
        Paciente p = new Paciente();
        p.setNombre("Carlos");
        p.setApellido("Blanco");

        ms.agregarTestBasico(p);

        System.out.println("Cantidad de Basicos: " + ms.cantidadTotalDeTestBasicos());

        System.out.println("=======================> FIN Agregar Test Basico");
        //TODO   
        System.out.println("=======================> Agregar el paciente a un centro");
        //Agregar el paciente a un centro
        //Ministerio de Salud -> agregarPaciente(CentroAislamiento centro, Paciente paciente)
        System.out.println("=======================> FIN Agregar el paciente a un centro");
    }
    
}
