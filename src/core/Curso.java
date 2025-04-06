package core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Curso extends Producto {
    
    private ArrayList<Instructor> instructores;
    private ArrayList<Producto> productosCliente;

    public Curso(int id, String nombre, LocalDate fechaInicio, float valor) {
        super(id, nombre, fechaInicio, valor);
        this.instructores = new ArrayList<>();
        this.productosCliente = new ArrayList<>();
    }
    
    public void addInstructor(Instructor instructor)
    {
        instructores.add(instructor);
    } 
}
