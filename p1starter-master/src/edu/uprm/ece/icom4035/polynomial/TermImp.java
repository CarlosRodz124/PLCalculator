package edu.uprm.ece.icom4035.polynomial;

public class TermImp implements Term {
	private double coefficient;
	private int exponent;
	
	public TermImp (double coefficient, int exponent) {
		this.coefficient=coefficient;
		this.exponent=exponent;
	}

	@Override
	public double getCoefficient() {
		
		return this.coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public void setExponent(int exponent) {
		this.exponent = exponent;
	}

	@Override
	public int getExponent() {
		
		return this.exponent;
	}

	@Override
	public double evaluate(double x) {
		
		return Math.pow(x, exponent)*coefficient;
	}

}
