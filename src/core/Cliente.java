package core;

import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<PlanCliente> planes;
    private ArrayList<ProductoCliente> productos;

    public Cliente(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.planes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public PlanCliente getPlan(int index) {
        return this.planes.get(index);
    }
    
    public void addPlan(PlanCliente plan){
        this.planes.add(plan);
    }
    
    public void addProducto(ProductoCliente producto){
        this.productos.add(producto);
    }
}
