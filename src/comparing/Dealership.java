package comparing;

import java.util.*;

public class Dealership {

	public static void main(String[] args) {
				
		ArrayList<Car> carlot = new ArrayList<>();
		carlot.add( new Car(25000, 18599.99, 2015, "Cadillac", "CTS-4", 15) );
		carlot.add( new Car(25000, 18599.99, 2015, "Cadillac", "CTS-4", 15) );
		carlot.add( new Car(22000, 23000.00, 2012, "Lincoln", "Navigator", 8) );
		carlot.add( new Car(76699, 12000.00, 2016, "Chevrolet", "Malibu", 25) );
		carlot.add( new Car(106699, 9000.00, 2013, "Ford", "Focus", 7) );
		
		
		// which car should be attempted to be sold first
		Collections.sort( carlot );
		System.out.println( carlot.get( carlot.size() - 1 ) );
		
		
		// customer walks in asking about the cheapest car
		int whatIsTheCheapestCarsPosition = uglyWayOfFindingIndexOfCheapestCar( carlot );
		System.out.println( carlot.get( whatIsTheCheapestCarsPosition ) );
		
		Collections.sort(carlot, new CarPriceComparator());
		System.out.println( carlot.get(0) );
		
		
		// another customer walks in asking about the youngest car
		Collections.sort(carlot, new CarYearComparator());
		System.out.println( carlot.get( carlot.size() - 1));
		
		
	}
	
	
	public static int uglyWayOfFindingIndexOfCheapestCar(ArrayList<Car> cars) {
		int cheapestCarsIndex = 0;
		double cheapestPrice = cars.get(0).price;
		
		for (int i = 1; i < cars.size(); i++) {
			if (cars.get(i).price < cheapestPrice) {
				cheapestPrice = cars.get(i).price;
				cheapestCarsIndex = i;
			}
		}
		
		return cheapestCarsIndex;
	}
}
