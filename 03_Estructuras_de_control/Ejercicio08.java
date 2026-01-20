package rios.bermejo.gonzalo;

public class Ejercicio08 {

	//Mostrar los números desde el 10 hasta el 1 (utilizando una sola sentencia “print”)
	public static void main(String[] args) {
		int contador = 10;
		while (contador >= 1) //Le asignamos al contador el valor de 10 y hacemos que el while nos muestre los números del 10 al 1
		{
			System.out.println(contador); //Imprime el valor actual del contador
			contador--; //Disminuye el valor actual del contador en 1
		}
	}
}