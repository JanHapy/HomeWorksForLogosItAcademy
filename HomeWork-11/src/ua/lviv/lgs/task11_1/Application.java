package ua.lviv.lgs.task11_1;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Integer[] array = new Integer[getRandomValueFromRange(5,20)];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = getRandomValueFromRange(-1000, 1000);
		}
		
		System.out.println("Source array: " + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Source array, sorted in ascending order: " + Arrays.toString(array));
	
	
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Source array, sorted in ascending order: " + Arrays.toString(array));
	}
	
	static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}
		
		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
	
	
	
	
	
}
