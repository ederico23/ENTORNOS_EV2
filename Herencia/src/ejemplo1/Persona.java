package ejemplo1;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected int anyoNacimiento;
	
	public Persona() {}
	
	public Persona(String nombre, String apellido, int anyoNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public void imprime() {
		System.out.println("Datos personaleS: " + this.nombre + this.apellido + ", año: " + this.anyoNacimiento);
	}
}
