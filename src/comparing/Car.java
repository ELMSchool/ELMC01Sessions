package comparing;

public class Car implements Comparable<Car> {
	public int mileage;
	public double price;
	public int year;
	public String make;
	public String model;
	public int daysOnLot;

	public Car( int mileage, double price,
			int year, String make, String model,
			int daysOnLot ) {
		this.mileage = mileage;
		this.price = price;
		this.year = year;
		this.make = make;
		this.model = model;
		this.daysOnLot = daysOnLot;
	}

	@Override
	public String toString() {
		return "Car [mileage=" + mileage 
				+ ", price=" + price 
				+ ", year=" + year 
				+ ", make=" + make 
				+ ", model=" + model
				+ ", daysOnLot=" + daysOnLot
				+ "]";
	}
	
	public int compareTo(Car otherCar) {
		return this.daysOnLot - otherCar.daysOnLot;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + daysOnLot;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + mileage;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object otherCar) {
		Car other = (Car) otherCar;
		return this.mileage == other.mileage
				&& this.price == other.price
				&& this.year == other.year;
	}
	
	
}
