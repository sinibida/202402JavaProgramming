
class Circle {
	public static final double PI = 3.141592;
	public static double getArea(double radius) {
		return radius * radius * PI;
	}
	public static double getLength(double radius) {
		return 2 * radius * PI;
	}
}

public class Car {

	public static void main(String[] args) {
		
		double radius = 10.0;
		
		double area = Circle.getArea(radius);
		double circum = Circle.getLength(radius);
		
		System.out.println("원의 면적 = " + area);
		System.out.println("원의 둘레 = " + circum);
	}

}
