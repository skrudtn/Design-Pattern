
public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		// TODO Auto-generated method stub
		System.out.println("Building Pillars with Wood coating");
	}

	@Override
	public boolean customerWantsNoWindows() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
