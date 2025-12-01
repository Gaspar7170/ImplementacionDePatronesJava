package implementacion.state.estados;

import implementacion.state.models.Pedido;

public abstract class Estado {
    private static String nombreEstado;
    
    public void enCurso(Pedido pedido){
        throw new UnsupportedOperationException("No se puede transicionar a encurso.");
    }
    public void cancelar(Pedido pedido) {
        pedido.setEstado(Cancelado.getInstance());
    }
    public void finalizar(Pedido pedido){
        throw new UnsupportedOperationException("No se puede transicionar a finalizar.");
    }
    //public int calcular(int numero);


    public String getNombreEstado() {
        return nombreEstado;
    }

    public static void setNombreEstado(String nombreEstado) {
        Estado.nombreEstado = nombreEstado;
    }

    @Override
    public String toString() {
        return nombreEstado;
    }
    
    
}
