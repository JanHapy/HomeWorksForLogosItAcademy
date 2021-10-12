package ua.lviv.lgs.task11_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println();
		System.out.println("Enter 1, to output an array of random cars");
		System.out.println("Enter 2 to fill the array with the same values for a random car");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		WheelMaterial wheelMaterial[] = WheelMaterial.values();

		while (true) {
			menu();

			switch (sc.nextInt()) {

			case 1: {

				Auto autoArray[][] = new Auto[getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];

				for (int i = 0; i < autoArray.length; i++) {
					for (int j = 0; j < autoArray[i].length; j++) {
						autoArray[i][j] = new Auto(getRandomValueFromRange(100, 250),
								getRandomValueFromRange(1980, 2021),
								new Wheel(getRandomValueFromRange(35, 50),
										wheelMaterial[getRandomValueFromRange(0, wheelMaterial.length - 1)].toString()),
								new Engine(getRandomValueFromRange(2, 12)));
					}
				}

				System.out.println(Arrays.deepToString(autoArray));

				break;
			}

			case 2: {

				Auto auto = new Auto(getRandomValueFromRange(100, 250), getRandomValueFromRange(1980, 2021),
						new Wheel(getRandomValueFromRange(35, 50),
								wheelMaterial[getRandomValueFromRange(0, wheelMaterial.length - 1)].toString()),
						new Engine(getRandomValueFromRange(2, 12)));

				Auto autoArray[] = new Auto[getRandomValueFromRange(1, 5)];

				Arrays.fill(autoArray, auto);

				System.out.println(Arrays.deepToString(autoArray));

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
