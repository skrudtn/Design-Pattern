
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawing drawing = new Drawing();
		
		Shape s = new Circle();
		drawing.add(s);
		s = new Rectangle();
		drawing.add(s);
		s= new Triangle();
		drawing.add(s);
		
		drawing.draw("red");
		drawing.draw("blue");
	}

}
