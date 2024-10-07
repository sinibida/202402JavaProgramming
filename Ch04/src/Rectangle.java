import java.util.Scanner;

public class Rectangle {
	double width;
	double height;
	
	public double getArea() {
		return width * height;
	}

	public double getLength() {
		return (width + height) * 2;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.println("Area: " + rect.getArea());
		System.out.println("Leng: " + rect.getLength());
	}
}
