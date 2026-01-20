package persona;

public class persona implements Comparable<persona> {
	private String dni;
    private String nombre;
    private String apellido;

    public persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getDni() { 
    	return dni; 	
    }
    
    public String getNombre() { 
    	return nombre; 
    }
    
    public String getApellido() { 
    	return apellido; 
    }

    @Override
    public int compareTo(persona o) {
        return this.dni.compareTo(o.dni);
    }
    
    public String toString() {
        return "(" + dni + ") " + nombre + " " + apellido;
    }
}
