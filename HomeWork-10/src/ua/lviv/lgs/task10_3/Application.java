package ua.lviv.lgs.task10_3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter text:");
	
		String text = sc.nextLine();
	
		System.out.println("Amount words in text = " + countWords(text));	
	}
	
	
	
	static  int countWords(String text) {
		String textArray[] = text.split(" ");
		int counter = 0;
		
		for (int i = 0; i < textArray.length; i++) {
			if (textArray[i].length() > 1) {
				counter++;
			}
		}
		
		return counter;
	}
	
}
