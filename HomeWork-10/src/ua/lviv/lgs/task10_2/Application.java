package ua.lviv.lgs.task10_2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text:");
		
		String text = sc.nextLine();
		
		System.out.println(replaceVowels(text));
	}
	
	static String replaceVowels(String text) {
		char textArray[] = text.toCharArray();
		char vowelArray[] = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
		
		for (int i = 0; i < textArray.length; i++) {
			for (int j = 0; j < vowelArray.length; j++) {
				if (textArray[i] == vowelArray[j]) {
					textArray[i] = '-';
				}
			}
		}
		
		String newText = new String(textArray);
		return newText;
	}
	
	
}
