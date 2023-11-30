package Guis;

import datos.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSeleccion extends JFrame implements ActionListener {
	public ventanaSeleccion{
		super("SuperCopa");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	private JTextField nombrePais;
	private JTextField ranking;
	private JButton mostrarJugadores;

}