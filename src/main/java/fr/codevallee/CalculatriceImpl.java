package fr.codevallee;

public class CalculatriceImpl implements Calculatrice {

	public double addition(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public double multiplication(double c, double d) {
		// TODO Auto-generated method stub
		return c * d;
	}

	public double soustraction(double e, double f) {
		// TODO Auto-generated method stub
		return e - f;

	}

	public double division(double g, double h) {
		// TODO Auto-generated method stub
		if (h == 0) {
			throw new ArithmeticException();
		}
		else {
		return g / h;
		}
	}
}
