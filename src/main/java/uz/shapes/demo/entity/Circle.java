package uz.shapes.demo.entity;

public class Circle implements Shape{

	private double radius;
	
	@Override
	public double surface() {
		return Math.pow(getRadius(), 2) * Math.PI;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * getRadius();
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
}
