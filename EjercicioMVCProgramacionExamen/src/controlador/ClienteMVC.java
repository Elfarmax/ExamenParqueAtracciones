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
public class ClienteMVC {
    private ClienteDAO dao;
    private ClienteVista vista;

    public ClienteMVC(ClienteVista vista) throws SQLException {
        this.vista = vista;
        this.dao = new ClienteDAO();
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
            String nombre = vista.getTxtNombre().getText();
            String apellido = vista.getTxtApellido().getText();
            String email = vista.getTxtEmail().getText();
            Cliente c = new Cliente(0, nombre, apellido, email);
            dao.agregar(c);
            listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void editar() {
        try {
            int id = Integer.parseInt(vista.getTxtId().getText());
            String nombre = vista.getTxtNombre().getText();
            String apellido = vista.getTxtApellido().getText();
            String email = vista.getTxtEmail().getText();
            Cliente c = new Cliente(id, nombre, apellido, email);
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
            List<Cliente> lista = dao.listar();
            vista.mostrarClientes(lista);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}