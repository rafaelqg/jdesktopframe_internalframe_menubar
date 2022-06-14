package Controler;

public class CalculadoraBaskahra {

	public double[] calcula(double a, double b, double c) {
		double delta = b*b - 4* a * c;
		double deltaSquare = Math.sqrt(delta);
		double x1 = (-b + deltaSquare)/(2*a);
		double x2 = (-b - deltaSquare)/(2*a);
		double[] retorno = {x1, x2};
		return retorno;
	}
}
