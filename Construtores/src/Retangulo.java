
public class Retangulo {
	
	private double largura;
	private double altura;
	
	public Retangulo() {
		this(2, 5);
		
		//largura = 4;
		//altura = 3;
	}
	
	public Retangulo(double larg, double alt) {
		this.largura = larg;
		this.altura = alt;
	}
	
	public double calcArea() {
		return largura * altura;
	}
	
}


