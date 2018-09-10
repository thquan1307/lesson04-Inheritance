package quan.dev;

public class Circle extends Shape {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return 3.14 * r *r;
	}

}
