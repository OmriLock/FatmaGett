import java.util.*;

public class Motorcycle extends Vehicle{

	public int maxSpeed;
	public double engineDisplacement;
	
	//constructor
	public Motorcycle(int licenseNumber, String model, int year, int maxSpeed, double engineDisplacement) throws InvalidVehicleYearException {
		super(licenseNumber, model, year);
		if(maxSpeed<0)
			throw new InvalidMaxSpeedException();
		this.maxSpeed=maxSpeed;
		this.engineDisplacement=engineDisplacement;
	}

	//calculates the driving time of a motorcycle of a given distance
	public double calculateDrivingTime(double distance) {
		Random r = new Random();
		double P = r.nextDouble(0.2)+0.6;
		return distance / (maxSpeed * P);
	}

	//get-set
	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public double getEngineDisplacement() {
		return engineDisplacement;
	}


	public void setEngineDisplacement(double engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	
	
}
