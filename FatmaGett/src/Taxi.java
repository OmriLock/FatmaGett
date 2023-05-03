import java.util.Random;

public class Taxi extends Vehicle{
	
	public double baseFare;
	public int maxPassengers;

	//constructor
	public Taxi(int licenseNumber, String model, int year, double baseFare, int maxPassengers) throws InvalidVehicleYearException{
		super(licenseNumber, model, year);
		this.baseFare=baseFare;
		if(maxPassengers<1 || maxPassengers>4)
			throw new InvalidMaxPassengersException();
		this.maxPassengers=maxPassengers;
	}
	
	//calculates the driving time of a taxi of a given distance
	public double calculateDrivingTime(double distance) {
		Random r = new Random();
		double P = r.nextDouble(0.2)+0.5;
		return (distance / (100 * P))+2;
	}

	//get-set
	public double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	

}
