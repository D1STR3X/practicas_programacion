package rios.bermejo.gonzalo;

public class Ejercicio26 {

	/*Mostrar los números primos existentes entre el número 2 y el 100.
	○ Hacer un método “boolean primo(int n)” que devuelva true si n es primo y false en caso contrario. Apoyarse en el código anterior
	○ Hacer un bucle de 1 a 100 que imprima el número en función de si es primo o no.*/
	public static boolean primo (int n) {
		boolean parar = true;
		int divisor = 2;
		if (n == 1) //Los números primos deben tener 2 divisores, que correspoden al mismo número y al 1. Aunque el 1 cumple con ambas condiciones, solo tiene un divisor por lo que no es primo.
			{
				parar = false;
			}
		while (parar && divisor < n) //Usamos un while que funcione mientras el divisor sea menor al número (porque él siempre será divisor) y parar sea verdadero
		{
			if (n % divisor == 0) //Un if para los casos donde dividir n1 entre el divisor de igual a 0, es decir, que el divisor actual es un divisor de n1
				{
					parar = false;
				}
			divisor++; //Aumenta el valor actual de divisor en 1
		}
		return parar;
	}
	
	
	
	
	public static void main (String[] args) {
		boolean respuesta = true;
		int numero;
		for (numero = 1; numero <= 100; numero++) 
		{
			respuesta = primo(numero);
			if (respuesta == true) 
				{
					System.out.println(numero);
				}
		}
	}
}