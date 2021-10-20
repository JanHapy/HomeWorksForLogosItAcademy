package ua.lviv.lgs.Task13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class SupremeCouncil {

	private static SupremeCouncil instance = new SupremeCouncil();
	
	private SupremeCouncil() {
		
	}
	
	public static SupremeCouncil getInstance() {
		if (instance == null) {
			instance = new SupremeCouncil();
		} 
		return instance;
	}
	
	ArrayList<Faction> supremeCouncilArray = new ArrayList<Faction>();
	
	public void addFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Faction: ");
		String factionName = sc.next();
		
		Faction faction = new Faction(factionName);
		
		supremeCouncilArray.add(faction);
		System.out.println(faction.toString() + " successfully added to the Supreme Council!");
	}
	
	public void removeFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Faction: ");
		String factionName = sc.next();
		
		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);
		
		if (typeCorrect) {
			
			Iterator <Faction> iterator = supremeCouncilArray.iterator();
			
			while (iterator.hasNext()) {
				Faction nextFaction = iterator.next();
				
				if (nextFaction.getNameOfFaction().equalsIgnoreCase(factionName)) {
					iterator.remove();
					System.out.println(nextFaction.toString() + " successfully removed from the Supreme Council!");
				}
			}
			
		} else {
			System.out.println("Wrong entered data!");
		}
	}
	
	public void getAllFaction() {
		System.out.println("All fraction in Sepreme Council: ");
		for (Faction faction : supremeCouncilArray) {
			System.out.println(faction.toString());
		}
	}
	
	public void clearFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction: ");
		String factionName = sc.next();
		
		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);
		
		if(typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getNameOfFaction().equalsIgnoreCase(factionName)) {
					faction.clearFaction();
				}
			}
		} else {
			System.out.println("Wrong entered data!");
		}
	}
	
	public void getFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Faction: ");
		String factionName = sc.next();
		
		for (Faction faction : supremeCouncilArray) {
			if (faction.getNameOfFaction().equalsIgnoreCase(factionName)) {
				System.out.println(faction.toString());
				faction.getAllDeputats();
			}
		}
	}
	
	public void addDeputatToFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Faction: ");
		String factionName = sc.next();
		
		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);
		
		if (typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getNameOfFaction().equalsIgnoreCase(factionName)) {
					faction.addDeputat();
				}
			}
		} else {
			System.out.println("Wrong entered data!");
		}
	}
	
	public void removeDeputatFromFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction: ");
		String factionName = sc.next();
		
		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);
		
		if(typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getNameOfFaction().equalsIgnoreCase(factionName)) {
					faction.removeDeputat();
				}
			}
		} else {
			System.out.println("Wrong entered data!");
		}
	}
	
	public void getBribeTakersFromFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction: ");
		String factionName = sc.next();
		
		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);
		
		if(typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getNameOfFaction().equalsIgnoreCase(factionName)) {
					faction.getBribeTakers();
				}
			}
		} else {
			System.out.println("Entered wrong data!");
		}
	}
	
	
	public void getLargestBribeTakerFromFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction: ");
		String factionName = sc.next();
		
		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);
		
		if(typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if(faction.getNameOfFaction().equalsIgnoreCase(factionName)) {
					faction.getLargestBribeTaker();
				}
			}
		} else {
			System.out.println("Wrong entered data!");
		}
	}
	
	public void getAllDupatatsFromFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction: ");
		String factionName = sc.next();
		
		boolean typeCorrect = isFactionExists(supremeCouncilArray, factionName);
		
		if(typeCorrect) {
			for (Faction faction : supremeCouncilArray) {
				if (faction.getNameOfFaction().equalsIgnoreCase(factionName)) {
					faction.getAllDeputats();
				}
			}
		} else {
			System.out.println("Wrong entered data!");
		}
	}
	
	
	
	
	static boolean isFactionExists(ArrayList<Faction> supremeCouncilArray, String factionName) {
		boolean flag = false;
		
		for (Faction faction : supremeCouncilArray) {
			if (faction.getNameOfFaction().equalsIgnoreCase(factionName)) {
				flag = true;
			}
		}
		
		return flag;
	}
	
}
