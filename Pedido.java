import java.util.ArrayList;

public class Pedido { 
    private int numero; 
    private Cliente cliente; 
    private ArrayList<DetallePedido> detalles; 
    
    public Pedido (int codigo, Cliente cli){
        this.numero=codigo;
        this.cliente=cli;
        detalles = new ArrayList<DetallePedido>();
    }
    
    public void agregarDetalle(DetallePedido det){
        detalles.add(det);
    }
    
    public int getNumero(){
        return this.numero;
    }
    
}