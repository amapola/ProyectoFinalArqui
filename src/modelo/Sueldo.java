/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author HP
 */
public abstract class Sueldo {
   public Empleado empleado;
   private Date fecha;
   private Double monto;
   private Double cargoPorServicios;
   private Double cargoPorAporteJubilacion;
   
   public abstract Double CalcularSueldoEmpleado(); 
   public abstract void imprimir();
    
}
