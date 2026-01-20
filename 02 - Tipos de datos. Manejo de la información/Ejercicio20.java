package rios.bermejo.gonzalo;

public class Ejercicio20 {

	//Dado un número de horas, minutos y segundos, mostrar el número de segundos totales
	public static void main(String[]args) {
		int horas = 5;
		int minutos = 56;
		int segundos = 43;
		System.out.println(horas + "h " + minutos + "m " + segundos + "s"); //El tiempo en horas, minutos y segundos
		int totalSegundos = horas * 3600 + minutos * 60 + segundos; //El número total de segundos en ese tiempo
		System.out.println(totalSegundos + "s");
	}
}