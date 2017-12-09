
public class ChargerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Outlet outlet = new Outlet();
			
			MobileCharger charger = new SamsungCharger();
			charger.plugIn(outlet);
			int convertedVolt = charger.get5Volt();
			System.out.println("Converted Volt by SamsungCharger: " + convertedVolt);

			charger = new AppleCharger();
			charger.plugIn(outlet);
			convertedVolt = charger.get5Volt();
			System.out.println("Converted Volt by AppleCharger: " + convertedVolt);
	}

}
