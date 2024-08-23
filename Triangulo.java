package entidade;

public class Triangulo extends Base{

	public Triangulo(double altura, double base, String forma) {
	super(altura, base, base, "Triângulo");
}
	
	public double calcularArea() {
		return getAltura() * getBase();
	}
}