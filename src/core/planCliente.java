package core;

import java.time.LocalDate;

public class PlanCliente extends Producto{
    private Cliente cliente;
    private Plan plan;

    public PlanCliente(Cliente cliente, Plan plan, int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.cliente = cliente;
        this.plan = plan;
    }
    
    
}
