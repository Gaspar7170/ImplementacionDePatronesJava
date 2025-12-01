package implementacion.state.estados;

import implementacion.state.models.Pedido;

public class Creado extends Estado {
    public static Creado instance = null;

    public static Creado getInstance() {
        if (instance == null){
            instance = new Creado();
        }
        return instance;
    }

    private Creado(){
        instance.setNombreEstado("Creado");
    }
    @Override
    public void enCurso(Pedido pedido) {
        pedido.setEstado(EnCurso.getInstance());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(Cancelado.getInstance());
    }


    
    
}
