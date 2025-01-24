package lesson7.labs.prob2;

public class Rectangle implements Polygon {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double[] getSides() {
		return new double[]{length, width, length, width};
	}
}
