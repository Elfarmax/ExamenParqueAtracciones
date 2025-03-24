/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParqueAtracciones;

/**
 *
 * @author Raúl de la Rosa
 */

// Atributos de la clase Empleado
public class Empleado {
    private String nombre;
    private int idEmpleado;
    private String puesto;

    // Métodos getter y setter para cada atributo
    public Empleado(String nombre, int idEmpleado, String puesto) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
    }

    // Métodos getter y setter para cada atributo
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) {
        if (!puesto.equals("Operador") && !puesto.equals("Mantenimiento") && !puesto.equals("Ventas")) {
            throw new IllegalArgumentException("Puesto inválido.");
        }
        this.puesto = puesto;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Empleado " + "Nombre: " + nombre + ", IdEmpleado: " + idEmpleado + ", Puesto: " + puesto;
    }
}
