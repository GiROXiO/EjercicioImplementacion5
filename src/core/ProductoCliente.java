package core;

import java.time.LocalDate;

public class ProductoCliente extends Producto{
    
    private boolean estadoAprobado;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso;

    public ProductoCliente(boolean estadoAprobado, int nivelAvance, Cliente cliente, Curso curso, int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.estadoAprobado = estadoAprobado;
        this.nivelAvance = nivelAvance;
        this.cliente = cliente;
        this.curso = curso;
    } 
}
