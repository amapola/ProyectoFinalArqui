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
public class EmpleadoPorHoras extends Empleado{
    private ArrayList<TarjetaDiaria> tarjetas = new ArrayList<TarjetaDiaria>();
      
    public void llenarTarjetaDiaria(Date fecha, int cantidadHoras)
    {
        TarjetaDiaria tarjeta = new TarjetaDiaria(this.idEmpleado, fecha, cantidadHoras);
        tarjeta.guardar();
    }
    
}
