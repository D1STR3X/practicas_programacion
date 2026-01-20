package figuras;

public class triangulo implements figura {
    private double base;
    private double altura;

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void area() {
    	System.out.println(((double)Math.round(((base * altura) / 2) * 100.0)) / 100.0);
    }
    
    public String toString() {
        return "(T) " + base + ", " + altura;
    }
}