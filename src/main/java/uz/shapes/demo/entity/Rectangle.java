package uz.shapes.demo.entity;

public class Rectangle implements Shape{

	private double sideA;
	
	private double sideB;

	@Override
	public double surface() {
		return getSideA() * getSideB() ;
	}
	
	@Override
	public double perimeter() {
		return 2 * getSideA() * getSideB();
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	
	
}
