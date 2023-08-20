package shape;

public class Circle implements Shape {
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public void calculateArea() {
		System.out.println("Area of circle : "+(radius*radius*3.14));
	}
	
	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of circle : "+(2*3.14*radius));
	}
}
