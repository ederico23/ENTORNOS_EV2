package ejemplo1;

public class Alumno extends Persona {
	private String grupo;
	private char horario;
	
	public Alumno() {}
	
	public Alumno(String nombre, String apellido, int anyoNacimiento) {
		super (nombre, apellido, anyoNacimiento);
		
	}
	
	public void imprime() {
		System.out.println("grupo: " + grupo + " con horario: " + horario);
	}
	
	public void ponGrupo(String grupo, char horario) {
		if (grupo==null || grupo.length()==0) {
			System.out.println("grupo erroneo");
		} else if (horario!='M' && horario!='T') {
			System.out.println("horario erroneo");
		} else {
			System.out.println("grupo: " + grupo + " horario: " + horario);
		}
	}
}
