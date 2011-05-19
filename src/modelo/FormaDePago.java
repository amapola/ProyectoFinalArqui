/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HP
 */
public abstract class FormaDePago {
   
    public abstract void enviarCheque();
    public abstract void enviarPapeleta(Sueldo papeleta);
    public void pagar(Sueldo papeleta){
        enviarCheque();
        enviarPapeleta(papeleta);
    }
    public static FormaDePago formaDePago(String formaDePagoString)
    {
        FormaDePago formaDePago = null;
        return formaDePago;
    }
    
}
