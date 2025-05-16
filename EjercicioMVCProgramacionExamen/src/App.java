/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controlador.*;
import vista.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @@author raul.de1
 */
public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { 
            try {
                // Mostrar un cuadro de dialogo para elegir entre productos o usuarios
                String[] opciones = {"Coches", "Cliente"};
                int seleccion = JOptionPane.showOptionDialog(null,
                        "¿Que vista desesas abrir",
                        "Seleccionar Vista",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null, opciones, opciones[0]);
                
                if (seleccion == 0) {
                    // Si se selecciona "Productos"
                    CochesVista pv = new CochesVista();
                    new CochesMVC(pv);
                    pv.setVisible(true);
                } else if (seleccion == 1) {
                    // Si se selecciona "Usuarios"
                    ClienteVista uv = new ClienteVista();
                    new ClienteMVC(uv);
                    uv.setVisible(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        }
    }
