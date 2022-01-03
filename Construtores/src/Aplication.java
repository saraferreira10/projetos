
public class Aplication {

	public static void main(String[] args) {

		Retangulo r1 = new Retangulo();
		double area1 = r1.calcArea();
		System.out.println(area1);
		
		Retangulo r2 = new Retangulo(2, 5);
		double area2 = r2.calcArea();
		System.out.println(area2);
		
		Quadrado q = new Quadrado(6);
		System.out.println(q.calcArea());
	}
	


}
