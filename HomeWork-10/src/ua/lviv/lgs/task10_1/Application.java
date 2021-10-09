package ua.lviv.lgs.task10_1;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word with 5 letters: ");
		
		String str = sc.next();
		
		if (str.length() == 5) {
			String arr[] = str.split("");
			
			if ((arr[0].equalsIgnoreCase(arr[4])) && (arr[1].equalsIgnoreCase(arr[3]))) {
				System.out.println("Entered word: " + str + " is palidrome!");
			} else {
				System.out.println("Entered word: " + str + " isn't palidrome!");
			}
		} else {
			System.out.println("You should enter word with 5 letters!");
		}
	}
}
