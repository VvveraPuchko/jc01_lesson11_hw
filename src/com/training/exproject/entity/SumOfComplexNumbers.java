package com.training.exproject.entity;

public class SumOfComplexNumbers {
	public static void main(String[] args) {
		ComplexNumber n1 = new ComplexNumber();
		n1.firstComp = 4;
		n1.secondComp = 5;

		System.out.println("1-e Комплексное число: " + n1.firstComp + " + " + n1.secondComp + "i");
		
		ComplexNumber n2 = new ComplexNumber();
		
		n2.firstComp = 8;
		n2.secondComp = 17;
		System.out.println("2-e Комплексное число: " + n2.firstComp + " + " + n2.secondComp + "i");
		
		ComplexNumber n3 = sum(n1,n2);
		
		System.out.println("Комплексное число в результате сложения: " + n3.firstComp + " + " + n3.secondComp + "i");
		
	}
	
	public static ComplexNumber sum(ComplexNumber number1, ComplexNumber number2) {
		ComplexNumber number = new ComplexNumber();
		
		int comp1 = number1.firstComp + number2.firstComp;
		int comp2 = number1.secondComp + number2.secondComp;
		
		number.firstComp = comp1;
		number.secondComp = comp2;
		
		return number;
	
	}

}
