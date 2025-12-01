package implementacion.state.estados;

import implementacion.state.models.Pedido;

public class EnCurso extends Estado {
    
    //Singleton
    private static EnCurso instance = null;
    public static EnCurso getInstance(){
        if (instance == null){
            instance = new EnCurso();
        }
        return instance;
    }
    //Fin singleton.

    private EnCurso(){
        instance.setNombreEstado("En curso");
    }

    @Override
    public void finalizar(Pedido pedido) {
        pedido.setEstado(Entregado.getInstance());
    }

  

    
}
