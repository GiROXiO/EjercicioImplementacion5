package core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Curso extends Producto {
    
    private float valorMaximoCurso;
    private ArrayList<Plan> planes;

    public Curso(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor, float valorMaximoCurso) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = null;
    }
    
    
}
