package ua.lviv.lgs.task17;

public class Main {
	
	public static void main(String[] args) {
		
		Integer[] array = {1, 43, -2, 34, 9, 17, -82, 1, 6, 55};
		
		Collection collection = new Collection(array);
		
		System.out.println("Display an array from beginning to end, replacing odd elements with null:");
		Iterator iteratorForward  = collection.createForwardIterator();
		
		while (iteratorForward.hasNext()) {
			Integer next = iteratorForward.next();
			
			
			if (next % 2 != 0) {
				System.out.println("null");
			} else {
				System.out.println(next);
			}
		}
		
		System.out.println();
		
		
		System.out.println("We display the array one element from the end to the beginning:");
		Iterator iteratorBackward = collection.createBackwardIterator();
		
		while (iteratorBackward.hasNext()) {
			Integer next = iteratorBackward.next();
			
			System.out.println(next);
		}
		
		System.out.println();
		
		System.out.println("Display every third odd array element from end to beginning:");
		Iterator iteratorAnonymous = collection.createAnonymousIterator();
		
		int i = 1;
		while (iteratorAnonymous.hasNext()) {
			Integer next = iteratorAnonymous.next();
			
			if (i % 3 == 0) {
				if (next % 2 != 0) {
					System.out.println(next);
				}
			}
			
			i++;
		}
		
		
		System.out.println();
		
		
		System.out.println("Display every fifth even element minus 100 of the array from beginning to end:");
		Iterator iteratorLocal = collection.createLocalIterator();
		
		int j = 1;
		while (iteratorLocal.hasNext()) {
			Integer next = iteratorLocal.next();
			
			if(j % 5 == 0) {
				if (next % 2 == 0) {
					System.out.println(next - 100);
				}
			}
			
			j++;
		}
		
		System.out.println();
		
		System.out.println("We display every second even element of the array from beginning to end as odd:");
		Iterator iteratorStatic = Collection.createStaticIterator();
		
		int k = 1;
		while (iteratorStatic.hasNext()) {
			Integer next = iteratorStatic.next();
			
			if (k % 2 == 0) {
				if (next % 2 == 0) {
					System.out.println(next + 1);
				}
			}
			
			k++;
		}
		
		
	}

}
