package core;

import java.time.LocalDate;

public abstract class Producto {
    protected int id;
    protected String nombre;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected boolean estadoActivo;
    protected float valor;

    public Producto(int id, String nombre, LocalDate fechaInicio, float valor) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.valor = valor;
    }
    
    public Producto(int id, String nombre, LocalDate fechaInicio, float valor, boolean estadoActivo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.valor = valor;
        this.estadoActivo = estadoActivo;
    }
    
    public Producto(String nombre, LocalDate fechaInicio, float valor) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.valor = valor;
    }
    
    public Producto(boolean estadoAprobado, Cliente cliente, Curso curso) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.valor = valor;
    }

    public Producto(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoActivo = estadoActivo;
        this.valor = valor;
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

    public float getValor() {
        return valor;
    }
}
