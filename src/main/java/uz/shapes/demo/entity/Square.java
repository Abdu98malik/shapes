package uz.shapes.demo.entity;

public class Square implements Shape{

	private double side;
	
	@Override
	public double surface() {
		return Math.pow(getSide(), 2) ;
	}
	
	@Override
	public double perimeter() {
		return 4 * getSide();
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	
}
