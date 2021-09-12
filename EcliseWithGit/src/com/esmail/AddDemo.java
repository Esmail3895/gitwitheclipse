package com.esmail;

public class AddDemo {

	public static void main(String[] args) {
		//method call
		System.out.println("Sum of two num: "+add(2, 2));
		System.out.println("Substracton of two num: "+sub(2, 2));

	}

//addition of two no in the method
	private static int add(int i, int j) {
		return i+j;
		
	}
	private static int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}
	

}
