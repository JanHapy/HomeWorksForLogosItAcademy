package ua.lviv.lgs.task12_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

	private static Scanner sc;

	static void menu() {
		System.out.println();
		System.out.println("Enter 1, to output an array of random cars");
		System.out.println("Enter 2 to fill the array with the same values for a random car");
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		List <WheelMaterial> wheelMaterialList = new ArrayList <WheelMaterial>();

		for (WheelMaterial wheelMaterialvalue : WheelMaterial.values()) {
				wheelMaterialList.add(wheelMaterialvalue);
		}
		
		
		while (true) {
			menu();

			switch (sc.nextInt()) {

			case 1: {

				List <Auto> autoArrayList = new ArrayList<Auto>();

				for (int i = 0; i < getRandomValueFromRange(1, 5); i++) {
					List <Auto> autoArrayList1 = new ArrayList<Auto>();
					for (int j = 0; j < getRandomValueFromRange(1, 5); j++) {
						autoArrayList1.add(new Auto(getRandomValueFromRange(100, 250),
								getRandomValueFromRange(1980, 2021),
								new Wheel(getRandomValueFromRange(35, 50),
										wheelMaterialList.get(getRandomValueFromRange(0, wheelMaterialList.size() - 1)).toString()),
								new Engine(getRandomValueFromRange(2, 12))));
					}
					autoArrayList.addAll(autoArrayList1);
				}

				System.out.println(autoArrayList);

				break;
			}

			case 2: {

				Auto auto = new Auto(getRandomValueFromRange(100, 250), getRandomValueFromRange(1980, 2021),
						new Wheel(getRandomValueFromRange(35, 50),
								wheelMaterialList.get(getRandomValueFromRange(0, wheelMaterialList.size() - 1)).toString()),
						new Engine(getRandomValueFromRange(2, 12)));

				List <Auto> autoArrayList = new ArrayList<Auto>();

			for (int i = 0; i < getRandomValueFromRange(1, 5); i++) {
				autoArrayList.add(auto);
			}

				System.out.println(autoArrayList);

				break;
			}

			default: {
				System.out.println("Entered number must be 1 or 2!");

				break;
			}

			}
		}

	}

	static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}

}
