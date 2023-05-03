
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Vehicle v = new Vehicle(1, "s", 1900);
		} catch (InvalidVehicleYearException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("fuck you");
		}

	}

}
