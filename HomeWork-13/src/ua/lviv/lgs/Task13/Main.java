package ua.lviv.lgs.Task13;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Enter 1, to add a faction to the Verkhovna Rada");
		System.out.println("Enter 2, to remove a faction from the Verkhovna Rada");
		System.out.println("Enter 3, to withdraw all factions in the Verkhovna Rada");
		System.out.println("Enter 4, to clear the entered fraction");
		System.out.println("Enter 5, to withdraw the entered faction");
		System.out.println("Enter 6, to add a deputy to the faction");
		System.out.println("Enter 7, чтобы удалить депутата из фракции");
		System.out.println("Enter 8, чтобы вывести список взяточников");
		System.out.println("Enter 9, чтобы вывести самого большого взяточника");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.nextInt()) {

			case 1: {
				SupremeCouncil.getInstance().addFaction();
				break;
			}

			case 2: {
				SupremeCouncil.getInstance().removeFaction();
				break;
			}

			case 3: {
				SupremeCouncil.getInstance().getAllFaction();
				break;
			}

			case 4: {
				SupremeCouncil.getInstance().clearFaction();
				break;
			}

			case 5: {
				SupremeCouncil.getInstance().clearFaction();
				break;
			}

			case 6: {
				SupremeCouncil.getInstance().addDeputatToFaction();
				break;
			}

			case 7: {
				SupremeCouncil.getInstance().removeDeputatFromFaction();
				break;
			}

			case 8: {
				SupremeCouncil.getInstance().getBribeTakersFromFaction();
				break;
			}

			case 9: {
				SupremeCouncil.getInstance().getLargestBribeTakerFromFaction();
				break;
			}

			default: {
				System.out.println("Wrong entered data! Enter number from 1 to 9!");
				break;
			}

			}
		}

	}
}
