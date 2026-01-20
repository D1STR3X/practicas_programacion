package rios.bermejo.gonzalo;

public class Ejercicio07 {

	//Mostrar los números desde el 5 hasta el 10 (utilizando una sola sentencia “print”)
	public static void main(String[] args) {
		int contador = 5;
		while (contador <= 10) //Asignamos a contador el valor de 5 para que el while nos muestre los números del 5 al 10
		{
			System.out.println(contador); //Imprime el valor actual del contador
			contador++; //Aumenta el valor del contador en 1
		}
	}
}
