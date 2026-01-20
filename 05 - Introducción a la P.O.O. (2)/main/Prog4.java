package main;

import ej3.CestaCompra;

public class Prog4 {
	public static void main(String[] args) {
		CestaCompra cesta1 = new CestaCompra(23, 12);
		CestaCompra cesta2 = new CestaCompra(19, 7);
        CestaCompra cesta3 = new CestaCompra(42, 15);
        CestaCompra cesta4 = new CestaCompra(93, 17);
        
        System.out.println("CESTA 1:");
        cesta1.getPesos();
        System.out.println();
        
        System.out.println("CESTA 2:");
        cesta2.getPesos();
        System.out.println();
        
        System.out.println("CESTA 3:");
        cesta3.getPesos();
        System.out.println();
        
        System.out.println("CESTA 4:");
        cesta4.getPesos();
	}
}
