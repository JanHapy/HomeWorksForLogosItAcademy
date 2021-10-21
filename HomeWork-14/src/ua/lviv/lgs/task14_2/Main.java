package ua.lviv.lgs.task14_2;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Enter 1, to add a product to the shelf");
		System.out.println("Enter 2, to remove an item from the shelf");
		System.out.println("Enter 3, to replace the item on the shelf");
		System.out.println("Enter 4, to sort the products on the shelf by their name");
		System.out.println("Enter 5, to sort the products on the shelf by their length");
		System.out.println("Enter 6, to sort the products on the shelf by their width");
		System.out.println("Enter 7, to sort the products on the shelf by their weidth");
		System.out.println("Enter 8, to display the product by its order number on the shelf");
		System.out.println("Enter 9, to to exit the program");
		
	}
	
	public static void main(String[] args) {
		Shelff shelf = new Shelff();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			menu();
			
			switch (sc.nextInt()) {
			
			case 1: {
				shelf.addCommodity();
				break;
			}
			
			case 2: {
				shelf.removeCommodity();
				break;
			}
			
			case 3: {
				shelf.replaceCommodity();
				break;
			}
			
			case 4: {
				shelf.sortByName();
				break;
			}
			
			case 5: {
				shelf.sortByLength();
				break;
			}
			
			case 6: {
				shelf.sortByWidth();
				break;
			}
			
			case 7: {
				shelf.sortByWeight();
				break;
			}
			
			case 8: {
				shelf.getCommodity();
				break;
			}
			
			case 9: {
				System.exit(0);
				break;
			}
			
			default: {
				System.out.println("Enter number from 1 to 9!");
				break;
			}
			
			
			}
		}
	}
	
}
