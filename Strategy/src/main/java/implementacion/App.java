package implementacion;

import implementacion.models.Empleado;
import implementacion.models.SueldoFijo;
import implementacion.models.SueldoTemporal;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Empleado gaspar = new Empleado("Gaspar", new SueldoFijo(20000));
        System.out.println("El empleado " + gaspar.getNombre() + " va a cobrar: " + gaspar.calcularSueldo());

        Empleado huenu = new Empleado("Huenu", new SueldoTemporal(20000));
        System.out.println("El empleado " + huenu.getNombre() + " va a cobrar: " + huenu.calcularSueldo());

        
    }
}
