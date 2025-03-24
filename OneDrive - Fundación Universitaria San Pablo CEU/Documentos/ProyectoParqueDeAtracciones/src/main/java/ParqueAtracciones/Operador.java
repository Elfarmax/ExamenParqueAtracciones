/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParqueAtracciones;

/**
 *
 * @author Raúl de la Rosa
 */

// Clase
public class Operador extends Empleado {
    private Atraccion atraccionAsignada;
    
// Constructor
    public Operador(String nombre, int idEmpleado, String puesto, Atraccion atraccionAsignada) {
        super(nombre, idEmpleado, puesto);
        this.atraccionAsignada = atraccionAsignada;
    }
    
// Métodos getter y setter 
    public Atraccion getAtraccionAsignada() { return atraccionAsignada; }
    public void setAtraccionAsignada(Atraccion atraccionAsignada) {
        if (atraccionAsignada == null) {
            throw new IllegalArgumentException("La atracción asignada no puede ser nula.");
        }
        this.atraccionAsignada = atraccionAsignada;
    }
// Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Operador " + "nombre: " + getNombre() + ", idEmpleado: " + getIdEmpleado() + ", puesto: " + getPuesto() + ", atraccionAsignada=" + atraccionAsignada;
    }
}
