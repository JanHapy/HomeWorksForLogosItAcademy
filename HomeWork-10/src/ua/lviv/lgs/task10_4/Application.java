package ua.lviv.lgs.task10_4;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		
		String text = sc.nextLine();
		String textArray[] = text.split("[.!?]");
		
		viewMostUsedWord(textArray[0]);
		
	}
	
	static void viewMostUsedWord(String text) {

		String newText = deleteNonLiteralSymbols(text);
		String textArray[] = newText.toLowerCase().split(" ");

		
		int indexArray[] = { 0, -1 };
		int counter = 0;

		for (int i = 0; i < textArray.length; i++) {

			

			
			if (indexArray[1] < 0) {
				counter = 1;
			}
			
			
			else if (!textArray[indexArray[0]].equals(textArray[i])) {
				counter = 1;
			}
			
			else {
				continue;
			}

			for (int j = i + 1; j < textArray.length; j++) {

				if (textArray[i].equals(textArray[j])) {
					counter++;
				}
			}

			if (indexArray[1] <= counter) {
				indexArray[0] = i;
				indexArray[1] = counter;
			}
		}

		System.out.println(
				"—амое повтор€ющеес€ слово: " + textArray[indexArray[0]] + " (встречаетс€ " + indexArray[1] + " раз)");
	}

	
	static String deleteNonLiteralSymbols(String text) {

		String newText = text.replaceAll("[.,:;!?@#$%^&*-_(){}<>]", "");
		return newText;
	}
	
}
