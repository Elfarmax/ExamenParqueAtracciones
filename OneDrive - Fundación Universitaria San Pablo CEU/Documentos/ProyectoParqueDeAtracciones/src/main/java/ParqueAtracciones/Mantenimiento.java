/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParqueAtracciones;

/**
 *
 * @author Raúl de la Rosa
 */
public class Mantenimiento extends Empleado {
    private String areaResponsable;

    public Mantenimiento(String nombre, int idEmpleado, String puesto, String areaResponsable) {
        super(nombre, idEmpleado, puesto);
        this.areaResponsable = areaResponsable;
    }

    public String getAreaResponsable() { return areaResponsable; }
    public void setAreaResponsable(String areaResponsable) {
        if (!areaResponsable.equals("Mecánica") && !areaResponsable.equals("Eléctrica") && !areaResponsable.equals("Estructura")) {
            throw new IllegalArgumentException("Área responsable inválida.");
        }
        this.areaResponsable = areaResponsable;
    }

    @Override
    public String toString() {
        return "Mantenimiento " + "nombre: " + getNombre() + ", idEmpleado: " + getIdEmpleado() + ", puesto: " + getPuesto() + ", areaResponsable: " + areaResponsable;
    }
}
