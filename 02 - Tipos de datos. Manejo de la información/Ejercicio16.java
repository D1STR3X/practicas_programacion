package rios.bermejo.gonzalo;

public class Ejercicio16 {

	//Crear un método “par” que reciba un número entero y devuelva un boolean que valga true si el número introducido es par, y false en caso contrario
	public static boolean par(int número) { //Método par que recibe un número y dice si es (true) o no es (false) par
		boolean resultado = (número % 2 == 0) ? true : false; //Utilizamos un operador ternario para identificar si el número es par
		return resultado;
	}
	public static void main(String[]args) {
		boolean resultado = par(25); //Invocamos el método par desde main
		System.out.println(resultado);
	}
}
