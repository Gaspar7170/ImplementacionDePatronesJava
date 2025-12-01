package implementacion.state.models;

import implementacion.state.estados.Creado;
import implementacion.state.estados.Estado;

public class Pedido {
    private Estado estado;
    private int numero;

    public Pedido() {
        estado = Creado.getInstance();
        System.out.println(estado);
    }

    public void encurso(){
        estado.enCurso(this);
        System.out.println(estado);
    }
    public void finalizar(){
        estado.finalizar(this);
        System.out.println(estado);
    }
    public void cancelar(){
        estado.cancelar(this);
        System.out.println(estado);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    



    
    
}
