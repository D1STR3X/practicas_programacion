package rios.bermejo.gonzalo;

public class Ejercicio14 {

	//Mostrar la tabla de multiplicar de los 10 primeros números (utilizando una sola sentencia “print”)
	public static void main(String[] args) {
		for (int n1 = 1; n1 <= 10; n1++) //Utilizamos un for para obtener los números del 1 al 10, valores que serán asignados a n1
		{
			for (int n2 = 0; n2 <= n1*10; n2+=n1) //Utilizamos otro for para obtener los múltiplos de n1 hasta llegar a n1*10, valores que serán asignados a n2
			{
				System.out.println(n2); //Imprimimos los múltiplos de n1 que vamos obteniendo por el for
			}
		}
	}
}