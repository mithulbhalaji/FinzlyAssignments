package shape;

public class Main {
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		
		Shape r = new Rectangle(12,22);
		Shape t = new Triangle(1,2,3);
		Shape c = new Circle(3.2);
		
		shapes[0] = r;
		shapes[1] = t;
		shapes[2] = c;
		
		for(Shape s : shapes) {
			s.calculateArea();
			s.calculatePerimeter();
		}
		
	}
}
