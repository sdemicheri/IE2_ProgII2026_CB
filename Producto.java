public class Producto { 
    private int codigo; 
    private String descripcion; 
    private double precioLista; 
    private int stock; 
    public Producto(int codigo, String descripcion, double precioLista, int stock) { 
        this.codigo = codigo; 
        this.descripcion = descripcion; 
        this.precioLista = precioLista; 
        this.stock = stock; }
        public int getCodigo() { return codigo; } 
        public String getDescripcion() { return descripcion; } 
        public double getPrecioLista() { return precioLista; }
        public int getStock() { return stock; } 
    }