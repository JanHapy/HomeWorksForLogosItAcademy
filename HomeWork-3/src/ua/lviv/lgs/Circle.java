package ua.lviv.lgs;

public class Circle {
	
	private double Radius;
	private double Diameter;
	
	
	public Circle (double Radius,double Diameter) {

		double area = Diameter * Diameter / 4 * 3.14;
		System.out.println("Area equal " + area);
		
		double height = 2 * 3.14 * Radius;
		System.out.println("Height equal " + height);
	}



	@Override
	public String toString() {
		return "";
	}



	public double getRadius() {
		return Radius;
	}



	public void setRadius(double radius) {
		Radius = radius;
	}



	public double getDiameter() {
		return Diameter;
	}



	public void setDiameter(double diameter) {
		Diameter = diameter;
	}

	// Circle [Area of Circle =" + area + ", Height= " + height + "]
}


