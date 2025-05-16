/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.*;
import vista.*;
import java.util.List;
import java.sql.*;

/**
 *
 * @author raul.de1
 */
public class CochesMVC {
    private CochesDAO dao;
    private CochesVista vista;

    public CochesMVC(CochesVista vista) throws SQLException {
        this.vista = vista;
        this.dao = new CochesDAO();
        init();
    }

    private void init() {
        vista.getBtnAgregar().addActionListener(e -> agregar());
        vista.getBtnEditar().addActionListener(e -> editar());
        vista.getBtnEliminar().addActionListener(e -> eliminar());
        listar();
    }

    private void agregar() {
        try {
            String marca = vista.getTxtMarca().getText();
            String modelo = vista.getTxtModelo().getText();
            double precio = Double.parseDouble(vista.getTxtPrecio().getText());
            Coches c = new Coches(0, marca, modelo, precio);
            dao.agregar(c);
            listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void editar() {
        try {
            int id = Integer.parseInt(vista.getTxtId().getText());
            String marca = vista.getTxtMarca().getText();
            String modelo = vista.getTxtModelo().getText();
            double precio = Double.parseDouble(vista.getTxtPrecio().getText());
            Coches c = new Coches(id, marca, modelo, precio);
            dao.actualizar(c);
            listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void eliminar() {
        try {
            int id = Integer.parseInt(vista.getTxtId().getText());
            dao.eliminar(id);
            listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void listar() {
        try {
            List<Coches> lista = dao.listar();
            vista.mostrarCoches(lista);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}