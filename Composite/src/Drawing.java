import java.util.*;

public class Drawing implements Shape{
	
	private List<Shape> shapes = new ArrayList<Shape>();

	@Override
	public void draw(String fillcolor) {
		// TODO Auto-generated method stub
		for(Shape s: shapes) {
			s.draw(fillcolor);
		}
	}
	
	public void add(Shape s) {
		this.shapes.add(s);
	}
	
	public void remove(Shape s) {
		this.shapes.remove(s);
	}
	
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
	
}
