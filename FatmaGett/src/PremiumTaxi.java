import java.util.*;

public class PremiumTaxi extends Taxi{
	
	public double luxuryCharge;
	
	//constructor
	public PremiumTaxi(int licenseNumber, String model, int year, double baseFare, int maxPassengers, double luxuryCharge) throws InvalidVehicleYearException {
		super(licenseNumber, model, year, baseFare, maxPassengers);
		if(maxPassengers<1 || maxPassengers>10)
			throw new InvalidMaxPassengersException();
		this.luxuryCharge=luxuryCharge;
	}

	//upgrades the taxi with a 50% chance and gives a message
	public boolean upgrade() {
		Random r = new Random();
		if(r.nextBoolean()) {
			System.out.println("Taxi " + licenseNumber + " has been upgraded");
			return true;
		}
		else
			return false;
	}

}
