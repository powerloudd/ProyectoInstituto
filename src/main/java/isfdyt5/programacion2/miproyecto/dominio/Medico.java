package isfdyt5.programacion2.miproyecto.dominio;

public abstract class Medico {
    
    private String matricula;
    private String especialidad;

    public void setMatricula(String m){
        matricula=m;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setEspecialidad(String esp){
        especialidad=esp;
    }

    public String getEspecialidad(){
        return especialidad;
    }
    
    public int sumarMedico(int m) {
        return m + 1;
    }

}