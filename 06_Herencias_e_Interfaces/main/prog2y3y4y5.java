package main;

import java.util.Arrays;
import persona.persona;

public class prog2y3y4y5 {

	static void burbujaPorDni(persona[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = 0; j < v.length - i - 1; j++) {
				if (v[j].getDni().compareTo(v[j + 1].getDni()) > 0) {
					persona aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	}
	
	static void burbujaPorApellidoNombre(persona[] v) {
	    for (int i = 0; i < v.length - 1; i++) {
	        for (int j = 0; j < v.length - i - 1; j++) {
	            int cmp = v[j].getApellido().compareTo(v[j + 1].getApellido());
	            if (cmp == 0) {
	                cmp = v[j].getNombre().compareTo(v[j + 1].getNombre());
	            }
	            if (cmp > 0) {
	                persona aux = v[j];
	                v[j] = v[j + 1];
	                v[j + 1] = aux;
	            }
	        }
	    }
	}
	
	static void sortArrays(persona[] v) {
		Arrays.sort(v);
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		persona[] personas = new persona[n];

		int index = 1;
		for (int i = 0; i < n; i++) {
			String dni = args[index++];
			String nombre = args[index++];
			String apellido = args[index++];
			personas[i] = new persona(dni, nombre, apellido);
		}

		for (persona p : personas) {
			System.out.println(p);
		}
		System.out.println();

		burbujaPorDni(personas);

		for (persona p : personas) {
			System.out.println(p);
		}
		System.out.println();
		
		burbujaPorApellidoNombre(personas);

		for (persona p : personas) {
			System.out.println(p);
		}
		System.out.println();
		
		sortArrays(personas);

		for (persona p : personas) {
			System.out.println(p);
		}
	}
}