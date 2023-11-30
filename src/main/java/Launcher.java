package Main;
package datos.DatosJugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Launcher extends JFrame implements ActionListener {
    private JTextField texto1;
    private JLabel imagenLabel;

    public Launcher() {
        super("Super copa 2023");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel etiqueta = new JLabel("Selecciones", SwingConstants.CENTER);
        texto1 = new JTextField("Ingrese Seleccion");
        JButton boton1 = new JButton("Mostrar Imagen");
        JButton boton2 = new JButton("Salir");

        imagenLabel = new JLabel();
        imagenLabel.setBounds(170, 300, 250, 50);

        etiqueta.setBounds(200, 50, 200, 50);
        texto1.setBounds(170, 100, 250, 40);
        boton1.setBounds(170, 200, 250, 40);
        boton2.setBounds(170, 250, 250, 40);

        texto1.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);

        panel.add(etiqueta);
        panel.add(texto1);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(imagenLabel);

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Mostrar Imagen")) {
            mostrarImagenDesdeZip(texto1.getText());
        } else if (e.getActionCommand().equals("Salir")) {
            dispose();
            System.exit(0);
        }
    }

    private void mostrarImagenDesdeZip(String seleccion) {

        String rutaImagenEnZip = seleccion.toLowerCase() + "aus.png";

        try (ZipFile zipFile = new ZipFile("datos.zip")) {
            ZipEntry entry = zipFile.getEntry(rutaImagenEnZip);
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                ImageIcon icon = new ImageIcon(String.valueOf(inputStream));
                imagenLabel.setIcon(icon);
            } else {
                JOptionPane.showMessageDialog(this, "Imagen no encontrada para la selección: " + seleccion, "Error", JOptionPane.E catch (
                IOException String e;
                e){
                    throw new RuntimeException(e);
                }