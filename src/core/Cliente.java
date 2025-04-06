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

    public ArrayList<PlanCliente> getPlanes() {
        return planes;
    }
    
    public void addPlan(PlanCliente plan){
        this.planes.add(plan);
    }
    
    public void addProducto(ProductoCliente producto){
        this.productos.add(producto);
    }

    public ArrayList<ProductoCliente> getProductos() {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    
    
}
