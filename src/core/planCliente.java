package core;

import java.time.LocalDate;

public class PlanCliente extends Producto{
    private Cliente cliente;
    private Plan plan;

    public PlanCliente(int id, String nombre, LocalDate fechaInicio, float valor, boolean estadoActivo, Cliente cliente, Plan plan) {
        super(id, nombre, fechaInicio, valor, estadoActivo);
        this.cliente = cliente;
        this.plan = plan;
    }
    
    
}
