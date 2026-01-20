package rios.bermejo.gonzalo;

public class Ejercicio33 {

	/*Calcular el sig. sumatorio:
	∑𝟏𝟎𝟎
	𝒊=𝟏
	(𝒊²+𝟏)/𝒊*/
	public static void main (String[] args) {
		double acc = 0; //La sumatoria puede tener decimales debido a como está estructurado el término general "(𝒊²+𝟏)/𝒊"
		for (double i = 1; i <= 100; i++) //Usamos un for para realizar la suma de los 100 primeros términos
		{
			acc += (i*i+1)/i; //acc será igual a su último valor sumado al resultado de (𝒊²+𝟏)/𝒊, siendo i el número de término y el "contador" del for
		}
		System.out.println(acc); //Una vez salga del bucle, acc será la sumatoria de los 100 primeros términos del término general "(𝒊²+𝟏)/𝒊"
	}
}
