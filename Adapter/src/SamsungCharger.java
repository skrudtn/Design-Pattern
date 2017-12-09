import javax.swing.text.StyleContext.SmallAttributeSet;

public class SamsungCharger implements MobileCharger{
	Outlet outlet;

	@Override
	public void plugIn(Outlet outlet) {
		// TODO Auto-generated method stub
		this.outlet = outlet;
	}

	@Override
	public int get5Volt() {
		// TODO Auto-generated method stub
		return samsungConvertTech(outlet.getVolt());
	}
	
	private int samsungConvertTech(int outletVolt) {
		int newVolt = outletVolt;
		while(newVolt != 5) {
			newVolt -= 1;
		}
		return newVolt;
	}
	

}
