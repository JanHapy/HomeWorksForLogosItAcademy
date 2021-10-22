package ua.lviv.lgs.task15;

import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println();
		System.out.println("Enter 1, to register a new member of the zoo club");
		System.out.println("Enter 2, to add an animal to a zoo club member");
		System.out.println("Enter 3, to remove an animal from a zoo club member");
		System.out.println("Enter 4, to remove a member from the zoo club");
		System.out.println("Enter 5, to remove the introduced animal from all members of the zoo");
		System.out.println("Enter 6, to display the zoo club on the screen");
		System.out.println("Enter 0, to exit the program");	
	}
	
	public static void main(String[] args) {
		
		ZooClub zooClub = new ZooClub();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			menu();
			
			switch (sc.nextInt()) {
				
			case 1: {
				zooClub.addZooClubMember();
				break;
			}
			
			case 2: {
				zooClub.addAnimal();
				break;
			}
			
			case 3: {
				zooClub.removeAnimal();
				break;
			}
			
			case 4: {
				zooClub.removeZooClubMember();
				break;
			}
			
			case 5: {
				zooClub.removeAnimalFromAllMembers();
				break;
			}
			
			case 6: {
				zooClub.viewZooClub();
				break;
			}
			
			case 0: {
				System.exit(0);
				break;
			}
			
			default: {
				System.out.println("Enter number from 0 to 6!");
				break;
			}	
			
			}
		}
	}

}
