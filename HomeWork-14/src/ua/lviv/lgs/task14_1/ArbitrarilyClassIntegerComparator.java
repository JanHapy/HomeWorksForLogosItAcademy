package ua.lviv.lgs.task14_1;

import java.util.Comparator;

public class ArbitrarilyClassIntegerComparator implements Comparator <ArbitrarilyClass> {
	
	public int compare(ArbitrarilyClass o1, ArbitrarilyClass o2) {
		if (o1.getInteger() > o2.getInteger()) {
			return 1;
		} else if (o1.getInteger() < o2.getInteger()) {
			return -1;
		}
		return 0;
	}

}
