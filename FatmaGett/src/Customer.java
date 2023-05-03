import java.util.*;
public class Customer {
	
	protected int ID;
	protected String name;	
	protected int age;	
	protected char gender;	
	protected double totalExpenses;
	
	public Customer(int ID, String name, int age, char gender) throws Exception {
		
		this.ID=ID;
		this.name=name;
		this.age=age;
		if (gender!='M' && gender!='F' && gender!='U') {
			throw new invalidGenderException();
		}
		this.gender=gender;
		
	}
	public int giveRating() {
		Random r= new Random();
		return r.nextInt(5)+1;
		
	}
	public double pay(double time, double Fare) {
		double pay= ((2*time) + Fare);
		totalExpenses= totalExpenses+ pay;
		return pay;
		
	}


}