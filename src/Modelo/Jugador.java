package Modelo;

public class Jugador {
	private String nombre;
	private int numero;
	private String posicion;

	public Jugador(String nombre, int numero, String posicion){
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.posicion = posicion;
	}
	public String getNombre(){
		return nombre;
	}

	public int getNumero(){
		return numero;
	}

	public void setNombre(String nombre){
		this.nombre =nombre;

	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void editarJugadores() {
		try (BufferedReader reader = new BufferedReader(new FileReader("jugadores.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {

				String[] datos = line.split(",");
				if (datos.length == 3) {

					String nombre = datos[0].trim();
					int numero = Integer.parseInt(datos[1].trim());
					String posicion = datos[2].trim();

					System.out.println("Nombre: " + nombre);
					System.out.println("Número: " + numero);
					System.out.println("Posición: " + posicion);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

	public void guardarJugadores() {
		// TODO - implement Jugador.guardarJugadores
		throw new UnsupportedOperationException();
	}

}