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
    
    public void addCurso(int id, String nombre, LocalDate fecha, float valor, Instructor instructor)
    {
        Curso curso = new Curso(id, nombre, fecha, valor);
        curso.addInstructor(instructor);
        this.cursos.add(curso);
    }
    
}
