/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.Coches;

/**
 *
 * @author manuel.benavente
 */
public class CochesVista extends JFrame {
    private JTextField txtId, txtMarca, txtModelo, txtPrecio;
    private JButton btnAgregar, btnEditar, btnEliminar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;


    public CochesVista() {
        setTitle("Gestion de Coches");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(new JLabel("ID:"));
        txtId = new  JTextField();
        panel.add(txtId);

        panel.add(new JLabel("Marca:"));
        txtMarca = new  JTextField();
        panel.add(txtMarca);

        panel.add(new JLabel("Modelo:"));
        txtModelo = new  JTextField();
        panel.add(txtModelo);

        panel.add(new JLabel("Precio:"));
        txtPrecio = new  JTextField();
        panel.add(txtPrecio);

        btnAgregar = new JButton("Agregar");
        btnEditar = new JButton("Editar");
        btnEliminar = new JButton("Eliminar");

        panel.add(btnAgregar);
        panel.add(btnEditar);
        panel.add(btnEliminar);

        add(panel, BorderLayout.NORTH);

        modeloTabla = new DefaultTableModel(new String[]{"ID", "Marca", "Modelo", "Precio"}, 0);
        tabla = new JTable(modeloTabla);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }


    public JTextField getTxtId() { return txtId; }
    public JTextField getTxtMarca() { return txtMarca; }
    public JTextField getTxtModelo() { return txtModelo; }
    public JTextField getTxtPrecio() { return txtPrecio; }

    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnEditar() { return btnEditar; }
    public JButton getBtnEliminar() { return btnEliminar; }

    public void mostrarCoches(List<Coches> lista) {
        modeloTabla.setRowCount(0);
        for (Coches c : lista) {
            modeloTabla.addRow(new Object[]{c.getId(), c.getMarca(), c.getModelo(), c.getPrecio()});
        }
    }
}