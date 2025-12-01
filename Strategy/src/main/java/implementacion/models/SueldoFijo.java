package implementacion.models;

public class SueldoFijo implements Sueldo {
    double cotizacionFija = 10;
    int aporte = 5;
    double particular;

    public SueldoFijo(double monto) {
        this.particular = monto;
    }
    
    @Override
    public double calcularSueldo(Empleado empleado) {
        return ((empleado.getTiempoContratadoAnios() * cotizacionFija) - aporte)*particular;
    }
    
}
