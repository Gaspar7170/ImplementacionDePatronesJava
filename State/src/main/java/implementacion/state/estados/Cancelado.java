package implementacion.state.estados;

public class Cancelado extends Estado {
    private static Cancelado instance = null;

    public static Cancelado getInstance() {
        if (instance == null){
            instance = new Cancelado();
        }
        return instance;
    }
    
    public Cancelado() {
        instance.setNombreEstado("Cancelado");
    
    }

}
