package ua.lviv.lgs.Task;

public abstract class Plane {
	
	int length;
	int height;
	int weight;
	
	private PlaneControl planeControl = new PlaneControl();
	
	public Plane(int length, int height, int weight) {
		super();
		this.length = length;
		this.height = height;
		this.weight = weight;
	}
	
	public void startEngines() {
		int countdown = 20 + (int) (Math.random() * (68 + 1));
		System.out.println("Start engines. Take off through " + countdown + " sec.");
	}
	
	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("I take off. An airplane with full tanks will pass " + distance + " m.");
	}
	
	public void landingPlane() {
		System.out.println("Landing. I'm starting to decline ...");
	}
	
	void moveUp() {
		planeControl.moveUp();
	}
	
	void moveDown() {
		planeControl.moveDown();
	}

	void moveRight() {
		planeControl.moveRight();
	}

	void moveLeft() {
		planeControl.moveLeft();
	}


}
