package personas;

public class Persona {
	private String nombre;
	private int numeroDeLaSuerte;
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumeroDeLaSuerte () {
		return numeroDeLaSuerte;
	}
	
	public void setNumeroDeLaSuerte (int numeroDeLaSuerte) {
		this.numeroDeLaSuerte = numeroDeLaSuerte;
	}
	
	public Persona (String nombre) {
		if (nombre.equals(".")) {
			nombre = "Anónimo";
		}
		this.nombre = nombre;
		this.numeroDeLaSuerte = (int)(Math.random() * 10 + 1);
	}
	
	public void saludar () {
		System.out.println("Hola, soy " + nombre + " y mi número de la suerte es " + numeroDeLaSuerte);
	}
}
