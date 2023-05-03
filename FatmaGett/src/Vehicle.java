
public abstract class Vehicle implements Comparable<Vehicle>{

	public int licenseNumber;
	public String model;
	public int year;
	public Driver driver;
	public int baseFare=0;
	
	//constructor
	public Vehicle(int licenseNumber, String model, int year) throws InvalidVehicleYearException {
		this.licenseNumber=licenseNumber;
		this.model=model;
		if(year>2020 || year<1970)
			throw new InvalidVehicleYearException();
		this.year=year;
	}
	
	//adds a driver to the vehicle
	//if no driver, add the given driver to the vehicle and return true
	//if already has a driver, return false
	public boolean addDriver(Driver driver) {
		if(this.driver!=null) {
			this.driver=driver;
			return true;
		}
		else
			return false;
	}
	
	public abstract double calculateDrivingTime(double distance);

	//get-set
	public int getLicenseNumber() {
		return licenseNumber;
	}


	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	//natural comparison by year
	public int compareTo(Vehicle o) {
		if(this.year>o.year)
			return 1;
		else if(o.year>this.year)
			return -1;
		else
			return 0;
	}
}
