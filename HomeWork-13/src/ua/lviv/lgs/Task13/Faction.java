package ua.lviv.lgs.Task13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Faction {

	private String nameOfFaction;
	
	public Faction(String nameOfFaction) {
		this.nameOfFaction = nameOfFaction;
	}
	
	public String getNameOfFaction() {
		return nameOfFaction;
	}
	
	public void setNameOfFaction(String nameOfFaction) {
		this.nameOfFaction = nameOfFaction;
	}
	
	ArrayList<Deputat> deputatArray = new ArrayList<Deputat>();
	
	public void addDeputat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter surname of Deputat: ");
		String surname = sc.next();
		System.out.println("Enter name of Deputat: ");
		String name = sc.next();
		System.out.println("Enter age of Deputat: ");
		int age = sc.nextInt();
		System.out.println("Enter height of Deputat: ");
		int height = sc.nextInt();
		System.out.println("Enter weight of Deputat: ");
		int weight = sc.nextInt();
		System.out.println("Does the Deputat take bribes (true / false): ");
		boolean bribeTaker = sc.nextBoolean();
		
		Deputat deputy = new Deputat(surname, name, age, height, weight, bribeTaker);
		
		if (deputy.isBribeTaker()) {
			deputy.giveBribe();
		}
		
		deputatArray.add(deputy);
		System.out.println(deputy.toString() + " successfully added to Faction!");
		
	}
	
	public void removeDeputat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter surname of Deputat");
		String surname = sc.next();
		System.out.println("Enter name of Daputat");
		String name = sc.next();
		
		boolean typeCorrect = isDeputatExists(deputatArray, surname, name);
		
		if(typeCorrect) {
			
			Iterator<Deputat> iterator = deputatArray.iterator();
			
			while (iterator.hasNext()) {
				Deputat nextDeputat = iterator.next();
				
				if (nextDeputat.getSurname().equalsIgnoreCase(surname) && nextDeputat.getName().equalsIgnoreCase(name)) {
					iterator.remove();
					System.out.println(nextDeputat.toString() + " successfully removed from Fraction");
				}
			}
		} else {
			System.out.println("Entered wrong data!");
		}
		
	}
	
	
	public void getBribeTakers() {
		System.out.println("Deputats of Fraction, which take bribes: ");
		for (Deputat deputy : deputatArray) {
			if (deputy.isBribeTaker()) {
				System.out.println(deputy.toString());
			}
		}
	}
	
	public void getLargestBribeTaker() {
		int bribeSize = 0;
		int deputatIndex = -1;
		
		for (int i = 0; i < deputatArray.size(); i++) {
			if (deputatArray.get(i).isBribeTaker()) {
				if (deputatArray.get(i).getSizeBribe() > bribeSize) {
					bribeSize = deputatArray.get(i).getSizeBribe();
					deputatIndex = deputatArray.indexOf(deputatArray.get(i));
				}
			}
		}
		
		if (deputatIndex >= 0) {
			System.out.println( "The biggest bribe-taker of the fraction is " + deputatArray.get(deputatIndex).toString());			
		} else {
			System.out.println("In this fraction no one bribe-takers!");
		}
	}
	
	public void getAllDeputats() {
		System.out.println("Deputats that exist in this fraction: ");
		for (Deputat deputy : deputatArray) {
			System.out.println(deputy.toString());
		}
	}
	
	public void clearFaction() {
		deputatArray.clear();
		System.out.println("All deputats was successfully removed from this fraction!");
	}
	
	
	
	
	
	
	
	static boolean isDeputatExists(ArrayList<Deputat> deputatArray, String surname, String name) {
		boolean flag = false;
		
		for (Deputat deputy : deputatArray) {
			if (deputy.getSurname().equalsIgnoreCase(surname) && deputy.getName().equalsIgnoreCase(name)) {
				flag = true;
			}
		}
		
		return flag;
	}
	
	@Override 
	public String toString() { 
		return "Fraction \"" + nameOfFaction + "\"";
	}
	
	
	
	
	
}

