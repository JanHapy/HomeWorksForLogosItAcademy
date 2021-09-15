package ua.lviv.lgs;

public class Robot {

	private String name;
	private String act;
	
		
	public Robot(String name, String act) {
		this.name = name;
		this.act = act;
	}
	
	public Robot() {
		this.name = "Robot";
		this.act = "просто працюю";
	}

		
	public void work () {
		System.out.println("Я " + this.name + " - я " + this.act + "!");
	}
	
	
	
}
