package comparing;

import java.util.*;

public class CarPriceComparator implements Comparator<Car> {
	
	public int compare(Car car1, Car car2) {
		return (int) (car1.price - car2.price);
	}

}
