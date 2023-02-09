
public class circle extends Shape{

	private double radius;
	
	public circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String toString() {
		return "Radius["+getRadius()+"]";
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}	

	
}
