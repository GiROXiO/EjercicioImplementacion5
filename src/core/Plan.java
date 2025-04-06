package core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plan extends Producto {
    private float valorMaximoCurso;
    private ArrayList<Plan> planes;
    private LocalDate fecha;
    private float valor;

    public Plan(String nombre, LocalDate fechaInicio, float valor, float valorMaximoCurso) {
        super(nombre, fechaInicio, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = null;
    }
}
