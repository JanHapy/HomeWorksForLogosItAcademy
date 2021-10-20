package ua.lviv.lgs.Task13;

import java.util.Scanner;

public class Deputat extends Human {

	private String surname;
	private String name;
	private int age;
	private boolean bribeTaker;
	private int sizeBribe;

	public Deputat(String surname, String name, int age, int weight, int height, boolean bribeTaker) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribeTaker = bribeTaker;

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public String bribeTakerToString() {
		if (this.bribeTaker) {
			return "he is bribe taker, ";
		} else {
			return "honest person";
		}
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getSizeBribe() {
		return sizeBribe;
	}

	public void setSizeBribe(int sizeBribe) {
		this.sizeBribe = sizeBribe;
	}

	public void giveBribe() {
		if (this.bribeTaker == false) {
			System.out.println("This deputy does not take bribes");
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter amount of bribe");
			int bribeAmount = sc.nextInt();

			if (bribeAmount > 5000) {
				System.out.println("The police will imprison the deputy");
			} else {
				this.sizeBribe = bribeAmount;
			}
		}
	}

	@Override
	public String toString() {
		return "Deputat = [surname = " + surname + ", name = " + name + ", age = " + age + ", height = "
				+ super.getHeight() + " cm, weight = " + super.getWeight() + " kg, " + bribeTakerToString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
