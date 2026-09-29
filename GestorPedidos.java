
import java.util.ArrayList;

public class GestorPedidos {

    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;

    public GestorPedidos() {

        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        pedidos = new ArrayList<>();

        
    }

    public void cargarDatosInciales(){


        // ==========================================
        // PRODUCTOS
        // ==========================================

        Producto p1 = new Producto(
                101, "Arroz 1kg", 1500, 20);

        Producto p2 = new Producto(
                102, "Fideos 500g", 1200, 0);

        Producto p3 = new Producto(
                103, "Aceite 900ml", 2800, 15);

        Producto p4 = new Producto(
                104, "Gaseosa 2.25L", 3500, 8);

        Producto p5 = new Producto(
                105, "Agua mineral", 1200, 0);

        Producto p6 = new Producto(
                106, "Detergente", 2500, 12);

        Producto p7 = new Producto(
                107, "Lavandina", 1800, 0);

        Producto p8 = new Producto(
                108, "Shampoo", 4500, 7);

        Producto p9 = new Producto(
                109, "Jabón", 1200, 25);

        Producto p10 = new Producto(
                110, "Papel higiénico", 3500, 10);


        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        productos.add(p8);
        productos.add(p9);
        productos.add(p10);


        // ==========================================
        // CLIENTES
        // ==========================================

        Cliente c1 = new Cliente(
                1, "Juan Pérez");

        Cliente c2 = new Cliente(
                2, "María Gómez");

        Cliente c3 = new Cliente(
                3, "Carlos López");


        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);


        // ==========================================
        // PEDIDO 1
        // ==========================================

        Pedido ped1 = new Pedido(1001, c1);

        ped1.agregarDetalle(new DetallePedido(p1, 2));
        ped1.agregarDetalle(new DetallePedido(p2, 3));
        ped1.agregarDetalle(new DetallePedido(p4, 1));

        pedidos.add(ped1);


        // ==========================================
        // PEDIDO 2
        // ==========================================

        Pedido ped2 = new Pedido(1002, c2);

        ped2.agregarDetalle(new DetallePedido(p3, 4));
        ped2.agregarDetalle(new DetallePedido(p5, 2));
        ped2.agregarDetalle(new DetallePedido(p6, 3));
        ped2.agregarDetalle(new DetallePedido(p8, 1));

        pedidos.add(ped2);


        // ==========================================
        // PEDIDO 3
        // ==========================================

        Pedido ped3 = new Pedido(1003, c3);

        ped3.agregarDetalle(new DetallePedido(p2, 1));
        ped3.agregarDetalle(new DetallePedido(p7, 5));
        ped3.agregarDetalle(new DetallePedido(p9, 6));
        ped3.agregarDetalle(new DetallePedido(p10, 2));

        pedidos.add(ped3);


    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public Pedido obtenerPedido(int numero) {

        for (Pedido pedido : pedidos) {

            if (pedido.getNumero() == numero) {
                return pedido;
            }
        }

        return null;
    }
}
