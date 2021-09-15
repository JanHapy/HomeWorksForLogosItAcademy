package ua.lviv.lgs;

public class Rectangle {
	
	private int height;
	private int width;
	private int perimeter;
	private int area;
	
	public Rectangle (){
		this.height = 2;
		this.width = 3;
		this.perimeter = 2 * (height + width);

	}

	public Rectangle (Integer height, Integer width){
		this.height = height;
		this.width = width;
		this.area = height * width;
		
	}
		
	
	@Override
	public String toString() {
		return "Area of Rectangle = " + area + ", Perimeter of Rectangle = "  + perimeter ;
	}
		
}
