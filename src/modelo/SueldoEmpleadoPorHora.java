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
public class SueldoEmpleadoPorHora extends Sueldo{

    private float porcentaje;
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   /* public Double CalcularSueldoEmpleado(ArrayList<TarjetaDiaria> tarjetas) {
        Double sueldoFijo = this.empleado.getSueldoFijo();
        Double sueldoDiario = 0.0;
        for(TarjetaDiaria td:tarjetas) {
            sueldoDiario += (sueldoFijo*td.getHorasTrabajadas())+ (td.getHorasExtras()*porcentaje/100);
        }
        return sueldoDiario;
    }*/

    @Override
    public Double CalcularSueldoEmpleado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
