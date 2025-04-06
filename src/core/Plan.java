package core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plan extends Producto {
    
    private float valorMaximoCurso;
    private ArrayList<Plan> planes;

    public Plan(float valorMaximoCurso, int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = null;
    }
    
}
