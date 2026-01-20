package rios.bermejo.gonzalo;

public class Ejercicio32 {

	/*Mostrar los 5 primeros términos de la serie: xi = xi-1 * 3 sabiendo que x1=1*/
	public static void main (String[] args) {
		int x = 1; //Nos dicen que el primer valor de la serie es 1, así que a x le asignamos el valor 1
		for (int contador = 1; contador <= 5; contador++) //Usamos un for para repetir el bucle 5 veces
		{
			System.out.println(x); //Imprimimos el valor de x
			x *= 3; //La serie sigue la regla xi = xi-1 * 3, pero como no necesitamos almacenar el valor de cada número de la serie podemos usar x *= 3, con lo que cada nuevo valor de x será igual que el anterior multiplicado por 3
		}
	}
}