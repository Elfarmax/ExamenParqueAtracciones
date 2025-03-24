/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParqueAtracciones;

/**
 *
 * @author Raúl de la Rosa
 */
public class Visitante {
    private String nombre;
    private int idVisitante;
    private int edad;

    public Visitante(String nombre, int idVisitante, int edad) {
        this.nombre = nombre;
        this.idVisitante = idVisitante;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getIdVisitante() { return idVisitante; }
    public void setIdVisitante(int idVisitante) { this.idVisitante = idVisitante; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva.");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Visitante " + " Nombre: " + nombre + ", IdVisitante: " + idVisitante + ", Edad: " + edad;
    }
}
