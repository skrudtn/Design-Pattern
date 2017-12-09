
public class GlassHouse  extends HouseTemplate{

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		// TODO Auto-generated method stub
		System.out.println("Building Pillars with Glass coating");
	}

	@Override
	public boolean customerWantsNoWindows() {
		// TODO Auto-generated method stub
		return false;
	}

}
