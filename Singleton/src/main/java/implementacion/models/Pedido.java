package implementacion.models;

public class Pedido {
    private Estado estado;

     
    public Pedido() {
        this.estado = Creado.getInstance();
    }

    public Estado getEstado() {
        return estado;
    }
   
    
}
