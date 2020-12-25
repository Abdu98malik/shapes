package uz.shapes.demo.entity;

public class Triangle implements Shape{

	private double sideA;
	
	private double sideB;

	private double sideC;

	
	@Override
	public double surface() {
	
		double s = perimeter()/2;
				
		return  Math.sqrt(s * (s - getSideA())* (s - getSideB())* (s - getSideC()));
	}
	
	@Override
	public double perimeter() {
		return  getSideA() + getSideB() + getSideC();
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

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	
	
}
