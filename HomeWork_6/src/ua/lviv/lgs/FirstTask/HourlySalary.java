package ua.lviv.lgs.FirstTask;

public class HourlySalary extends Worker implements Salary {
	
	private int monthWorkedHours;	
	private double hourRate;
	
	public HourlySalary(String name, int monthWorkedHours, double hourRate) {
		super(name);
		this.monthWorkedHours = monthWorkedHours;
		this.hourRate = hourRate;
	}
	
	@Override
	public void salary() {
		double salary = this.monthWorkedHours * this.hourRate;
		System.out.println("Worker's salary " + super.getName() + " is " + salary + "uah.");
	}

}
