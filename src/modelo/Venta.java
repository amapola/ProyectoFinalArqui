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
public class Venta {
    String idEmpleado;
    Date fecha;
    Double monto;
    
    public Venta(Date fecha, Double monto)
    {
        this.fecha = fecha;
        this.monto = monto;
    }
    public void asignarAEmpleado(String idEmpleado)
    {
        this.idEmpleado = idEmpleado;
    }
    public void guardar()
    {
        //llamar a DATOS
    }
}
