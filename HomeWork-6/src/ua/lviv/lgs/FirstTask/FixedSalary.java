package ua.lviv.lgs.FirstTask;

public class FixedSalary extends Worker implements Salary {

private double monthRate;
	
	public FixedSalary(String name, double monthRate) {
		super(name);
		this.monthRate = monthRate;
	}
	
	@Override
	public void salary() {
		double salary = this.monthRate;
		System.out.println("Worker's salary " + super.getName() + " is " + salary + " uah.");
	}
}
