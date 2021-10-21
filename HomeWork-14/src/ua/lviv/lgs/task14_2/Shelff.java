package ua.lviv.lgs.task14_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Shelff {

	ArrayList<Commodity> shelf = new ArrayList<Commodity>();
	
	public void addCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of product: ");
		String name = sc.next();
		System.out.println("Enter legnth of product, cm: ");
		int length = sc.nextInt();
		System.out.println("Enter width of product, cm: ");
		int width = sc.nextInt();
		System.out.println("Enter weight of product, g: ");
		int weight = sc.nextInt();
		
		Commodity commodity = new Commodity (name, length, width, weight);
		
		shelf.add(commodity);
		System.out.println("Product " + commodity.toString() + " successfully added to the shelf!");
	}
	
	public void removeCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of product: ");
		String name = sc.next();
		System.out.println("Enter legnth of product, cm: ");
		int length = sc.nextInt();
		System.out.println("Enter width of product, cm: ");
		int width = sc.nextInt();
		System.out.println("Enter weight of product, g: ");
		int weight = sc.nextInt();
		
		boolean typeCorrect = isCommodityExists(shelf, name, length, width, weight);
		
		if (typeCorrect) {
			
			Iterator <Commodity> iterator = shelf.iterator();
			
			while (iterator.hasNext()) {
				Commodity nextCommodity = iterator.next();
				
				if (nextCommodity.getName().equalsIgnoreCase(name) && nextCommodity.getLength() == length 
						&& nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
					iterator.remove();
					System.out.println("Product " + nextCommodity.toString() + " successfully removed from the shelf!");
				}
			}
		} else {
			System.out.println("Wrong entered data!");
		}
		
	}
	
	public void replaceCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of product: ");
		String name = sc.next();
		System.out.println("Enter legnth of product, cm: ");
		int length = sc.nextInt();
		System.out.println("Enter width of product, cm: ");
		int width = sc.nextInt();
		System.out.println("Enter weight of product, g: ");
		int weight = sc.nextInt();
		
		boolean typeCorrect = isCommodityExists(shelf, name, length, width, weight);
		
		if (typeCorrect) {
			for (Commodity commodity : shelf) {
				if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
						&& commodity.getWidth() == width && commodity.getWeight() == weight) {
					System.out.println("Enter name of product: ");
					String newName = sc.next();
					System.out.println("Enter new length of product, cm:");
					int newLength = sc.nextInt();
					System.out.println("Enter width of product, cm: ");
					int newWidth = sc.nextInt();
					System.out.println("Enter weight of product, g: ");
					int newWeight = sc.nextInt();
					commodity.setName(newName);
					commodity.setLength(newLength);
					commodity.setWidth(newWidth);
					commodity.setWeight(newWeight);
					System.out.println("The entered product has been successfully replaced by " + commodity.toString() + "!");
					
				}
					
			}
		} else {
			System.out.println("Wrong entered data!");
		}
		
	}
	
	public void sortByName() {
		System.out.println("Before sorting, the goods were placed on the shelf in the following order: ");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
		
		Collections.sort(shelf, new CommodityNameComparator());
		System.out.println("After sorting, the order of the items on the shelf will be as follows:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
	}
	
	public void sortByLength() {
		System.out.println("Before sorting, the goods were placed on the shelf in the following order: ");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
		
		Collections.sort(shelf, new CommodityLengthComparator());
		System.out.println("After sorting, the order of the items on the shelf will be as follows:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
	}
	
	public void sortByWidth() {
		System.out.println("Before sorting, the goods were placed on the shelf in the following order: ");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
		
		Collections.sort(shelf, new CommodityWidthComparator());
		System.out.println("After sorting, the order of the items on the shelf will be as follows:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
	}
	
	public void sortByWeight() {
		System.out.println("Before sorting, the goods were placed on the shelf in the following order: ");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
		
		Collections.sort(shelf, new CommodityWeightComparator());
		System.out.println("After sorting, the order of the items on the shelf will be as follows:");
		for (Commodity commodity : shelf) {
			System.out.println(commodity);
		}
	}
	
	public void getCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order number of the item on the shelf: ");
		int i = sc.nextInt();
		
		if (i < 0 || i > (shelf.size() - 1)) {
			System.out.println("There is no product with such a serial number on the shelf!");
		} else {
			System.out.println("Under the serial number " + i + " on the shelf there is " + shelf.get(i).toString());
		}
	}
	
	static boolean isCommodityExists(ArrayList<Commodity> shelf, String name, int length, int width, int weight) {
		boolean flag = false;
		
		for (Commodity commodity : shelf) {
			if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
					&& commodity.getWidth() == width && commodity.getWeight() == weight) {
				flag = true;
			}
		}
		
		return flag;
	} 
	
}
