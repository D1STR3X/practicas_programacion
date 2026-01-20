package rios.bermejo.gonzalo;

public class Ejercicio11 {
	
	/* Hacer un método llamado “saludar”, que reciba un parámetro, llamado “mensaje”, tipo String, y muestre dicho mensaje por la pantalla. Llamar a “saludar” desde main, 3 veces
	 seguidas, para que salude tres veces (con tres mensajes diferentes a tu elección) */
	public static String saludar (String mensaje) { //Método saludar que recibe un mensaje y lo devuelve
			return mensaje;
	}
	public static void main (String[]args) {
		String mensaje;
		mensaje = saludar("Hola"); 	//Invocamos el método saludar desde main
		System.out.println(mensaje);
		mensaje = saludar("Hello"); //Invocamos el método saludar desde main una vez más
		System.out.println(mensaje);
		mensaje = saludar("Adiós"); //Volvemos a invocar el método saludar desde main
		System.out.println(mensaje);
	}
}