package implementacion.models;

public class SueldoTemporal implements Sueldo {
    double cotizacionTemporal = 3;
    double particular;

    public SueldoTemporal(double monto) {
        this.particular = monto;
    }
    
    @Override
    public double calcularSueldo(Empleado empleado) {
        return ((empleado.getTiempoContratadoAnios() * cotizacionTemporal))*particular;
    }
    
}