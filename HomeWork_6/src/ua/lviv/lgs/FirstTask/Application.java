package ua.lviv.lgs.FirstTask;

public class Application {
	public static void main(String[] args) {
		FixedSalary ID_1 = new FixedSalary("Yan", 15000);
		HourlySalary ID_2 = new HourlySalary("Dima", 275, 40);
		
		ID_1.salary();
		ID_2.salary();
	}
}
