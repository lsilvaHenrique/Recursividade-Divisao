package controller;

public class DiviController {
	
	public double Divi (double dividendo, double divisor) {
		if (dividendo < divisor) {
			return dividendo;
		}
		return Divi(dividendo - divisor, divisor);
	}
}
