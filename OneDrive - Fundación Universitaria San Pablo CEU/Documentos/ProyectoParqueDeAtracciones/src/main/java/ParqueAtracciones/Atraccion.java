/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParqueAtracciones;

/**
 *
 * @author Raúl de la Rosa
 */

// Atributos de la clase Atraccion
public class Atraccion {
    private String nombre;
    private int capacidad;
    private String estado;

    // Constructor de la clase Atraccion
    public Atraccion(String nombre, int capacidad, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    // Métodos getter y setter para cada atributo
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) {
        if (capacidad < 1) {
            throw new IllegalArgumentException("La capacidad de 1a persona debe ser mínimo 1. ");
        }
        this.capacidad = capacidad;
    }

    public String getEstado() { return estado; }
    public void setEstado(String estado) {
        if (!estado.equals("Operativa") && !estado.equals("En mantenimiento") && !estado.equals("Cerrada")) {
            throw new IllegalArgumentException("Estado inválido.");
        }
        this.estado = estado;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return " Atraccion " + " Nombre: " + nombre + ", Capacidad: " + capacidad + ", Estado: " + estado;
    }
}
