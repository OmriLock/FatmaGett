import java.util.*;
public class Company {

	public Vector <Customer> customers = new Vector<Customer>();
	public Vector<Vehicle> vehicles = new Vector<Vehicle>();
	public Vector<ServiceEmployee> serviceEmployees = new Vector<ServiceEmployee>();
	public Vector<Driver> drivers = new Vector<Driver>();
	
	public void addCustomer(Customer c) {
		this.customers.add(c);
	}
	
	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
	}
	
	public void addSerivceEmployee(ServiceEmployee se) {
		this.serviceEmployees.add(se);
	}
	
	public void addDriver(Driver driver) {
		this.drivers.add(driver);
	}
	
	public boolean serviceForCustomer(int customerID, String serviceType, String serviceArea, double distance) {
		int numOfCustomer=this.customers.size();
		boolean customerExists=false;
		Customer c;
		Driver driver;
		for(int i=0; i<numOfCustomer;i++) {
			if(customerID==customers.elementAt(i).ID) {
				customerExists=true;
				c=customers.elementAt(i);
			}
		}
		if(!customerExists)
			throw new CustomerDoesntExistException();
		
	}
	
}
