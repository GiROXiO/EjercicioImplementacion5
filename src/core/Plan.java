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

    public float getValorMaximoCurso() {
        return valorMaximoCurso;
    }

    public ArrayList<Plan> getPlanes() {
        return planes;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public float getValor() {
        return valor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }
}
