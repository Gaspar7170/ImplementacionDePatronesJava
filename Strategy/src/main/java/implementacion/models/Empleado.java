package implementacion.models;

public class Empleado {
    private int tiempoContratadoAnios = 10;
    private String nombre;

    //Sueldo del empleado
    private Sueldo estrategiaSueldo;
    
    public Empleado(String nombre, Sueldo estrategiaSueldo) {
        this.nombre = nombre;
        this.estrategiaSueldo = estrategiaSueldo;
    }

    public double calcularSueldo(){
        return estrategiaSueldo.calcularSueldo(this);
    }

    public int getTiempoContratadoAnios() {
        return tiempoContratadoAnios;
    }

    public void setTiempoContratadoAnios(int tiempoContratadoAnios) {
        this.tiempoContratadoAnios = tiempoContratadoAnios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sueldo getSueldo() {
        return estrategiaSueldo;
    }

    
    
}