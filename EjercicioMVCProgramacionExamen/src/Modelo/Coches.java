/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author manuel.benavente
 */
public class Coches {
    private int id;
    private String marca;
    private String modelo;
    private double precio;

    public Coches() {}

    public Coches(int id, String marca, String modelo, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Getters y Setters

    public int getId() { return id;}
    public void setId(int id) { this.id = id;}

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca; }

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo; }

    public double getPrecio() {return precio; }
    public void setPrecio(double precio) { this.precio = precio;}

}