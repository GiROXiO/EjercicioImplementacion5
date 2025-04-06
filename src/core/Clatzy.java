package core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clatzy {
    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public Clatzy() {
        this.clientes = new ArrayList<>();
        this.instructores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.planes = new ArrayList<>();
    }
    
    public void addInstructor(String nombre, String cedula, String telefono, String email){
        this.instructores.add(new Instructor(nombre, cedula, telefono, email));
    }
    
    public void addCliente(String nombre, String cedula, String telefono, String email){
        this.clientes.add(new Cliente(nombre, cedula, telefono, email));
    }
    
    public void addPlan(String nombre, LocalDate fechaInicio, float valor, float valorMaximoCurso){
        this.planes.add(new Plan(nombre, fechaInicio, valor, valorMaximoCurso));
    }
}
