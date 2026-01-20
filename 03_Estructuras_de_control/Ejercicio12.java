package rios.bermejo.gonzalo;

public class Ejercicio12 {

	//Mostrar la tabla de multiplicar del 4 (utilizando una sola sentencia “print”);
	public static void main(String[] args) {
		int contador;
		for (contador = 0; contador <= 4*10; contador+=4) //Utilizamos un for para obtener los múltiplos de 4 hasta llegar al 40 (4*10)
		{
			System.out.println(contador); //Imprime los múltiplos de 4 que vamos obteniendo por el for
		}
	}
}