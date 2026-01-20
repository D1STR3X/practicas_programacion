package rios.bermejo.gonzalo;

public class Ejercicio10 {

	//Mostrar los números IMPARES que haya (en orden) desde el 1 hasta el 10 (utilizando una sola sentencia “print”)
	public static void main(String[] args) {
		int contador = 1;
		while (contador <= 10) //Usamos un while para obtener los números del 1 al 10
		{
			if (contador % 2 != 0) //Usamos un if para obtener los números que al ser dividos entre 2 nos den un resto distinto de 0, es decir, que son impares
				{
					System.out.println(contador); //Si cumple la condición, imorimimos el número
				}
			contador++; //Aumenta el valor actual del contador en 1
		} //Se puede obtener un resultado similar sustituyendo el contador++ por contador += 2, en cuyo caso el if ya no sería necesario
	}
}
