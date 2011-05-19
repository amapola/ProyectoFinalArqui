/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class EmpleadoFijo extends Empleado{
    boolean conComision;
    // terminar constructor
    public EmpleadoFijo(String idEmpleado, String nombreCompleto, int telefono,String direccion, Double sueldoFijo, String formaDePago, boolean conComision)
    {
        this.conComision = conComision;
        setArgumentosDeEmpleado(idEmpleado, nombreCompleto, telefono, direccion, sueldoFijo, formaDePago);
        
    }
    public boolean trabajaConComision()
    {
        return conComision;
    }

    public ArrayList<Venta> getVentas()
    {
        ArrayList<Venta> ventas = null;
        //LLamar a datos
        return ventas;
    }
   
            

}
