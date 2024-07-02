package br.com.erudio.math;

public class SimpleMath {

	
	public Double Sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public Double Minus(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
		
	public Double Multiply(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}
		
	public Double Divide(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}
	
	public Double Avg(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}
	
	public Double Sqrt(Double numberOne) {
		return Math.sqrt(numberOne);
	}
}