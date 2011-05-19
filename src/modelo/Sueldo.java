/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
/**
 *
 * @author HP
 */
public abstract class Sueldo {
   public double sueldoFijo;
   private Calendar fecha;
   private double monto;
   private double cargoPorServicios;
   private double cargoPorAporteJubilacion;
   
   public abstract Double CalcularSueldoEmpleado(); 
   public abstract void generarPapeletaDePago();
    
}
