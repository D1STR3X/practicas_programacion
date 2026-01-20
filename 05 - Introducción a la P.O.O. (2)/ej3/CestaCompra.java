package ej3;

public class CestaCompra {

	private Naranja n;
	private Limon l;
	
	public CestaCompra () {
		n = new Naranja(50);
		l = new Limon(30);
	}
	
	public CestaCompra (int pesoN, int pesoL) {
		n = new Naranja(pesoN);
		l = new Limon(pesoL);
	}
	
	public void comerFruta() {
		n.comer();
		l.comer();
	}
	
	public void getPesos () {
		System.out.println("Peso naranja: " + n.getPeso() + " g");
		System.out.println("Peso limón: " + l.getPeso() + " g");
	}
}
