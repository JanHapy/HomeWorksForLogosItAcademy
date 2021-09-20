package ua.lviv.lgs.Task;

public class PlaneControl {
	public void moveUp() {
		System.out.println("Airplane fly up " + Move.move() + " km.");
	}
	
	public void moveDown() {
		System.out.println("Airplane fly down " + Move.move() + " km.");
	}
	
	public void moveRight() {
		System.out.println("Airplane fly right " + Move.move() + " km.");
	}
	
	public void moveLeft() {
		System.out.println("Airplane fly legt " + Move.move() + " km.");
	}
}
