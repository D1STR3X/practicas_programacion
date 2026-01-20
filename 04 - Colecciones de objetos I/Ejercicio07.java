package rios.bermejo.gonzalo;

public class Ejercicio07 {

	/*Hacer un programa que haga lo mismo que el anterior, pero que obtenga a través de “args” de main, el número “n”, así como los elementos a mostrar.
	Ejemplo de argumento de entrada: 3 a b c d e f g h i j k l m n o
	Salida del programa: a d g j m */
	public static void main(String[] args) {
		
		//Usamos un for que aumenta el contador en 3, "saltando" de 3 en 3 elementos y mostrándolos
		for (int cont = 0; cont + 1 < 16; cont += 3)
		{
			System.out.println(args[cont + 1]);
		}
	}
}