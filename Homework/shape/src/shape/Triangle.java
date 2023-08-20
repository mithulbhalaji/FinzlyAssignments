package shape;

public class Triangle implements Shape{
	private double s1;						//side one
	private double s2;						//side two
	private double s3;						//side three
	
	
	
	public Triangle(double s1, double s2, double s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	@Override
	public void calculateArea() {
		double halfPeri = (s1+s2+s3)/2;
		double area = Math.sqrt(halfPeri * (halfPeri-s1) * (halfPeri-s2) * (halfPeri-s3));
		System.out.println("Area of triangle : "+ area);
	}
	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of triangle : "+ (s1+s2+s3));
	}
	
	
}
