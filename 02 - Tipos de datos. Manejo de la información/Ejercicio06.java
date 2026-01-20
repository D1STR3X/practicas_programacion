package rios.bermejo.gonzalo;

public class Ejercicio06 {
	
	//Igual que el ejercicio anterior, pero indicar, además cualquier posible error de compilación o ejecución que se pudiera dar, en las siguientes operaciones de “casting”:
	public static void main (String[]args) {
	
		int aa = (int)2.0;
		//No hay error de compilación ni ejecución, el resultado es un 2 de tipo int
		int bb = (int)2000000;
		//No hay error de compilación ni ejecución, el resultado es un 2000000 de tipo int
		int cc= (int)2000000L;
		//No hay error de compilación ni ejecución, el resultado es un 2000000 de tipo int
		int dd = (int)20000000000L;
		//No hay error de compilación ni ejecución, el resultado es un 20000000000L de tipo int
		float ee = (float)2000000L;
		//No hay error de compilación ni ejecución, el resultado es un 2000000.0f de tipo float
		String ff = "2" + 3 + 4;
		//No hay error de compilación ni ejecución, el resultado es un 234 de tipo string
		String gg = 2 + "3" + 4;
		//No hay error de compilación ni ejecución, el resultado es un 234 de tipo string
		String hh = 2 + 3 + "4";
		//No hay error de compilación ni ejecución, el resultado es un 54 de tipo string
	}
}