import java.util.*;
public  class Driver {

	public int ID;
	public String name;
	public String phoneNumber;
	public String [] licenses = new String [2];
	public double rating;
	public int rateAmount;
	public double totalRating;

	public Driver(int ID, String name, String phoneNumber, double rating, String [] licenses) throws WrongLicensesException {

		this.ID=ID;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.rating=rating;
		if (!containsAB(licenses)) 
			throw new WrongLicensesException();
		this.licenses=licenses;


	}
	
	public double drivingProfit(Customer c, int time, Vehicle v) {
		int ratingGiven=c.giveRating();
		updateRating(ratingGiven);
		Random r = new Random();
		Double P = r.nextDouble(0.5)+0.5;
		return (c.pay(time, v.baseFare) + rating) - (time*P);
	}
	
	public void updateRating(double rating) {
		rateAmount++;
		totalRating+=rating;
		this.rating=totalRating/rateAmount;
	}

	private static boolean containsAB(String[] licenses) {

		for (String s : licenses) {
			if (s.contains("A") || s.contains("B")) {
				return true;
			}
		}
		return false;
	}

}
