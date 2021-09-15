package ua.lviv.lgs;

public class Main {
	

	public static void main(String[] args) {
		
		
		Robot robot = new Robot ();
		CoffeRobot coffeRobot = new CoffeRobot();
		RobotDancer robotDancer = new RobotDancer();
		RobotCoocker robotCoocker = new RobotCoocker();
		
		robot.work();
		coffeRobot.work();
		robotDancer.work();
		robotCoocker.work();
		
	System.out.println();
		
		Robot [] robotArray = new Robot [4];
		robotArray[0] = robot;
		robotArray[1] = coffeRobot;
		robotArray[2] = robotDancer;
		robotArray[3] = robotCoocker;
		
		for (int i = 0; i < robotArray.length; i++){
            robotArray[i].work();
		}
		
	
	}

}
