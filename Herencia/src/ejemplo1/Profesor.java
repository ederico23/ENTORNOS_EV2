package ejemplo1;

public class Profesor extends Persona{
	private String asig;
	public Profesor(String nombre, String apellido, int anyoNacimiento) {
		super (nombre, apellido, anyoNacimiento);
	}
	
	public void ponAsig(String asig) {
		this.asig = asig;
	}

	public void imprime() {
		System.out.println("asignatura:<s " + this.asig);
	}
}
