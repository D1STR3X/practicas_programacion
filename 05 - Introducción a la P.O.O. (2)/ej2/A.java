package ej2;

public class A {
	private static int contador = 0;
	
	public A() {
		contador++;
	}
	
	public static int numeroDeObjetos() {
		return contador;
	}
}