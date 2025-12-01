package implementacion.state;

import implementacion.state.models.Pedido;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.encurso();
        pedido.cancelar();
        pedido.finalizar();
    }
}
