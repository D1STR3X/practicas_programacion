package rios.bermejo.gonzalo;

public class Ejercicio06 {

	//Mostrar los 10 primeros números (utilizando una sola sentencia “print”)
	public static void main(String[] args) {
		int contador = 1;
		while (contador <= 10) //Con un while creamos un contador sencillo del 1 al 10
		{
			System.out.println(contador); //Imprime el valor actual del contador
			contador++; //Aumenta el valor del contador en 1
		}
	}
}