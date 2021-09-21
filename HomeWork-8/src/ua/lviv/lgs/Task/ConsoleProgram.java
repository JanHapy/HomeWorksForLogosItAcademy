package ua.lviv.lgs.Task;

import java.util.Scanner;

public class ConsoleProgram {

	static void menu() {
		System.out.println("Enter 1, to check whether such a continent exists");
		System.out.println("Enter 2, to see all months with the same time of year");
		System.out.println("Enter 3, to see all months with the same days");
		System.out.println("Enter 4, to see all months that have fewer days");
		System.out.println("Enter 5, to see all months that have more days");
		System.out.println("Enter 6, to see next season");
		System.out.println("Enter 7, to see previous season");
		System.out.println("Enter 8, to see all months, with an even number of days.");
		System.out.println("Enter 9, to see all months, with an odd number of days.");
		System.out.println("Enter 10, to see whether the month entered from the console has an even number of days.");
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Months[] arrayOfMonths = Months.values();
		Seasons[] arraySeasons = Seasons.values();

		while (true) {
			menu();

			switch (sc.next()) {

			case "1": {
				System.out.println();
				System.out.println("Enter month: ");
				String month = sc.next().toUpperCase();

				boolean flag = isMonthExist(arrayOfMonths, month);
				System.out.println();

				if (!flag) {
					System.out.println("You enter uncorect month");
					System.out.println();
				}
				break;
			}

			case "2": {
				System.out.println();
				System.out.println("Enter time of year: ");
				String seasonSc = sc.next();
				System.out.println("Months: ");

				boolean flag = false;

				for (Months months : arrayOfMonths) {
					if (months.getSeason().name().equalsIgnoreCase(seasonSc)) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("Time of year " + seasonSc + " in next months:");

					for (Months month2 : arrayOfMonths) {
						if (month2.getSeason().toString().equalsIgnoreCase(seasonSc)) {
							System.out.println(month2);
						}
					}
					System.out.println();
				}

				if (!flag) {
					System.out.println("Wrong enter, try again.");
					System.out.println();
				}
				break;

			}

			case "3": {
				System.out.println();
				System.out.println("Enter days: ");
				int numberOfDays3 = sc.nextInt();
				System.out.println();

				boolean flag = false;

				for (Months months : arrayOfMonths) {
					if (months.getDay() == numberOfDays3) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("Count of days " + numberOfDays3 + " in next months:");
					for (Months month2 : arrayOfMonths) {
						if (month2.getDay() == numberOfDays3) {
							System.out.println(month2);
						}
					}
					System.out.println();

				}

				if (!flag) {
					System.out.println("Wrong enter, try again!");
					System.out.println();

				}
				break;
			}

			case "4": {
				System.out.println();
				System.out.println("Enter days: ");
				int numberOfDays3 = sc.nextInt();
				System.out.println();

				boolean flag = false;

				for (Months months : arrayOfMonths) {
					if (months.getDay() < numberOfDays3) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("Months with count less than " + numberOfDays3 + "days.");
					for (Months month2 : arrayOfMonths) {
						if (month2.getDay() < numberOfDays3) {
							System.out.println(month2);
						}
					}
					System.out.println();

				}

				if (!flag) {
					System.out.println("Wrong enter, try again!");
					System.out.println();

				}
				break;
			}

			case "5": {
				System.out.println();
				System.out.println("Enter count of days: ");
				int numberOfDays3 = sc.nextInt();
				System.out.println();

				boolean flag = false;

				for (Months months : arrayOfMonths) {
					if (months.getDay() > numberOfDays3) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("Months with count more than " + numberOfDays3 + "days.");
					for (Months month2 : arrayOfMonths) {
						if (month2.getDay() > numberOfDays3) {
							System.out.println(month2);
						}
					}
					System.out.println();

				}

				if (!flag) {
					System.out.println("Wrong enter, try again!");
					System.out.println();

				}
				break;
			}

			case "6": {
				System.out.println();
				System.out.println("Enter the Season");
				String season6 = sc.next();
				System.out.println();

				boolean flag = false;

				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season6)) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("The next season: ");

					Seasons season2 = Seasons.valueOf(firstUpperCase(season6.toLowerCase()));

					int ordinal = season2.ordinal();

					if (ordinal == (arraySeasons.length - 1)) {
						ordinal = 0;
						System.out.println(arraySeasons[ordinal]);
						System.out.println();

					} else {
						System.out.println(arraySeasons[ordinal + 1]);
						System.out.println();

					}
				}

				if (!flag) {
					System.out.println("Wrong enter, try again!");
					System.out.println();

				}
				break;
			}

			case "7": {
				System.out.println();
				System.out.println("Enter the Season");
				String season7 = sc.next();
				System.out.println();

				boolean flag = false;

				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season7)) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("The previos season was: ");

					Seasons season2 = Seasons.valueOf(firstUpperCase(season7.toLowerCase()));

					int ordinal = season2.ordinal();

					if (ordinal == 0) {
						ordinal = (arraySeasons.length - 1);
						System.out.println(arraySeasons[ordinal]);
						System.out.println();
					} else {
						System.out.println(arraySeasons[ordinal - 1]);
						System.out.println();
					}
				}

				if (!flag) {
					System.out.println("Wrong enter, try again!");
					System.out.println();
				}
				break;
			}

			case "8": {
				System.out.println();
				System.out.println("Enter '0'(zero).");
				int evenNumber = sc.nextInt();
				System.out.println();

				boolean flag = false;

				for (Months months : arrayOfMonths) {
					if (months.getDay() % 2 == evenNumber) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("Months with even number of days: " + evenNumber + ".");
					for (Months month2 : arrayOfMonths) {
						if (month2.getDay() % 2 == evenNumber) {
							System.out.println(month2);
						}
					}
					System.out.println();
				}

				if (!flag) {
					System.out.println("Wrong enter, try again!");
					System.out.println();
				}
				break;
			}

			case "9": {
				System.out.println();
				System.out.println("Enter '1'(one).");
				int evenNumber = sc.nextInt();
				System.out.println();

				boolean flag = false;

				for (Months months : arrayOfMonths) {
					if (months.getDay() % 2 == evenNumber) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("Months with odd number of days: " + evenNumber + ".");
					for (Months month2 : arrayOfMonths) {
						if (month2.getDay() % 2 == evenNumber) {
							System.out.println(month2);
						}
					}
					System.out.println();
				}

				if (!flag) {
					System.out.println("Wrong enter, try again!");
					System.out.println();
				}
				break;
			}

			case "10": {
				System.out.println();
				System.out.println("Enter months:");
				String month = sc.next();
				System.out.println();

				boolean flag = false;

				for (Months months : arrayOfMonths) {
					if (months.name().equalsIgnoreCase(month)) {
						if (months.getDay() % 2 == 0) {
							flag = true;
						}
					}
				}

				if (flag) {
					System.out.println("This month have an even number of days " + month + ".");
					System.out.println();
				}

				if (!flag) {
					System.out.println("This month haven't an even number of days");
					System.out.println();
				}
				break;

			}

			}

		}

	}

	private static boolean isMonthExist(Months[] arrayOfMonths, String month) {
		boolean flag = false;

		for (Months months : arrayOfMonths) {
			if (months.name().equals(month)) {
				System.out.println("This month is exist!");
				flag = true;
			}
		}
		return flag;
	}

	static String firstUpperCase(String string) {
		if (string == null || string.isEmpty()) {
			return string;
		} else {
			return string.substring(0, 1).toUpperCase() + string.substring(1);
		}
	}

}
