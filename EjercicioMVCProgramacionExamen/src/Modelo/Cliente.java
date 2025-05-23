/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author manuel.benavente
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String email;

    public Cliente() {}

    public Cliente(int id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    // Getters y Setters

    public int getId() { return id;}
    public void setId(int id) { this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre; }

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido; }

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email; }

}