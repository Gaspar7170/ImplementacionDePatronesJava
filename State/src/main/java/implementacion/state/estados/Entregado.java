package implementacion.state.estados;

public class Entregado extends Estado {

    private static Entregado instance = null;

    public static Entregado getInstance() {
        if (instance == null){
            instance = new Entregado();
        }
        return instance;
    }

    public Entregado(){
        instance.setNombreEstado("Entregado");
        informar();
    }

    private void informar(){
        System.out.println("");
    }
    
}
