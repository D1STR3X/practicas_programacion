package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Fechas {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce la fecha (día):");
		int dia = leer.nextInt();
		System.out.println("Introduce la fecha (mes):");
		int mes = leer.nextInt();
		System.out.println("Introduce la fecha (año):");
		int año = leer.nextInt();

		LocalDate fechaIngresada = LocalDate.of(año, mes, dia);
		LocalDate hoy = LocalDate.now();

		Period periodo = Period.between(fechaIngresada, hoy);

		System.out.println("Han transcurrido:");
		System.out.println(periodo.getYears() + " años, " + periodo.getMonths() + " meses, y " + periodo.getDays() + " días");
	}
}