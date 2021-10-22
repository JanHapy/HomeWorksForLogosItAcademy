package ua.lviv.lgs.task15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {

	Map <Person, ArrayList<Animal>> zooClub = new HashMap<Person, ArrayList<Animal>>();
	
	public void addZooClubMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of zooclub's member: ");
		String name = sc.next();
		System.out.println("Enter age of zooclub's member: ");
		int age = sc.nextInt();
		
		Person zooClubMember = new Person(name, age);
		
		zooClub.put(zooClubMember, new ArrayList<Animal>());
		System.out.println(zooClubMember.toString() + " successfully registered in the zoo club!");
	}
	
	
	public void addAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of zooclub's member: ");
		String name = sc.next();
		System.out.println("Enter age of zooclub's member: ");
		int age = sc.nextInt();
		
		boolean typeCorrect = isZooClubMemberExists(zooClub, name, age);
		
		if (typeCorrect) {
			System.out.println("Enter species of Animal: ");
			String species = sc.next();
			System.out.println("Enter name for Animal: ");
			String animalName = sc.next();
			
			Animal newAnimal = new Animal(species, animalName);
			
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
			
			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
				
				if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
					ArrayList<Animal> animalList = nextMember.getValue();
					
					animalList.add(newAnimal);
					System.out.println("Animal " + newAnimal.toString() + " successfully added to a member " + nextMember.getKey() + "!");
				}
			}
		} else {
			System.out.println("Wrong entered data! Try again!");
		}
	}
	
	public void removeAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of zooclub's member: ");
		String name = sc.next();
		System.out.println("Enter age of zooclub's member:");
		int age = sc.nextInt();
		
		boolean typeCorrect = isZooClubMemberExists(zooClub, name, age);
		
		if (typeCorrect) {
			System.out.println("Enter species of Animal: ");
			String species = sc.next();
			System.out.println("Enter name for Animal: ");
			String animalName = sc.next();
			
			boolean typeAnimalCorrect = isZooClubMemberAnimalExists(zooClub, name, age, species, animalName);
			
			if (typeAnimalCorrect) {
				Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
				
				while (iterator.hasNext()) {
					Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
					
					if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
						ArrayList<Animal> animalList = nextMember.getValue();
						
						Iterator<Animal> iterator2 = animalList.iterator();
						
						while (iterator2.hasNext()) {
							Animal next2 = iterator2.next();
							
							
							if (next2.getSpecies().equalsIgnoreCase(species) && next2.getName().equalsIgnoreCase(animalName)) {
								iterator2.remove();
								System.out.println("Animal " + next2.toString() + " successfully removed from the member " + nextMember.getKey() + "!");
							}
						}
					}
				}
			} else {
				System.out.println("This member of the zoo club does not have an introduced animal!");
			}
			
		} else {
			System.out.println("The entered participant is not a member of the zoo!");
		}
	}
	
	public void removeZooClubMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of zooclub's member: ");
		String name = sc.next();
		System.out.println("Enter age of zooclub's member: ");
		int age = sc.nextInt();
		
		boolean typeCorrect = isZooClubMemberExists(zooClub, name, age);
		
		if (typeCorrect) {
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
			
			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
				
				if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
					iterator.remove();
					System.out.println(nextMember.getKey().toString() + " successfully removed from the zoo!");
				}
			}
		} else {
			System.out.println("The entered participant is not a member of the zoo!");
		}
	}
	
	public void removeAnimalFromAllMembers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter species of Animal: ");
		String species = sc.next();
		
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
			
			ArrayList<Animal> animalList = nextMember.getValue();
			
			Iterator<Animal> iterator2 = animalList.iterator();
			
			while (iterator2.hasNext()) {
				Animal next2 = iterator2.next();
				
				if (next2.getSpecies().equalsIgnoreCase(species) ) {
					iterator2.remove();
					System.out.println("Animal " + next2.toString() + " successfully deleted from the participant " + nextMember.getKey() + "!");
				}
			}
		}
	}
	
	public void viewZooClub() {
		Set<Entry<Person, ArrayList<Animal>>> zooClubMembers = zooClub.entrySet();
		
		System.out.println("The zooclub consists of:");
		for (Entry<Person, ArrayList<Animal>> entry : zooClubMembers) {
			System.out.println("The member " + entry.getKey() + " have " + entry.getValue());
		}
	}
	
	static boolean isZooClubMemberExists(Map<Person, ArrayList<Animal>> zooClub, String name, int age) {
		boolean flag = false;
		
		Set<Entry<Person, ArrayList<Animal>>> zooClubMembers = zooClub.entrySet();
		
		for (Entry<Person, ArrayList<Animal>> entry : zooClubMembers) {
			if (entry.getKey().getName().equalsIgnoreCase(name) && entry.getKey().getAge() == age) {
				flag = true;
			}
		}
		
		return flag;
	}
	
	
	static boolean isZooClubMemberAnimalExists(Map<Person, ArrayList<Animal>> zooClub, String name, int age, String species, String animalName) {
		boolean flag = false;
		
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
			
			if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
				ArrayList<Animal> animalList = nextMember.getValue();
				
				Iterator<Animal> iterator2 = animalList.iterator();
				
				while (iterator2.hasNext()) {
					Animal next2 = iterator2.next();
					
					if (next2.getSpecies().equalsIgnoreCase(species) && next2.getName().equalsIgnoreCase(animalName)) {
						flag = true;
					}
				}
			}
		}
		
		return flag;
	}
	
}
