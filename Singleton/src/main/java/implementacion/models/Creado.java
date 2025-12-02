package implementacion.models;

public class Creado implements Estado{
    private static Creado instance = null;

    private Creado(){}

    public static Creado getInstance(){
        if (instance == null){
            instance = new Creado();
        }
        return instance;
    }


    @Override
    public String toString() {
        return "Creado";
    }

    
    @Override
    public void algoritmo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'algoritmo'");
    }

    
    

    
}
