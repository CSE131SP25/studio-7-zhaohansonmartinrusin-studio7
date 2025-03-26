package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	public double area() {
		double area = length * width;
		return area;
	}
	public double perimeter() {
		double perimeter = 2*length + 2*width;
		return perimeter;
	}
	public boolean isSquare() {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	} 
	public boolean isBigger(Rectangle rectangle2) {
		if (area() > rectangle2.area()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (4, 6);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		Rectangle r2 = new Rectangle (7, 7);
		System.out.println(r2.isSquare());
		System.out.println(r2.isBigger(r1));
	}

}
