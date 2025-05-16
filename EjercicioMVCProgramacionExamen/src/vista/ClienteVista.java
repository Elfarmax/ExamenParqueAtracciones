/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

/**
 *
 * @author manuel.benavente
 */
public class ClienteVista extends JFrame {
    private JTextField txtId, txtNombre, txtApellido, txtEmail;
    private JButton btnAgregar, btnEditar, btnEliminar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;


    public ClienteVista() {
        setTitle("Gestion de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(new JLabel("ID:"));
        txtId = new  JTextField();
        panel.add(txtId);

        panel.add(new JLabel("Nombre:"));
        txtNombre = new  JTextField();
        panel.add(txtNombre);

        panel.add(new JLabel("Apellido:"));
        txtApellido = new  JTextField();
        panel.add(txtApellido);

        panel.add(new JLabel("Email:"));
        txtEmail = new  JTextField();
        panel.add(txtEmail);

        btnAgregar = new JButton("Agregar");
        btnEditar = new JButton("Editar");
        btnEliminar = new JButton("Eliminar");

        panel.add(btnAgregar);
        panel.add(btnEditar);
        panel.add(btnEliminar);

        add(panel, BorderLayout.NORTH);

        modeloTabla = new DefaultTableModel(new String[]{"ID", "Nombre", "Apellido", "Email"}, 0);
        tabla = new JTable(modeloTabla);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }


    public JTextField getTxtId() { return txtId; }
    public JTextField getTxtNombre() { return txtNombre; }
    public JTextField getTxtApellido() { return txtApellido; }
     public JTextField getTxtEmail() { return txtEmail; }

    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnEditar() { return btnEditar; }
    public JButton getBtnEliminar() { return btnEliminar; }

    public void mostrarClientes(List<Cliente> lista) {
        modeloTabla.setRowCount(0);
        for (Cliente c : lista) {
            modeloTabla.addRow(new Object[]{c.getId(), c.getNombre(), c.getApellido(), c.getEmail()});
        }
    }
}