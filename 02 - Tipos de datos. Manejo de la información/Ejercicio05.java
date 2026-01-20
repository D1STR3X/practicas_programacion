package rios.bermejo.gonzalo;

public class Ejercicio05 {
	
	/*Indicar el tipo y valor de las siguientes expresiones y subexpresiones, así como las conversiones automáticas de tipo realizadas, asumiendo que existen las 
	siguientes variables: int i=1; long g=1; float f=1.0f; double d=1.0;boolean b=true;*/
	int i=1; long g=1; float f=1.0f; double d=1.0;boolean b=true;

	// a. 1 + 2L + 3f + 4.0
	double aa = 1 + 2L + 3f + 4.0;
	//1 es un int con valor 1 , 2L es un long con valor 2, 3f es un float con valor 3.0 y 4.0 es un double con valor 4.0. El resultado es 10.0 de tipo double
	
	//b. ((1+2)*i)>(f+2.0)
	boolean bb = ((1+2)*i)>(f+2.0);
	//1 y 2 son int con valor 1 y 2 respectivamente, i es un int con valor 1, f es un float con valor 1.0 y 2.0 es un double con valor 2.0. El resultado es de tipo boolean y falso 
	//porque "3 > 3.0" es falso
	
	// c. (1.0+i)/g
	double cc = (1.0+i)/g;
	//1.0 es un double con valor 1.0, i es un int con valor 1 y g es un long con valor 1. El resultado es 2.0 de tipo double 
	
	// d. (2+3*7>2*10&&3!=10)?(2+f):(5.0f)
	float dd = (2+3*7>2*10&&3!=10)?(2+f):(5.0f);
	//2, 3, 7 y 10 son int con valores 2, 3, 7 y 10 respectivamente, f es un float de valor 1.0 y 5.0f es un float de valor 5.0. El resultado es 3.0f de tipo float
}
