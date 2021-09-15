package ua.lvivl.lgs.SecondTask.interface2;

public class MyCalculator implements ua.lvivl.lgs.SecondTask.interface1.Numerable {
	
	double a,b;
	
	public MyCalculator() {
		
	}
	
	public MyCalculator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double plus() {
		return this.a + this.b;
	}
	
	@Override
	public double minus() {
		return this.a - this.b;
	}
	
	@Override
	public double multiply() {
		return this.a * this.b;
	}
	
	@Override 
	public double devide() {
		return this.a / this.b;
	}
	
	static void viewResult(double result) {
		System.out.println("Result of operation equal = " + result);
	}
}
