package comparing;

import java.util.*;

/**
 * Ordered from oldest to younges.
 * Eg. 2001, 2002, 2003, etc.
 */
public class CarYearComparator implements Comparator<Car> {

	public int compare(Car car1, Car car2) {
		return car1.year - car2.year;
	}
}
