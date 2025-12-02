package implementacion;

import implementacion.models.Pedido;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       Pedido pedido = new Pedido();
       System.out.println("Mi estado actual es: " + pedido.getEstado());
    }
}
