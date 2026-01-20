package metodos;

public class metodos {
	
	public static boolean esVocal (char letra) {
		boolean esVocal;
		switch ((int)letra) {
			case 65:
			case 69:
			case 73:
			case 79:
			case 85:
			case 97:
			case 101:
			case 105:
			case 111:
			case 117:
				esVocal = true;
				break;
			default:
				esVocal = false;
		}
		return esVocal;
	}
	
	public static boolean esMayuscula (char letra) {
		boolean esMayuscula;
		if ((int) letra >= 65 && (int) letra <= 90) {
			esMayuscula = true;
		}
		else {
			esMayuscula = false;
		}
		return esMayuscula;
	}
	
	public static boolean esMinuscula (char letra) {
		boolean esMinuscula;
		if ((int) letra >= 97 && (int) letra <= 122) {
			esMinuscula = true;
		}
		else {
			esMinuscula = false;
		}
		return esMinuscula;
	}

	public static char aMayuscula (char letra) {
		char mayuscula;
		if ((int) letra >= 65 && (int) letra <= 90)	{
			mayuscula = letra;
		}
		else {
			mayuscula = (char) ((int) letra - 32);
		}
		return mayuscula;
	}

	public static char aMinuscula (char letra) {
		char minuscula;
		if ((int) letra >= 97 && (int) letra <= 122)	{
			minuscula = letra;
		}
		else {
			minuscula = (char) ((int) letra + 32);
		}
		return minuscula;
	}

	public static int numMinusculas (String texto) {
		int contadorMinusculas = 0;
		for (int contador = 0; contador < texto.length(); contador++) {
			char letra = texto.charAt(contador);

			if (esMinuscula(letra)) {
				contadorMinusculas++;
			}
		}
		return contadorMinusculas;
	}

	public static int numMayusculas (String texto) {
		int contadorMayusculas = 0;
		for (int contador = 0; contador < texto.length(); contador++) {
			char letra = texto.charAt(contador);

			if (esMayuscula(letra)) {
				contadorMayusculas++;
			}
		}
		return contadorMayusculas;
	}

	public static int numVocales (String texto) {
		int contadorVocales = 0;
		for (int contador = 0; contador < texto.length(); contador++) {
			char letra = texto.charAt(contador);

			if (esVocal(letra)) {
				contadorVocales++;
	        }
		}
		return contadorVocales;
	}

	public static int numVecesChar (String texto, char letraElegida) {
		int contadorChar = 0;
		for (int contador = 0; contador < texto.length(); contador++) {
			char letra = texto.charAt(contador);

			if ((int) letra == (int) letraElegida) {
				contadorChar++;
			}
		}
		return contadorChar;
	}

	public static String quitaEspacios (String texto) {
		String resultado = "";
		for (int contador = 0; contador < texto.length(); contador++) {
			char letra = texto.charAt(contador);

			if (letra != ' ') {  
				resultado += letra;
			}
		}
		return resultado;
	}
	
	public static String reves (String texto) {
		String resultado = "";
		for (int contador = texto.length() - 1; contador >= 0; contador--) {
			char letra = texto.charAt(contador);
			resultado += letra;
		}
		return resultado;
	}
	
	public static String charAMay (String texto, char letraElegida) {
		String resultado = "";
		char may = aMayuscula(letraElegida);
	    char min = aMinuscula(letraElegida);
		for (int contador = 0; contador < texto.length(); contador++) {
			char letra = texto.charAt(contador);
			
			if (letra == min || letra == may) {
				resultado += aMayuscula(letra);
			}
			else {
				resultado += letra;
			}
		}
		return resultado;
	}
	
	public static String vocAMay (String texto) {
		String resultado = "";
		for (int contador = 0; contador < texto.length(); contador++) {
			char letra = texto.charAt(contador);
			if (esVocal(letra) && esMinuscula(letra)) {
	            resultado += aMayuscula(letra);
	        } else {
	            resultado += letra;
	        }
		}
		return resultado;
	}
	
	public static String vocalizacion (String texto, char letraElegida) {
		String resultado = "";
		for (int contador = 0; contador < texto.length(); contador++) {
			char letra = texto.charAt(contador);
			if (esVocal(letra)) {
	            resultado += letraElegida;
	        } 
			else {
	            resultado += letra;
	        }
		}
		return resultado;
	}
	
	public static String generoYNumero (String palabra) {
	    palabra = palabra.toLowerCase();
	    String resultado = "desconocido";
	    if (palabra.endsWith("os") || palabra.endsWith("o")) {
	        resultado = "masculino";
	        if (palabra.endsWith("s")) {
	        	resultado += " plural";
	        }
	        else {
	        	resultado += " singular";
	        }
	    }
	    if (palabra.endsWith("as") || palabra.endsWith("a")) {
	        resultado = "femenino";
	        if (palabra.endsWith("s")) {
	        	resultado += " plural";
	        }
	        else {
	        	resultado += " singular";
	        }
	    }
	    return resultado;
	}
	
	public static String quitaTildes (String texto) {
		String resultado = "";
		for (int contador = 0; contador < texto.length(); contador++) {
			char letra = texto.charAt(contador);
			switch ((int)letra) {
				case 193:
					resultado += "A";
					break;
				case 201:
					resultado += "E";
					break;
				case 205:
					resultado += "I";
					break;
				case 211:
					resultado += "O";
					break;
				case 218:
					resultado += "U";
					break;
				case 225:
					resultado += "a";
					break;
				case 233:
					resultado += "e";
					break;
				case 237:
					resultado += "i";
					break;
				case 243:
					resultado += "o";
					break;
				case 250:
					resultado += "u";
					break;
				default:
					resultado += letra;
			}
		}
		return resultado;
	}

	public static boolean esPalindromo (String texto) {
		boolean esPalindromo;

		texto = quitaEspacios(texto);
		texto = quitaTildes(texto);
		texto = texto.toLowerCase();

		String textoReverse = reves(texto);

		if (texto.equals(textoReverse)) {
			esPalindromo = true;
		}
		else {
			esPalindromo = false;
		}
		return esPalindromo;
	}
}
