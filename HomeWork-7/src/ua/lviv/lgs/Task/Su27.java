package ua.lviv.lgs.Task;

public class Su27 extends Plane implements TurboAcceleration, NuclearStrike, StealthTechnology {
	
	int maxSpeed;
	String color;
	
	public Su27(int length, int height, int weight, int maxSpeed, String color) {
		super(length, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	
	@Override
	public void turboAccelerate() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
		System.out.println("Turbo Boost started. Airplane speed is " + accSpeed + " km/h.");
	}
	
	@Override
	public void becomeStealth() {
		int visibleTime = (int) (Math.random() * 1000);
		System.out.println("Stealth technology launched. The plane disappeared from the radar on " + visibleTime + " sec.");
	}
	
	@Override
	public void nuclearStrike() {
		int bombsAmount = (int) (Math.random() * (10 + 1));
		System.out.println("Nuclear strike function activated. The object will be dropped " + bombsAmount + " warheads.");
	}

}
