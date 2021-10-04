package ua.lviv.lgs.Task1;

public enum Months {
	DECUMBER(31, Seasons.Winter), JANUARY(31, Seasons.Winter), FEBRUARY(28, Seasons.Winter), MARCH(31, Seasons.Spring),
	APRIL(30, Seasons.Spring), MAY(31, Seasons.Spring), JUNE(30, Seasons.Summer), JULY(31, Seasons.Summer),
	AUGUST(31, Seasons.Summer), SEPTEMBER(30, Seasons.Autumn), OCTOMBER(30, Seasons.Autumn),
	NOVEMBER(31, Seasons.Autumn);

	Seasons season;
	int day;

	Months(int day, Seasons season) {
		this.season = season;
		this.day = day;
	}

	public Seasons getSeason() {
		return season;
	}

	public int getDay() {
		return day;
	}
}
