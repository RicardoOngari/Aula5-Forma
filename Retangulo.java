package entidade;

public class Retangulo extends Base {
	
	public Retangulo(double altura, double largura, String forma) {
	super(altura, largura, largura, "Retângulo");
	}
	
	public double calcularArea() {
		return getAltura() * getLargura();
	}
	
	
	
}