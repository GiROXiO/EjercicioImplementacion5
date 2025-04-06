package core;

import java.time.LocalDate;

public class PlanCliente extends Producto{
    private Cliente cliente;
    private Plan plan;

    public PlanCliente(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor, Cliente cliente, Plan plan) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.cliente = cliente;
        this.plan = plan;
    }   
    
    public void setEstadoActivo(Boolean estadoActivo){
        this.estadoActivo = estadoActivo;
    }
}
