package herencia;

public class Estudiante extends Persona {
    
    private final String matricula;
    private final String carrera;
    
    public Estudiante(String nombre, String cedula, String matricula, String carrera){
        
        super(nombre, cedula);
        this.matricula = matricula;
        this.carrera = carrera;
        
    }
    @Override
    public String toString(){
        return super.toString() + " | Matricula: " + this.matricula + " | Carrera: "+ this.carrera;
    }
    
}
