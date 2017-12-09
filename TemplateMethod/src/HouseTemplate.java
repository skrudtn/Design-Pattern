
public abstract class HouseTemplate {
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		if(!customerWantsNoWindows()) {
		buildWindows();
		}
		System.out.println("House is built.");
	}
	
	private void buildWindows() {
		System.out.println("Building glass Windows");
	}
	
	public abstract void buildWalls();
	public abstract void buildPillars();
	
	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}
	public abstract boolean customerWantsNoWindows();
}
