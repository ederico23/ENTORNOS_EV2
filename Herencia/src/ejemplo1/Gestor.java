package ejemplo1;

public class Gestor {

	public static void main(String[] args) {
		Persona p = new Persona("Ana" , " Garcia", 2001);
		Alumno a = new Alumno("Pedro" , " Perez", 2000);
		Persona pr = new Profesor("Angela ", " Garcia" , 1950);
		((Profesor)pr).ponAsig("base de datos"); 
	
		
		System.out.println("persona: ");
		p.imprime();
	
	
		
		//((Persona) a).imprime();
		a.ponGrupo("67" , 'T');
		pr.imprime();
	}

}
