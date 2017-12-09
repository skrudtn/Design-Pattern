
public class AppleCharger implements MobileCharger {
	
	Outlet outlet;

	@Override
	public void plugIn(Outlet outlet) {
		// TODO Auto-generated method stub
		this.outlet = outlet;
	}

	@Override
	public int get5Volt() {
		// TODO Auto-generated method stub
		return appleConvertTech(outlet.getVolt());
	}
	private int appleConvertTech(int outletVolt) {
		switch(outletVolt) {
			case 220:
				return 5;
			case 110:
				return 5;
			default:
				return 2;
		}
	}
	
}
