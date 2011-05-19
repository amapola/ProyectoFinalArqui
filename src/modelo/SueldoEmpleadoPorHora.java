/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class SueldoEmpleadoPorHora extends Sueldo {

    private ArrayList<TarjetaDiaria> tarjetas;
    private double porcentaje = 1.5;
//Añadir attributos del padre en el constructor
    public SueldoEmpleadoPorHora(ArrayList<TarjetaDiaria> tarjetas, double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
        this.tarjetas = tarjetas;
    }

    public void generarPapeletaDePago() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Double CalcularSueldoEmpleado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
