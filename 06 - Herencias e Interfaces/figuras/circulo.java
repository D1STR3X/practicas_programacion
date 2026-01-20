package figuras;

public class circulo implements figura {
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void area() {
    	System.out.println((radio * radio) * Math.PI);
    }
    
    public String toString() {
        return "(C) " + radio;
    }
}