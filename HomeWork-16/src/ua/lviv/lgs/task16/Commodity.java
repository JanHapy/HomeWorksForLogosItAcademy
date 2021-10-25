package ua.lviv.lgs.task16;

public class Commodity {
	
	public String name;
	private int length;
	private int width;
	private int weight;
	
	public Commodity() {
	}
	
	public Commodity(String name) {
		this.name = name;
	}
	
	public Commodity(String name, int length, int width) {
		this.name = name;
		this.length = length;
		this.width = width;
	}
	
	public Commodity(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	public Commodity(String name, int length, int width, int weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void putOnShelf(int shelfNumber) {
		System.out.println("Product placed on shelf # " + shelfNumber);
	}
	
	public void giveForSafeKeeping(String person) {
		System.out.println("Person " + person + "accepted the goods for response");
	}
	
	@Override
	public String toString() {
		return "Product " + name + " (" + length + " x " + width + " cm, " + weight + " kg)";
 	}

}
