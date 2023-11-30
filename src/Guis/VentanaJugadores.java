package Main;
package datos.DatosJugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJugadores extends JFrame implements ActionListener {
	public VentanaJugadores() {
		super("Jugadores");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel etiqueta = new JLabel("Selecciones", SwingConstants.CENTER);

		JButton boton1 = new JButton("Editar");
		JButton boton2 = new JButton("Guardar");

		etiqueta.setBounds(200, 50, 200, 50);
		boton1.setBounds(170, 200, 250, 40);
		boton2.setBounds(170, 250, 250, 40);
		boton3.setBounds(170, 250, 250, 40);

		texto1.addActionListener(this);
		texto2.addActionListener(this);
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);

		panel.add(etiqueta);
		panel.add(texto1);
		panel.add(texto2);
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);

		add(panel);

		setVisible(true);
	}

	private void initComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JLabel etiqueta = new JLabel("Jugadores", SwingConstants.CENTER);
		JLabel etiqueta2 = new JLabel("Editar Jugadores: ");

		busqueda = new JTextField(20);
		JButton botonBuscar = new JButton("Editar");
		resultado = new JTextArea();

		panel.add(etiqueta);
		panel.add(etiqueta2);
		panel.add(busqueda);
		panel.add(botonBuscar);
		panel.add(resultado);

		add(panel);

		botonBuscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buscarProducto();
			}

		});
	}
	private void buscarProducto() {
		String titulo = busqueda.getText();
		List<MaterialBiblioteca> resultados = biblioteca.buscarPorTitulo(titulo);
		resultado.setText("");

		System.out.println("Título de búsqueda: " + titulo);
		System.out.println("Número de resultados: " + resultados.size());

		for (MaterialBiblioteca material : resultados) {
			resultado.append(material.toString() + "\n");
		}
	}
	private void mostrarCatalogoEnInterfaz() {
		resultado.setText(""); // Limpiar el área de resultados
		List<MaterialBiblioteca> catalogo = biblioteca.getCatalogo();

		for (MaterialBiblioteca material : catalogo) {
			resultado.append(material.toString() + "\n");
		}
	}



}
