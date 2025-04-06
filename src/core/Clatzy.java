package core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clatzy {

    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public Clatzy() {
        this.clientes = new ArrayList<>();
        this.instructores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.planes = new ArrayList<>();
    }

    public void addInstructor(String nombre, String cedula, String telefono, String email) {
        this.instructores.add(new Instructor(nombre, cedula, telefono, email));
    }

    public void addCliente(String nombre, String cedula, String telefono, String email) {
        this.clientes.add(new Cliente(nombre, cedula, telefono, email));
    }

    public void addPlan(String nombre, LocalDate fechaInicio, float valor, float valorMaximoCurso) {
        this.planes.add(new Plan(nombre, fechaInicio, valor, valorMaximoCurso));
    }

    public void addCurso(int id, String nombre, LocalDate fecha, float valor, Instructor instructor) {
        Curso curso = new Curso(id, nombre, fecha, valor);
        curso.addInstructor(instructor);
        this.cursos.add(curso);
    }

    public Instructor getInstructor(int index) {
        return this.instructores.get(index);
    }

    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }

    public Plan getPlan(int index) {
        return this.planes.get(index);
    }

    public Curso getCurso(int index) {
        return this.cursos.get(index);
    }

    public void comprarCurso(Cliente cliente, Curso curso, LocalDate fecha) {
        ArrayList<PlanCliente> planesCliente = cliente.getPlanes();
        PlanCliente planActivo = null;
        for (PlanCliente planCliente : planesCliente) {
            if (planCliente.getEstadoActivo()) {
                planActivo = planCliente;
            }
        }
        if (planActivo != null) {
            if (planActivo.getPlan().getValorMaximoCurso() >= curso.getValor()) {
                System.out.println("El cliente " + cliente.getNombre() + " registro exitosamente el curso " + curso.getNombre());
                cliente.addProducto(new ProductoCliente(curso.getId(), curso.getNombre(), curso.getFechaInicio(), curso.getValor()));
            } else {
                System.out.println("El plan del cliente " + cliente.getNombre() + " no cubre el curso " + curso.getNombre());
            }
        }
    }

    public void comprarCurso(Cliente cliente, Curso curso, LocalDate fecha, float valor) {
        ArrayList<PlanCliente> planesCliente = cliente.getPlanes();
        ArrayList<ProductoCliente> productosCliente = cliente.getProductos();
        PlanCliente planActivo = null;
        boolean cubreCurso = false;
        boolean cursoComprado = false;
        for(ProductoCliente producto : productosCliente)
        {
            if (producto.getId() == curso.getId())
            {
                cursoComprado = true;
            }
        }
        if (!cursoComprado){
            for (PlanCliente planCliente : planesCliente) {
                if (planCliente.getEstadoActivo()) {
                    planActivo = planCliente;
                }
            }
            if (planActivo != null) {
                if (planActivo.getPlan().getValorMaximoCurso() >= curso.getValor()) {
                    System.out.println("El curso esta incluido en el plan del cliente "+cliente.getNombre()+", por lo tanto no debe pagar. Se procede a registrar el curso "+curso.getNombre()+" con costo $0");
                    cliente.addProducto(new ProductoCliente(curso.getId(), curso.getNombre(), curso.getFechaInicio(), curso.getValor()));
                    cubreCurso = true;
                }
            }
            if (!cubreCurso) {
                if (valor == curso.getValor()) {
                    System.out.println("El cliente " + cliente.getNombre() + " compro exitosamente el curso " + curso.getNombre());
                    cliente.addProducto(new ProductoCliente(curso.getId(), curso.getNombre(), curso.getFechaInicio(), curso.getValor()));

                } else {
                    System.out.println("El cliente " + cliente.getNombre() + " no pago el valor correcto por el curso " + curso.getNombre());
                }
            }
        }
        else
        {
            System.out.println("El cliente " + cliente.getNombre() + " ya habia comprado el curso " + curso.getNombre());
        }
    }

    public void listAll() {
        for(Cliente cliente : clientes)
        {
            System.out.println(cliente.getNombre() + ":");
            System.out.println("Planes:");
            for(PlanCliente plan : cliente.getPlanes())
            {
                System.out.println(plan.getNombre() + " " + plan.getFechaInicio() + " " + plan.getValor() + " " + plan.getEstadoActivo());
            }
            System.out.println("\nCursos:");
            for(ProductoCliente producto : cliente.getProductos())
            {
                System.out.println(producto.getNombre() + " " + producto.getFechaInicio()+ " " + producto.getValor() + " True");
            }
            System.out.println("----------------------------------------");
        }
    }

    public void comprarPlan(Cliente cliente, Plan plan, LocalDate date) {
        boolean puedeAdquirirPlan = true;
        for (PlanCliente planCliente : cliente.getPlanes()) {
            if (planCliente.estadoActivo) {
                puedeAdquirirPlan = false;
            }
        }

        if (puedeAdquirirPlan) {
            PlanCliente planC = new PlanCliente(plan.getId(), plan.getNombre(), plan.getFechaInicio(), plan.getValor(), true, cliente, plan);
            cliente.addPlan(planC);
            System.out.println("El cliente " + cliente.getNombre() + " compro exitosamente un plan " + plan.getNombre());
        } else {
            System.out.println("El cliente " + cliente.getNombre() + " ya tiene un plan activo");
        }
    }

    public String getClienteMayorIngreso() {
        float mayorIngreso = 0f;
        Cliente clienteMayorIngreso = null;
        for (Cliente cliente : clientes) {
            float valorPagado = 0f;
            for (Producto producto : cliente.getProductos()) {
                valorPagado += producto.getValor();
            }
            if (valorPagado > mayorIngreso) {
                mayorIngreso = valorPagado;
                clienteMayorIngreso = cliente;
            }
        }
        return clienteMayorIngreso.getNombre();
    }
}
