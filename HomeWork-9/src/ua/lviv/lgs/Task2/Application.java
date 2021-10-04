package ua.lviv.lgs.Task2;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws MyException{
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Enter first number: ");
		
		if(sc.hasNextInt()) {
			a = sc.nextInt();
			
			System.out.println("Enter second number: ");
			
			if (sc.hasNextInt()) {
				b = sc.nextInt();
				
				Methods calc = new Methods(a,b);
				
				Methods.viewCalcREsult(calc.plus());
				Methods.viewCalcREsult(calc.minus());
				Methods.viewCalcREsult(calc.multiply());
				Methods.viewCalcREsult(calc.devide());
				
			} else {
				System.out.println("Error! Print whole number");
			}							
		} else {
			System.out.println("Error! Print whole number");
		}
	}
}
